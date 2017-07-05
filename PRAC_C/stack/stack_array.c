#include <stdio.h>
#include <stdlib.h>

struct ArrayStack{
	int top;
	int capacity;
	int *array;
};

struct ArrayStack* createStack(){
	struct ArrayStack* S=malloc(sizeof(struct ArrayStack));
	if(!S){
		printf("Memory Error!\n");
		return NULL;
	}
	S->capacity=1;
	S->top=-1;
	S->array=malloc(S->capacity*sizeof(16)); //Memory Allocation Size Decision
	if(!S->array){
		printf("Memory Error!\n");
		return NULL;
	}
	return S;		
}

int IsEmptyStack(struct ArrayStack* S){
	return (S->top==-1);
}

int IsFullStack(struct ArrayStack* S){
	return (S->top==S->capacity*sizeof(16)-1);
}

void Push(struct ArrayStack *S, int data){
	if(IsFullStack(S))
		printf("Stack Overflow!\n");
	else
		S->array[++S->top]=data;

	printf("S->top : %d\n", S->top);
}

int Pop(struct ArrayStack *S){
	if(IsEmptyStack(S)){
		return NULL;
	}
	else{
		return (S->array[S->top--]);	//What is mean?
	}
}

void DeleteStack(struct ArrayStack* S){
	if(S){
		if(S->array)
			free(S->array);
		free(S);
	}
}
void ConfirmStack(struct ArrayStack* S){
	int i;
	for(i=0; i<=S->top;i++){
		printf("%d ", S->array[i]);
	}
	printf("\n");
}

int main(int argc, char* argv[]){

	struct ArrayStack* S;
	int num,data,pop;
	printf("==== STACK PRAC ====\n");
	printf("1. push\n");
	printf("2. pop\n");
	printf("3. confirm(IsEmptyStack)\n");
	printf("4. confirm(IsFullStack)\n");
	printf("5. delete(DeleteStack)\n");
	printf("6. confirm(ConfimStack)\n");
	S=createStack();

	while(1){
		printf("Input num : ");
		scanf("%d", &num);
		switch(num){
			case 1:
				printf("Input data : ");
				scanf("%d", &data);
				Push(S, data);							
				break;
			case 2:
				pop=Pop(S);
				if(pop=='\0')
					printf("Stack Is EmpTY!\n");
				else
					printf("Result Pop : %d\n", pop);
				break;
			case 3:
				if(IsEmptyStack(S))
					printf("Stack is Empty\n");
				else
					printf("Stack is not Empty\n");
				break;
			case 4:
				if(IsFullStack(S))
					printf("Stack is Full\n");
				else
					printf("Stack is not Full\n");
				break;
			case 5:
				DeleteStack(S);
				printf("Delete Stack Completed!\n");
				break;
			case 6:
				ConfirmStack(S);
				break;
		}
	}

	return 0;
}
