#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char* shuffling(char* msg){
	static int count=1;
	int i=0, j=1;
	int len = strlen(msg);
	int diff=len/2;
	char* temp=(char*)malloc(sizeof(char*)*len);

	for(i=0; i<len; i++){
		if(i<diff){
			temp[i*2]=msg[i];
		}else{
			temp[i-diff+j]=msg[i];
			j++;
		}
	}

	printf(" == count %d ==\n", count);
	strncpy(msg,temp,len);
	for(i=0; i<len; i++){
		printf("%c ", msg[i]);
	}
	printf("\n");
	
	free(temp);
	count++;
	return msg;
}

int main(int argc, char* argv[]){
	
	if(argc!=2){
		printf("Usage : %s <msg>\n", argv[0]);
		return 0;
	}
	int i, num;	
	char* msg=argv[1];
	printf("Input shuffling count Num : ");
	scanf("%d", &num);
	
	for(i=0; i<num; i++){
		msg=shuffling(msg);
	}
	return 0;
}
