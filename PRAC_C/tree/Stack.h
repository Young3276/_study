struct Stack{
	struct BinaryTreeNode *ptr;
	struct Stack *next;
}*top;

struct Stack *CreateStack(){
	return NULL;
}

void Push(struct Stack **top, struct BinaryTreeNode *ptr){
	struct Stack *temp;
	temp=(struct Stack*)malloc(sizeof(struct Stack));
	if(!temp){
		printf("Memory Error StackNode!\n");
		return;
	}
	temp->ptr=ptr;
	temp->next=*top;
	*top=temp;
}

int IsEmptyStack(struct Stack **top){
	return *top==NULL;
}

struct BinaryTreeNode* Pop(struct Stack **top){
	struct BinaryTreeNode *ptr;
	struct Stack *temp;
	if(IsEmptyStack(top)){
		return ;
	}
	temp=*top;
	*top=(*top)->next;
	ptr=temp->ptr;
	free(temp);
	return ptr;
}
/*
void ConfirmStack(struct Stack **top){
	struct Stack *temp=*top;
	while(temp){
		printf("%d ", temp->ptr->data);
		temp=temp->next;
	}
	printf("\n");
}
*/
void DeleteStack(struct Stack **top){
	struct Stack *temp, *p;
	p=*top;
	while(p->next){
		temp=p->next;
		p->next=temp->next;
		free(temp);
	}	
	free(p);
}

