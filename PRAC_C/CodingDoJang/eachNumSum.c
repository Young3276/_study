#include <stdio.h>
#include<stdlib.h>
#include <string.h>

int main(int argc, char* argv[]){
	int arr[10]={0, };
	int i,j;
	char ptr[5]={'\0', };

	for(i=1; i<=1000; i++){
		sprintf(ptr,"%d",i);
		j=0;
		while(ptr[j]!='\0'){
			arr[ptr[j]-48]++;
			j++;
		}
		for(j=0; j<5; j++){
			ptr[j]='\0';
		}
	}

	for(i=0; i<10; i++){
		printf("%d count : %d\n", i, arr[i]);
	}
}
