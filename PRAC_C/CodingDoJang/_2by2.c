#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]){

	int num;
	int i,j,k;
	printf("What's matrix num?\n");
	scanf("%d", &num);

	/* matrix allocation */
	int** arr=(int**)malloc(sizeof(int*)*num);
	int** brr=(int**)malloc(sizeof(int*)*num);
	int** result=(int**)malloc(sizeof(int*)*num);

	
	for(i=0; i<num; i++){
		arr[i]=(int*)malloc(sizeof(int)*num);
		brr[i]=(int*)malloc(sizeof(int)*num);
		result[i]=(int*)malloc(sizeof(int)*num);
	}

	/* Input data in matrix */
	printf("matrix A Input data\n");
	for(i=0; i<num; i++){
		for(j=0; j<num; j++){
			printf("A_%d%d : ", i, j);
			scanf("%d", &arr[i][j]);	
		}
	}	
	
	printf("matrix B Input data\n");
	for(i=0; i<num; i++){
		for(j=0; j<num; j++){
			printf("B_%d%d : ", i, j);
			scanf("%d", &brr[i][j]);
		}
	}

	for(i=0; i<num; i++){
		for(j=0; j<num; j++){
			result[i][j]=0;
		}
	}

	/* Matrix Multiplication */
	for(i=0; i<num; i++){
		for(j=0; j<num; j++){
			for(k=0; k<num; k++){
				result[i][j]+=(arr[i][k]*brr[k][j]);
			}
		}	
	}
	

	/* Matrix Confrim */	
	for(i=0; i<num; i++){
		for(j=0; j<num; j++){
			printf("%d ", result[i][j]);
		}
		printf("\n");
	}


	/* Deallocation */
	for(i=0; i<num; i++){
		free(arr[i]);
		free(brr[i]);
		free(result[i]);
	}

	free(arr);
	free(brr);
	free(result);
		
	return 0;
}
