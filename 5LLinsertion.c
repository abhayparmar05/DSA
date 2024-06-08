#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
};
void trasvel(struct node *ptr){
    while (ptr!=NULL)
    {
        printf("Element :- %d\n",ptr->data);
        ptr=ptr->next;
    }
    printf("End Of the LL\n");   
}
struct node * insertAtFirst(struct node *head,int data){
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->next=head;
    ptr->data=data;
    return ptr;
}
struct node * insertAtIndex(struct node *head,int data , int index){
    struct node *ptr = (struct node*)malloc(sizeof(struct node));
    struct node *p= head;
    int i = 0 ;
    while(i!=index-2){
        p=p->next;
        i++;
    }
    ptr->data=data;
    ptr->next=p->next;
    p->next=ptr;  
    return head;
}
struct node * insertAtEnd(struct node * head,int data){
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data=data;
    struct node *p= head;
    while(p->next != NULL){
        p=p->next;
    }
    p->next=ptr;
    ptr->next=NULL;
    return head;
}
struct node * insertAfter(struct node * prevNode,struct node * head,int data){
    struct node *ptr = (struct node *)malloc(sizeof(struct node));   
    ptr->data=data;

    ptr->next=prevNode->next;
    prevNode->next=ptr;

    return head;
}
int main(){
     //allocat memory for node  in ll in heap mem
    struct node * head;
    struct node * second;
    struct node * third;
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));

    //Link head with second
    head->data=1;
    head->next=second;

    //Link head with second
    second->data=2;
    second->next=third;

    //Link head with second
    third->data=3;
    third->next=NULL;
    trasvel(head);

    // head = insertAtFirst(head,10);
    // trasvel(head);
    // head = insertAtIndex(head,11,2);
    // trasvel(head);
    // head = insertAtEnd(head,9);
    // trasvel(head);
    head=insertAfter(second,head,9);
    trasvel(head);
   return 0;
}