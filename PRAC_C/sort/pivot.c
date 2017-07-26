#include<stdio.h>

void swap(int* a, int*b){
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}

int Partition(int* arr, int low, int high){
	int left, right;
	int pivot_item=arr[low];
	left=low;
	right=high;
	while(left<right){
		while(arr[left]<=pivot_item){left++;}
		while(arr[right]>pivot_item){right--;}
		if(left<right)
			swap(&arr[left], &arr[right]);
	}
	arr[low]=arr[right];
	arr[right]=pivot_item;
	return right;
}

void Quicksort(int* arr, int low, int high){
	int pivot;
	if(high<=low){
		return;
	}else{
		pivot=Partition(arr, low, high);
		Quicksort(arr, low, pivot-1);
		Quicksort(arr, pivot+1, high);
	}
}

int main(int argc, char* argv[]){
	int arr[8]={4, 29, 49, 19, 41, 10, 40};
	int i;
	Quicksort(arr, 0, 7);
	
	for(i=0; i<8; i++){
		printf("%d ", arr[i]);
	}
	return 0;
}
