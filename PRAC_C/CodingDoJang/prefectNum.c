#include<stdio.h>

int main(int argc, char* argv[]){
	
	int i, j, num, sum;
	printf("Input Number : ");
	scanf("%d", &num);
	for(i=1; i<=num; i++){
		sum=0;
		for(j=1; j<i; j++){
			if(i%j==0){
				sum+=j;
			}
		}
		if(sum==i){
			printf("Perfect Number : %d\n", i);
		}
	}
	return 0;
}
