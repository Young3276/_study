#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char* shuffling(char* msg){
	int i=0;
	int j=0;
	int len=strlen(msg);
	printf("len : %d\n", len);
	int length=(len+1)/2;
	char *temp1 = (char*)malloc(sizeof(char)*((len+1)/2));
	char *temp2 = (char*)malloc(sizeof(char)*((len+1)/2));


	for(i=0; i<(len+1)/2; i++){
		temp1[i]=msg[j++];
	}
	for(i=0; i<(len+1)/2; i++){
		temp2[i]=msg[j++];
	}

	printf("temp1 : %s\n", temp1);
	printf("temp2 : %s\n", temp2);
	j=0;
	for(i=0; i<length; i++){
		msg[j++]=temp1[i];
		msg[j++]=temp2[i];
	}

	free(temp1);
	free(temp2);

	return msg;
}

int main(int argc, char* argv[]){

	if(argc != 2){
		printf("Usage : %s <msg>\n", argv[0]);
		return 0;
	}

	int count, i;
	char *msg=argv[1];

	printf("Input shuffle count : ");
	scanf("%d", &count);

	for(i=0; i<count; i++){
		msg = shuffling(msg);
	}
	printf("Result : %s\n", msg);

	return 0;
}
