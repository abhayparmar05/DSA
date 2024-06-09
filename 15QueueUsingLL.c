#include<stdio.h>
#include<stdlib.h>
    struct node * f=NULL;
    struct node * r=NULL;
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
void enqueu(int val){
    struct node *n = (struct node *)malloc(sizeof(struct node));
    if(n==NULL){
        printf("Queue Is Full");
    }else{
        n->data=val;
        n->next=NULL;
        if(f==NULL){
            f=r=n;
        }else{
            r->next=n;
            r=n;
        }
    }
}
int denqueu(){
    int val = -1;
    struct node *n = f;
    if(f==NULL){
        printf("Queue Is EMPTY");
    }else{
        f=f->next;
        val = n->data;
        free(n);
    }
    return val;
}
int main(){

    trasvel(f);
    printf("Deueue element %d\n",denqueu());
    enqueu(10);
    enqueu(20);
    enqueu(30);
    printf("Deueue element %d\n",denqueu());
    printf("Deueue element %d\n",denqueu());

    trasvel(f);

   return 0;
}