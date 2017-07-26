#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct DynArrayQueue{
	int front, rear;
	int capacity;
	int *array;
};

struct DynArrayQueue *CreateDynQueue(){
	struct DynArrayQueue *Q=(struct DynArrayQueue*)malloc(sizeof(struct DynArrayQueue));
	if(!Q){
		printf("Memory Error!\n");
		return NULL;
	}
	Q->capacity=1;
	Q->front=Q->rear=-1;
	Q->array=(int*)malloc(Q->capacity*sizeof(int));
	if(!Q->array)
		return NULL;
	return Q;
}

int IsEmptyQueue(struct DynArrayQueue *Q){
	return (Q->front == -1);	// rear==front -> -1로 설정
}

int IsFullQueue(struct DynArrayQueue *Q){
	return (((Q->rear+1)%(Q->capacity)) == Q->front);
}

int QueueSize(struct DynArrayQueue *Q){
	return (Q->capacity - Q->front + Q->rear +1)% Q->capacity;
}

void ResizeQueue(struct DynArrayQueue *Q){
	int i;
	int size = Q->capacity;
	Q->capacity=Q->capacity*6;
	Q->array=(int*)realloc(Q->array, Q->capacity);
	if(!Q->array){
		printf("Memory Error!\n");
		return;
	}

	if(Q->front > Q->rear){
		for(i=0; i<Q->front; i++){
			Q->array[i+size]=Q->array[i];
		}
		Q->rear=Q->rear+size;
	}
}

void EnQueue(struct DynArrayQueue *Q, int data){
	if(IsFullQueue(Q))
		ResizeQueue(Q);
	Q->rear=(Q->rear+1)%Q->capacity;
	Q->array[Q->rear]=data;
	if(Q->front==-1)
		Q->front=Q->rear;
}


int DeQueue(struct DynArrayQueue *Q){
	int data=0;
	if(IsEmptyQueue(Q)){
		printf("Queue is Empty!\n");
		return;
	}else{
		data=Q->array[Q->front];
		/* What is mean? */
		if(Q->front==Q->rear)
			Q->front=Q->rear=-1;
		else
			Q->front=(Q->front+1)%Q->capacity;
	}
	return data;
}

void DeleteQueue(struct DynArrayQueue *Q){
	if(Q){
		if(Q->array)
			free(Q->array);
		free(Q);
	}
}

void ConfirmQueue(struct DynArrayQueue *Q){
	int i;
	int j=Q->rear;
	for(i=Q->front; i<=j; i++){
		printf("%d ", Q->array[i]);
	}
	printf("\n");	
}

void QueuePointerConfirm(struct DynArrayQueue *Q){
	printf("capacity Pointer : %d\n", Q->capacity);
	printf("front Pointer : %d\n", Q->front);
	printf("rear Pointer : %d\n", Q->rear);
}


int main(int argc, char* argv[]){

	struct DynArrayQueue *Q;
	int num, data, size;
	printf("Queue Creation!\n");
	Q=CreateDynQueue();

	printf("=====Queue Menu=====\n");
	printf("1. EnQueue\n");
	printf("2. DeQueue\n");
	printf("3. ConfirmQueue\n");
	printf("4. QueueSize\n");
	printf("5. QueuePointerConfirm\n");
	printf("6. DeleteQueue\n");
	printf("7. exit\n");
	printf("====================\n");

	while(1){
		printf("Input Number : ");
		scanf("%d", &num);
		switch(num){
			case 1:
				printf("Input Data : ");
				scanf("%d", &data);
				EnQueue(Q, data);
				break;
			case 2:
				DeQueue(Q);
				break;
			case 3:
				ConfirmQueue(Q);
				break;
			case 4:
				size=QueueSize(Q);
				printf("Queue's Size : %d\n", size);
				break;
			case 5:
				QueuePointerConfirm(Q);
				break;
			case 6:
				DeleteQueue(Q);
				break;
			case 7:
				exit(1);
				break;
		}
	}
	return 0;
}
