#include <stdio.h>
#include <stdlib.h>

struct CLLNode{
	int data;
	struct CLLNode *next;
};

int CircularListLength(struct CLLNode *head){
	struct CLLNode *current = head;
	int count=0;
	if(head==NULL)
		return 0;
	do{
		current=current->next;
		count++;
	}while(current!=head);
	return count;
}

void PrintCircularListData(struct CLLNode *head){
	struct CLLNode *current = head;
	if(head==NULL)
		return;
	do{
		printf("%d", current->data);
		current=current->next;
	}while(current!=head);
}

int main(int argc, char* argv[]){

	return 0;
}
