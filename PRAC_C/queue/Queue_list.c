#include <stdio.h>
#include <stdlib.h>

struct ListNode{
	int data;
	struct ListNode* next;
};

struct Queue{
	struct ListNode *front;
	struct ListNode *rear;
};

struct Queue *CreateQueue(){
	struct Queue *Q;
	struct ListNode *temp;
	Q=(struct Queue*)malloc(sizeof(struct Queue));
	if(!Q){
		printf("Memory Error!\n");
		return;
	}
	Q->front=Q->rear=NULL;
	return Q;
}

int IsEmptyQueue(struct Queue *Q){
	return (Q->front==NULL);
}

void EnQueue(struct Queue *Q, int data){
	struct ListNode *newNode;
	newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
	if(!newNode){
		printf("Memory Error!\n");
		return;
	}
	newNode->data=data;
	newNode->next=NULL;
	if(Q->rear)
		Q->rear->next=newNode;
	Q->rear=newNode;
	if(Q->front==NULL)
		Q->front=Q->rear;
}

int DeQueue(struct Queue *Q){
	int data;
	struct ListNode *temp;
	if(IsEmptyQueue(Q)){
		printf("Queue is Empty!\n");
		return;
	}else{
		temp=Q->front;
		data=Q->front->data;
		Q->front=Q->front->next;
		free(temp);
	}
	return data;
}

void Delete(struct Queue *Q){
	struct ListNode *temp=Q->front;
	struct ListNode *temp2;
	while(temp){
		temp2=temp->next;
		free(temp);
		temp=temp2;
	}
	free(Q);
}

void ConfirmQueue(struct Queue *Q){
	struct ListNode* i=Q->front;
	struct ListNode* j=Q->rear;
	while(i){
		printf("%d ", i->data);
		i=i->next;
	}
	printf("\n");
}

int main(int argc, char* argv[]){

	struct Queue *Q;
	int num, data;
	int flag=0;
	Q=CreateQueue();
	flag=1;
	printf("=====Queue Menu=====\n");
	printf("1.EnQueue\n");
	printf("2.DeQueue\n");
	printf("3.ConfirmQueue\n");
	printf("4.DeleteQueue\n");
	printf("5.exit\n");
	printf("====================\n");
	
	while(1){
		printf("Input num : ");
		scanf("%d", &num);
		switch(num){
			case 1:
				if(flag==0)
					CreateQueue();
				printf("Input Data : ");
				scanf("%d", &data);
				EnQueue(Q,data);
				break;
			case 2:
				data=DeQueue(Q);
				printf("data : %d\n", data);
				break;
			case 3:
				ConfirmQueue(Q);
				break;
			case 4:
				if(flag!=1){
					printf("Already Deleted!\n");
				}else{
					Delete(Q);
					flag=0;
				}
				break;
			case 5:
				exit(1);
				break;
		}
	}
	return 0;
}
