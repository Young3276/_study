#include <stdio.h>
#include <stdlib.h>

int INT_MIN=-1;
struct Stack{
	int data;
	struct Stack* next;
}*top;

struct Stack* CreateStack(){
	return NULL;
}

void Push(struct Stack **top, int data){
	struct Stack *temp;
	temp=(struct Stack*)malloc(sizeof(struct Stack));
	if(!temp){
		printf("Memory Error!\n");
		return;
	}
	temp->data=data;
	temp->next=*top;
	*top=temp;
}

int IsEmptyStack(struct Stack **top){
	return *top==NULL;
}

int Pop(struct Stack **top){
	int data;
	struct Stack *temp;
	if(IsEmptyStack(top))
		return INT_MIN;
	temp=*top;
	*top=(*top)->next;
	data=temp->data;
	free(temp);
	return data;
}

int Top(struct Stack **top){
	if(IsEmptyStack(top)){
		return INT_MIN;
	}else{
		return (*top)->data;
	}
}

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

void ConfirmStack(struct Stack **top){
	struct Stack *temp=*top;
	while(temp){
		printf("%d ", temp->data);
		temp=temp->next;
	}
	printf("\n");
}

int main(int argc, char* argv[]){
	struct Stack *S;
	int bnt;
	int num, data, flag;
	printf("==== STACK PRAC ====\n");
	printf("1. push\n");
	printf("2. pop\n");
	printf("3. top\n");
	printf("4. confirm(IsEmptyStack)\n");
	printf("5. confirm(ConfirmStack)\n");
	printf("6. delete(DeleteStack)\n");
	
	S=CreateStack();
	bnt=1;
	while(1){
		printf("Input num : ");
		scanf("%d", &num);
		switch(num){
			case 1:
				if(bnt==0){
					S=CreateStack();
					printf("Input data : ");
					scanf("%d", &data);
					Push(&top, data);

				}else{
					printf("Input data : ");
					scanf("%d", &data);
					Push(&top, data);
				}
				break;
			case 2:
				data=Pop(&top);
				if(data==-1)
					printf("Stack is Empty!\n");
				else
					printf("data : %d\n", data);
				break;
			case 3:
				data=Top(&top);
				if(data==-1)
					printf("Stack is Empty!\n");
				else
					printf("data : %d\n", data);
				break;
			case 4:
				flag=IsEmptyStack(&top);
				if(flag)
					printf("Stack is Empty!\n");
				else
					printf("Stack is not Empty!\n");
				break;
			case 5:
				ConfirmStack(&top);
				break;
			case 6:
				if(bnt==1){
					DeleteStack(&top);
					bnt=0;
					printf("Delete Stack Compeleted!\n");			
				}else{
					printf("Stack is already Deleted!\n");
				}
				break;
		}
	}

	return 0;
}
