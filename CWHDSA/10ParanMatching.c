#include<stdio.h>
#include<stdlib.h>
struct stack
{
    char *arr;
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
void push(struct stack *ptr,char val){
    if(isFull(ptr)){
        printf("stack OverFlow\n");
    }else{
        ptr->top++;
        ptr->arr[ptr->top]=val;
    }
}

char pop(struct stack *ptr){
    if(isEmpty(ptr)){
        printf("stack UnderFlow\n");
    }else{
        char val=ptr->arr[ptr->top];
        ptr->top--;
        return val;
    }
}
int parenthesisMatch(char * exp){
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->top=-1;
    sp->size=100;
    sp->arr = (char *)malloc(sp->size * sizeof(char));

    for (int i = 0; i < exp[i]!='\0'; i++)
    {
        if(exp[i]=='('){
            push(sp,'(');
        }else if (exp[i]==')')
        {   
            if(isEmpty(sp)){
                return 0;
            }
            pop(sp);
        }
    }
    if(isEmpty(sp)){
        return 1;
    }
    return 0;
}
int main(){
    char *exp="8*(9))";
    if(parenthesisMatch(exp)){
        printf("The Parenthesis is Matching\n");
    }else{
        printf("The Parenthesis is Not Matching");
    }
   return 0;
}