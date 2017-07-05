#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct Stack{
	char ch;
	struct Stack *next;
}*top;

struct Stack *CreateStack(){
	return NULL;
}

void Push(struct Stack **top){

}

char Pop(struct Stack **top){
	char data;
	return data;
}

int main(int argc, char* argv[]){

	if(argc!=2){
		printf("usage : %s <arithmetic operation>\n", argv[0]);
		exit(1);
	}
	struct Stack *S;
	char ch;
	int i=0;
	S=CreateStack();
	while(ch=(*(*(argv+1)+i))!='\0'){
		//
		printf("argv[1][%d] : %c\n", i, argv[1][i]);
		i++;
	}
	return 0;
}
