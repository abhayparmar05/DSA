#include<stdio.h>
#include<stdlib.h>
struct stack
{
    int *arr;
    int top;
    int size;
};
int isEmpty(struct stack * ptr){
    if(ptr->top == -1){
        return 1;
    }
    else {
        return 0;
    }
}
int isFull(struct stack *ptr)
{
    if(ptr->top == ptr->size-1){
        return 1;
    }
    else {
        return 0;
    }
}
void push(struct stack *ptr,int val){
    if(isFull(ptr)){
        printf("stack OverFlow\n");
    }else{
        ptr->top++;
        ptr->arr[ptr->top]=val;
    }
}

void pop(struct stack *ptr){
    if(isEmpty(ptr)){
        printf("stack UnderFlow\n");
    }else{
        int val=ptr->arr[ptr->top];
        ptr->top--;
        printf("pop element is %d\n",val);
    }
}
int peek(struct stack *ptr,int i){
    int arrayInt = ptr->top-i+1;
    if((ptr->top- i +1) < 0){
        printf("Not a valid Position for the stack \n");
        return -1;
    }else{
        return ptr->arr[arrayInt];
    }
}
int stackTop(struct stack *ptr){
    return ptr->arr[ptr->top];
}
int stackBottem(struct stack *ptr){
    return ptr->arr[0];
}

int main(){
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->top=-1;
    sp->size=10;
    sp->arr = (int *)malloc(sp->size * sizeof(int));
    
    push(sp,10);
    push(sp,20);
    push(sp,30);
    push(sp,40);
    push(sp,50);
    
    for (int j = 1; j < sp->top+2; j++)
    {
        printf("The value at postion %d is %d \n",j,peek(sp,j));
    }
    
    pop(sp);
    pop(sp);
        printf("The Top most value of stack %d \n",stackTop(sp));
        printf("The Bottom most value of stack %d \n",stackBottem(sp));
    
    for (int j = 1; j < sp->top+2; j++)
    {
        printf("The value at postion %d is %d \n",j,peek(sp,j));
    }
   return 0;
}