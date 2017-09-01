#include<stdio.h>
#include<stdlib.h>
#include "dumpcode.h"

struct ListNode{
	int data;
}*root;

int main(){
	struct ListNode *newNode;
	newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
	newNode->data=10;
	root=newNode;
	dumpcode((char*)(root),16);
	free(newNode);
}
