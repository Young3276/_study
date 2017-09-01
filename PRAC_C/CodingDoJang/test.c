#include<stdio.h>

int main(){
	int A,B,D;
	int s=0;
	int min=0;
	scanf("%d", &A);
	scanf("%d", &B);
	scanf("%d", &D);
	
	while(1){
		D-=A;
		min++;
		if(D<=0)
			break;
		D+=B;
	}
	printf("Answer : %d\n", min);
	return 0;
}
