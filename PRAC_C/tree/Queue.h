struct ListNode{
	struct BinaryTreeNode *ptr;
	struct ListNode *next;
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
		printf("Memory Error Queue!\n");
		return;
	}
	temp=(struct ListNode*)malloc(sizeof(struct ListNode));
	Q->rear=NULL;
	Q->front=NULL;
	return Q;
}

int IsEmptyQueue(struct Queue *Q){
	return (Q->front == NULL);	
}

void EnQueue(struct Queue *Q, struct BinaryTreeNode *ptr){
	struct ListNode *newNode;
	newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
	if(!newNode){
		printf("Memory Error ListNode\n");
		return;
	}
	newNode->ptr=ptr;
	newNode->next=NULL;
	if(Q->rear)
		Q->rear->next=newNode;
	Q->rear=newNode;
	if(Q->front=NULL)
		Q->front=Q->rear;
}

struct BinaryTreeNode* DeQueue(struct Queue *Q){
	struct BinaryTreeNode *ptr;
	struct ListNode *temp;
	if(IsEmptyQueue(Q)){
		printf("Queue is Empty!\n");
		return;
	}else{
		temp=Q->front;
		ptr=Q->front->ptr;
		Q->front=Q->front->next;
		free(temp);
	}
	return ptr;
}

void DeleteQueue(struct Queue *Q){
	struct ListNode *temp=Q->front;
	struct ListNode *temp2;
	while(temp){
		temp2=temp->next;
		free(temp);
		temp=temp2;
	}
	free(Q);
}

