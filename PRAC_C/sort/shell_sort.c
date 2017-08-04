#include<stdio.h>
#include<stdlib.h>

void tracer(int* num, int len){
	int i;
	for(i=0; i<len; i++){
		printf("%d\t", num[i]);
	}
	printf("\n\n");
}

void shell_sort(int* num, int len){
	int i,j,m, tempINT;
	int k=len;
	do{
		k=k/3+1;
		printf("interval k = %d\n", k);
		for(m=0; m<k; m++){
			for(i=m+k; i<len; i+=k){
				tempINT=num[i];
				for(j=i-k; num[j]>tempINT && j>=0; j-=k){
					num[j+k]=num[j];
				}
				num[j+k]=tempINT;
			}
		}
		tracer(num, len);
	}while(k !=1);
}
int main(int argc, char* argv[]){

	int testArr[]={485, 241, 454, 325, 452, 685, 498, 890, 281};
	int len=sizeof(testArr)/sizeof(int);
	shell_sort(testArr, len);

	return 0;
}
