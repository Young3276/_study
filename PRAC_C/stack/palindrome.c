#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int IsPalindrome(char* sen){
	int check;
	int ini;
	int len=strlen(sen)-1;
	for(ini=0; ini<len && sen[ini]==sen[len]; ini++, len--)
	{
/*		printf("sen[%d] : %c\n", ini, sen[ini]);
		printf("sen[%d] : %c\n", len, sen[len]);
		printf("===================\n");
*/
	}
	
	if(ini<len)
		check=0;
	else
		check=1;

	return check;
}


int main(int argc, char* argv[]){

	if(argc!=2){
		printf("usage : %s <sentence>\n",argv[0]);
	}

	int result;
	result=IsPalindrome(argv[1]);

	if(result)
		printf("Sentence is Palindrome\n");
	else
		printf("Sentence is not Palindrome\n");
	
	return 0;
}
