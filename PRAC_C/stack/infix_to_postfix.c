#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct Stack{
	char data;
	struct Stack *next;
}*top;

struct Stack *CreateStack(){
	return NULL;
}

void Push(struct Stack **top, char data){
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

char Pop(struct Stack **top){
	char data;
	struct Stack *temp;
	temp=*top;
	*top=temp->next;
	data=temp->data;
	free(temp);
	return data;
}

void ConfirmStack(struct Stack **top){
	struct Stack *temp=*top;
	while(temp){
//		printf("3333: %c\n",temp->data);
		temp=temp->next;
	}
}
int main(int argc, char* argv[]){
	if(argc!=2){
		printf("usage : %s <arithmetic operation>\n", argv[0]);
		exit(1);
	}
	struct Stack *S;
	char ch,data;
	int flag; //연산자=1 & 피연산자=0 플래그
	int i=0;
	S=CreateStack();
	/* 받은 수식열 문자단위로 체크 */
	while((ch=(*(*(argv+1)+i)))!='\0'){
		ConfirmStack(&top);
		if(!(ch>=40 && ch<=47)){
			// 피연산자일 경우 출력
			printf("%c\n", ch);
		}else if(ch==41){	// ---> ')'
			do{
				data=Pop(&top);
			}while(data!=40);
	/*		while(1){
				data=Pop(&top);
				printf("avvvvvv\n");
				if(data==40)
					break;
				else
					printf("2222: %c", data);
			}
	*/
		}else{
			while(top!='\0'){
				data=Pop(&top);
				printf("%c\n", data);
			}		
			Push(&top, ch);
		}
	//	printf("argv[1][%d] : %c   %d\n", i, argv[1][i], ch);
		i++;
	}
	return 0;
}
