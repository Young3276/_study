#include <stdio.h>
#include <stdlib.h>
#include "Queue.h"
#include "Stack.h"
#include "dumpcode.h"

struct BinaryTreeNode{
	int data;
	struct BinaryTreeNode *left;
	struct BinaryTreeNode *right;
}*root;

void InsertInBinaryTree(struct BinaryTreeNode *root, int data){
	struct Queue *Q;
	struct BinaryTreeNode *temp;
	struct BinaryTreeNode *newNode;
	newNode=(struct BinaryTreeNode*)malloc(sizeof(struct BinaryTreeNode));
	newNode->data=data;
	newNode->left=NULL;
	newNode->right=NULL;
	if(!newNode){
		printf("Memory Error!\n");
		return;
	}
	if(!root){
		root=newNode;
		return;
	}
	Q=CreateQueue();
	EnQueue(Q, root);
	while(!IsEmptyQueue(Q)){
		temp=DeQueue(Q);
		if(temp->left){
			EnQueue(Q, temp->left);
		}else{
			temp->left=newNode;
			DeleteQueue(Q);
			return;
		}
		if(temp->right){
			EnQueue(Q, temp->right);
		}else{
			temp->right=newNode;
			DeleteQueue(Q);
			return;
		}
	}
	DeleteQueue(Q);
}

void InOrderNonRecursive(struct BinaryTreeNode *root){
	struct Stack *S=CreateStack();
	while(1){
//		dumpcode((char*)root,48);
		while(root){
			Push(&top, root);
			root=root->left;
		}
/*
		if(IsEmptyStack(&top))
			break;
*/
		root=Pop(&top);
		printf("%d ", root->data);
		root=root->right;

	}
	DeleteStack(&top);
}

void MenuPrint(){
	printf("===== Menu =====\n");
	printf("1. Insert \n");
	printf("2. Search \n");
	printf("3. Display \n");
	printf("4. Exit \n");
	printf("================\n");
}
int main(int argc, char* argv[]){

	int num, data, flag;
	flag=1;
	printf("Welcome Tree World!\n");
	while(flag){
		MenuPrint();
		scanf("%d", &num);
		switch(num){
			case 1:
				printf("Input data : ");
				scanf("%d", &data);
				InsertInBinaryTree(root, data);
				dumpcode((char*)*root, 16);
				break;
			case 2:
				break;
			case 3:
				InOrderNonRecursive(root);				
				break;
			case 4:
				flag=0;
				break;
		}
	}
	return 0;
}
