#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

void outputFunc(int* space, int n){
	int j; 
	for(j=0; j<n; j++){
		printf("%d ", *(space+j));
	}
	printf("\n");
}

void BubbleSort(int *space, int n){
	int start, finish;
	int i, j, temp;
	start=time(0);
	for(i=0; i<n; i++){
		for(j=0; j<n-1-i; j++){
			if(space[j]>space[j+1]){
				temp=space[j];
				space[j]=space[j+1];
				space[j+1]=temp;		
			}
		}
	}
	finish=time(0);
	printf("BubbleSort Result : "); 
	outputFunc(space, n);
	printf("Duration Time : %d\n", finish-start);
	printf("\n\n\n");
}

/* 정렬 플래그를 사용하여 이미 정렬된 부분은 Skip */
void BubbleSortImproved(int *space, int n){
	int start, finish;
	int i, j, temp, flag=1;
	start=time(0);
	for(i=0; i<n && flag; i++){
		flag=0;
		for(j=0; j<n-1-i; j++){
			if(space[j]>space[j+1]){
				temp=space[j];
				space[j]=space[j+1];
				space[j+1]=temp;
				flag=1;
			}
		}
	}
	finish=time(0);
	printf("BubbleSortImproved Result : ");
	outputFunc(space, n);
	printf("Duration Time : %d\n", finish-start);
	printf("\n\n\n");
}

/* Index 순으로 증가하면서 뒤쪽 요소들중 최소값을 선택하여 교체 */
void SelectionSort(int *space, int n){
	int start, finish;
	int i, j, min, temp;
	start=time(0);
	for(i=0; i<n-1; i++){
		min=i;
		for(j=i+1; j<n; j++){
			if(space[j]<space[min])
				min=j;
		}
		temp=space[min];
		space[min]=space[i];
		space[i]=temp;
	}
	finish=time(0);
	printf("SelectionSort Result : ");
	outputFunc(space, n);
	printf("Duration Time : %d\n", finish-start);
	printf("\n\n\n");
}

/* Index 순으로 증가하면서 Index+1의 요소를 정렬순서에 맞게 삽입 */
void InsertionSort(int *space, int n){
	int start, finish;
	int i, j, data;
	start=time(0);
	for(i=2; i<=n-1; i++){
		data=space[i];
		j=i;
		while(space[j-1]>data && j>=1){
			space[j]=space[j-1];
			j--;
		}
		space[j]=data;
	}
	finish=time(0);
	printf("InsertionSort Result : ");
	outputFunc(space, n);
	printf("Duration Time : %d\n", finish-start);
	printf("\n\n\n");
}

/* Quick Sort Start */
void QuickSort(int *space, int low, int high){
	int pivot;
	if(low>=high){
		return;
	}else{
		pivot=Partition(space, low, high);
		QuickSort(space, low, pivot-1);
		QuickSort(space, pivot+1, high);
	}	
}

void swap(int* a, int* b){
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}

int Partition(int* space, int low, int high){
	int left, right, pivot_item=space[low];
	left=low;
	right=high;
	while(left<right){
		while(space[left]<=pivot_item){
			left++;
		}
		while(space[right]>pivot_item){
			right--;
		}
//		printf("left : %d\n", left);
//		printf("right : %d\n", right);
		if(left<right){
			swap(&space[left], &space[right]);
		}
	}
	
	return right;
}
/* Quick Sort End */

int* copyFunc(int* copySpace, int* oriSpace, int count){
	int i;
	for(i=0; i<count; i++){
		copySpace[i]=oriSpace[i];
	}
	return copySpace;
}


int main(int argc, char* argv[]){

	if(argc != 2){
		printf("Usage : %s <FileName>\n", argv[0]);
		return 0;
	}
	char* FileName=argv[1];
	FILE *pFile = NULL;
	pFile=fopen(FileName, "r");
	if(pFile==NULL){
		printf("File Pointer Error!\n");
		return 0;
	}
	int num, flag=1;
	int count=0,i=0;
	/* File Data Counting */
	while(!feof(pFile)){
		fscanf(pFile, "%d\n",&num);
		count++;
	}
	fseek(pFile, 0, SEEK_SET);	// File Pointer Initialization
	int* oriSpace=(int*)malloc(sizeof(int)*count); //Create saving data space
	int* copySpace=(int*)malloc(sizeof(int)*count);
	/* Save data After Read File data */
	while(!feof(pFile)){
		fscanf(pFile, "%d\n", &num);
		oriSpace[i]=num;
		i++;
	}
	fclose(pFile);
	while(flag){
		printf("========= Sort Menu =======\n");
		printf("1. BubbleSort\n");
		printf("2. BubbleSortImproved\n");
		printf("3. SelectionSort\n");
		printf("4. InsertionSort\n");
		printf("5. QuickSort\n");
		printf("6. exit\n");
		printf("===========================\n");
		printf("Origin data : ");
		outputFunc(oriSpace, count);
		printf("Input sorting Number : ");
		scanf("%d", &num);
	 	switch(num){
			case 1:
				copyFunc(copySpace, oriSpace, count);	
				BubbleSort(copySpace,count);
				break;
			case 2:
				copyFunc(copySpace, oriSpace, count);	
				BubbleSortImproved(copySpace, count);
				break;
			case 3:
				copyFunc(copySpace, oriSpace, count);	
				SelectionSort(copySpace, count);
				break;
			case 4: 
				copyFunc(copySpace, oriSpace, count);	
				InsertionSort(copySpace, count);
				break;
			case 5:
				copyFunc(copySpace, oriSpace, count);
				QuickSort(copySpace, 0, count-1);
				break;
			case 6:
				flag=0;
				break;
		}
	}
	free(copySpace);
	free(oriSpace);
	return 0;
}
