#include <stdio.h>

int main(int argc, char* argv[]){
	int n1=1;
	int n2=2;
	int n3;
	int sum=n2;
	printf("%d ", n2);
	do{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		if(n3%2==0){
			printf("%d ", n3);
			sum+=n3;
		}
	}while(n3<4000000);
	printf("\n");
	printf("sum : %d\n", sum);
	return 0;
}
