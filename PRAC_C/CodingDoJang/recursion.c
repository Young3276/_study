#include<stdio.h>

int func(int num, int n){
	if(num/n==0){
		if(num%n>=10)
			printf("%c",num%n+55);
		else
			printf("%d",num%n);
		return 1;
	}else{
		func(num/n, n);
		if(num%n>=10)
			printf("%c",num%n+55);
		else
			printf("%d",num%n);
	}
}

int main(int argc, char* argv[]){
	int num;
	int n;

	printf("Input 10진수 : ");
	scanf("%d", &num);
	printf("Input n진수 : ");
	scanf("%d", &n);
	
	func(num, n);	
	printf("\n");
	return 0;
}
