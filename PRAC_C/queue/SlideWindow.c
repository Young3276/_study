#include <stdio.h>
#include <stdlib.h>

struct ListNode{
	int data;
	struct ListNode *next;
};

struct Queue{
	struct ListNode *front;
	struct ListNode *rear;
};

struct Queue* CreateQueue(){
	struct Queue *Q=(struct Queue*)malloc(sizeof(struct Queue));
	if(!Q){
		printf("Memory Error!\n");
		return;
	}
	Q->front=Q->rear=NULL;
	return Q;
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

void DeQueue(struct Queue *Q){
	struct ListNode *temp;
	temp=Q->front;
	Q->front=temp->next;
	free(temp);	
}

int maxSearch(struct Queue *Q){
	int max=-9999;
	struct ListNode *i=Q->front;
	while(i){
		printf("%d\t", i->data);
		max=(max>i->data)?max:i->data;
		i=i->next;
	}
	return max;
}

int main(int argc, char* argv[]){
	if(argc==1){
		printf("%s <sentence>\n", argv[0]);
		printf("<sentence> : 3 2 1 4 5 10 ....\n");
		exit(1);
	}
	int size=-1;
	int count=1;
	int i;
	struct Queue *Q;
	printf("argc : %d\n", argc);
	if(size==-1){
		printf("Input Window Size : ");
		scanf("%d", &size);
		Q=CreateQueue();
	}

	while(count<=argc-1){
		if(count>=size){
			EnQueue(Q, atoi(argv[count]));
			printf("\t result : %d\n", maxSearch(Q));
			DeQueue(Q);
		}else{

			EnQueue(Q, atoi(argv[count]));
		}
		count++;
	}
	return 0;
}

