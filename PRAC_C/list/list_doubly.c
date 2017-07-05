#include<stdio.h>
#include<stdlib.h>

struct DLLNode{
	int data;
	struct DLLNode* prev;
	struct DLLNode* next;
} *head;

void DLLInsert(struct DLLNode **head, int data, int position){
	int k=1;
	struct DLLNode *newNode, *temp;
	newNode=(struct DLLNode*)malloc(sizeof(struct DLLNode));
	if(!newNode){
		printf("Memory Error!\n");
		return;
	}
	newNode->data=data;
	
	if(position==1){
		newNode->next=NULL;
		newNode->prev=NULL;
		if(*head){
			(*head)->prev=newNode;
			newNode->next=(*head);	
		}
		*head=newNode;
		return;
	}

	temp=*head;
	while((k<position)&&(temp->next!=NULL)){
		temp=temp->next;
		k++;
	}
	if(k!=position){
		printf("Desired position does not exist!\n");
	}
	newNode->next=temp->next;
	newNode->prev=temp;
	if(temp->next){
		temp->next->prev=newNode;
	}
	temp->next=newNode;
	return;
}

void DLLDelete(struct DLLNode **head, int position){
	struct DLLNode *temp, *temp2;
	temp=*head;
	int k=1;
	
	if(*head==NULL){
		printf("List is Empty!\n");
		return;
	}
	if(position==1){
		*head=(*head)->next;
		if((*head)!=NULL){
			free(temp);
			return;
		}
	}
	while((k<position-1)&&(temp->next!=NULL)){
		temp=temp->next;
		k++;
	}
	if(k!=position-1){
		printf("Desired position does not exist!\n");
	}
	temp2=temp->prev;
	temp2->next=temp->next;
	if(temp->next){
		temp2->next->prev=temp2;
	}
	free(temp);
	return;
}

int main(int argc, char* argv[]){
	return 0;
}
