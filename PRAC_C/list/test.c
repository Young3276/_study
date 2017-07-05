#include <stdio.h>

int function1(int temp1){
	return temp1;
}

int function2(int temp2){
	return temp2;
}

int main(int argc, char* argv[]){
	
	int (*fptr)(int);
	fptr = function1;
	printf("function1 of 0 is : %d\n", fptr(5));
	fptr = function2;
	printf("function2 of 0 is : %d\n", fptr(10));
	return 0;
}
