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
    third->next=NULL;
    trasvel(head);

   return 0;
}