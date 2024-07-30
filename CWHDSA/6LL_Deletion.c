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
    printf("Travasel Complete\n");
}
struct node * deleteFirst(struct node * head){
    struct node *ptr = head;
    head = head ->next;
    free(ptr);
    return head;
}
struct node * deleteIndex(struct node * head,int index){
    struct node *p = head;
    struct node *q = head->next;

    for (int i = 1; i < index -1; i++)
    {
        p = p->next;
        q = q->next;
    }
    p->next=q->next;
    free(q);
    return head;
}
struct node * deletelast(struct node * head){
    struct node *p = head;
    struct node *q = head->next;
    while (q->next!=NULL)
    {
        p = p->next;
        q=q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}
struct node * deleteValue(struct node * head,int value){
    struct node *p = head;
    struct node *q = head->next;

    while(q->data!=value && q->next!=NULL)
    {
        p = p->next;
        q = q->next;
    }
    if(q->data == value){
        p->next=q->next;
        free(q);
    }
    return head;
}
int main(){
    //allocat memory for node  in ll in heap mem
    struct node * head;
    struct node * second;
    struct node * third;
    struct node * froth;
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    froth = (struct node *)malloc(sizeof(struct node));
    //Link head with second
    head->data=1;
    head->next=second;

    //Link head with second
    second->data=2;
    second->next=third;

    //Link head with second
    third->data=3;
    third->next=froth;

    //Link head with thied
    froth->data=4;
    froth->next=NULL;
    trasvel(head);

    // head = deleteFirst(head);
    // trasvel(head);
    // head = deleteIndex(head,2);
    // trasvel(head);
    // head = deletelast(head);
    // trasvel(head);
    head = deleteValue(head,2);
    head = deleteValue(head,4);

    trasvel(head);
   return 0;
}