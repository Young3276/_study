#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main(int argc, char* argv[]){
	
	FILE *pFile = NULL;
	pFile=fopen("./a.txt", "r");
	if(pFile==NULL){
		printf("Error\n");
		return;
	}else{
		int num,i;
		i=0;
		while(!feof( pFile )){
			fscanf(pFile, "%d\n", &num);
//			printf("print : %d\n", num);
			i++;
		}
		printf("aaaa : %d\n", i);
		fclose(pFile);
	}
	return 0;
}
