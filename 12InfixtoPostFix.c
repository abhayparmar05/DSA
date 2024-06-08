#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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
char stackTop(struct stack *sp){
    return  sp->arr[sp->top];
}
int precedence(char ch){
    if(ch == '*' || ch == '/'){
        return 2;
    }
    else if(ch == '+' || ch == '-'){
        return 1;
    }else{
        return 0;
    }
}
int isOperator(char ch){
    if(ch =='+'||ch =='-'||ch =='*'||ch =='/')
        return 1;
    else
        return 0;
}
char * infixToPostfix(char * infix){
    struct stack *sp = (struct stack *)malloc(sizeof(struct stack));
    sp->top=-1;
    sp->size=100;
    sp->arr = (char *)malloc(sp->size * sizeof(char));
    char * postfix = (char *)malloc((strlen(infix)+1) * sizeof(char));
    int i = 0 ;//Track Infix Travasel
    int j = 0 ;//Track Post Fix Addition 
    while (infix[i]!='\0')
    {
        if(!isOperator(infix[i])){
            postfix[j]=infix[i];
            j++;
            i++;
        }else{
            if(precedence(infix[i])>precedence(stackTop(sp))){
                push(sp,infix[i]);
                i++;
            }else{
                postfix[j]=pop(sp);
                j++;
            }
        }
    }
    //for empty a stack
    while (!isEmpty(sp))
    {
        postfix[j]=pop(sp);
        j++;
    }
    postfix[j]='\0';
    return postfix;
}
int main(){
    char * infix="x-y/z-r*d";
    printf("postfix is %s \n", infixToPostfix(infix));
   return 0;
} 