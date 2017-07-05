#include<stdio.h>
#include<stdlib.h>

struct ListNode{
	int data;
	struct ListNode *next;
}

int ListLength(struct ListNode *head){
	struct ListNode *current=*head;
	int count=0;
	while(current!=NULL){
		count++;
		current=current->next;
	}
	return count;
}

void InsertInLinkedList(struct ListNode **head, int data, int position){
	int k=1;
	struct ListNode *p, *q, *newNode;
	newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
	if(!newNode){
		printf("Memory Error!\n");
		return;
	}
	newNode->data=data;
	newNode->next=NULL;
	p=*head;

	if(position==1){
		newNode->next=p;
		*head=newNode;
	}
	else{
		while((p!=NULL)&&(k<position)){
			k++;
			q=p;
			p=p->next;
		}
		q->next=newNode;
		newNode->next=p;
	}
}


int main(int argc, char* argv[]){

	return 0;
}
