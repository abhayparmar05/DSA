#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
};
void trasvel(struct node *head){
    struct node * ptr = head;
    do{
        printf("Element :- %d\n",ptr->data);
        ptr=ptr->next;
    }while (ptr!=head);
    printf("g\n");
}
struct node * insertAtFirst(struct node * head,int data){
    struct node * ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data=data;
    struct node * p = head->next;
    while (p->next!=head)
    {
        p=p->next;
    }
    //at this point p point to the last node 
    p->next = ptr;
    ptr->next=head;
    head=ptr;
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
    second->data=21;
    second->next=third;

    //Link head with second
    third->data=3;
    third->next=head;
    trasvel(head);
    head = insertAtFirst(head,18);
    trasvel(head);

   return 0;
}