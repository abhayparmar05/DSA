#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
};
int isEmpty(struct node * top){
    if(top==NULL){
        return 1;
    }
}
int isFull(struct node * top){
    struct node * p = (struct node*)malloc(sizeof(struct node));
    if(p==NULL){
        return 1;
    }
}
void trasvel(struct node *ptr){
    while (ptr!=NULL)
    {
        printf("Element :- %d\n",ptr->data);
        ptr=ptr->next;
    }
    
}
struct node* push(struct node * top,int val){
    if(!isFull(top)){
        printf("Stack OverFlow \n");
    }else{
        struct node * p = (struct node*)malloc(sizeof(struct node));
        p->data=val;
        p->next=top;
        top=p;
        return top;
    }
}
int pop(struct node ** top){
    if(!isEmpty(*top)){
        printf("Stack OverFlow \n");
    }else{
        struct node * p = *top; 
        *top=(*top)->next;
        int x =p->data ;
        free(p);
        return x;
    }
}
int peek (int pos,struct node * top){
    struct node * ptr = top;
    for (int i = 0; (i < pos -1 && ptr!=NULL); i++)
    {
        ptr = ptr->next;
    }if(ptr!=NULL){
        return ptr->data;
    }else{
        return -1;
    }
    
}
  //  struct node * top =NULL; so we can remove a reference a variable
int main(){
    struct node * top =NULL;
    top=push(top,10);
    top=push(top,20);
    top=push(top,30);
    trasvel(top);
    //we can send top reference and we use ** in pop function
    //another way we top variable declate to goble

    // int element = pop(&top);
    // printf("Pop Element is %d\n",element);
    // int element1 = pop(&top);
    // printf("Pop Element is %d\n",element1);
    // trasvel(top);

    printf("value at Postion is : %d ",peek(1,top));
   return 0;
}