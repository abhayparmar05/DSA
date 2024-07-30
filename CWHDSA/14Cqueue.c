#include<stdio.h>
#include<stdlib.h>
struct circularQueue
{
    int size;
    int front;
    int rear;
    int * arr;
};
int isFull(struct circularQueue * q){
    if(((q->rear+1)%q->size)==q->front){
        return 1;
    }
    return 0;
}
int isEmpty(struct circularQueue * q){
    if(q->rear==q->front){
        return 1;
    }
    return 0;
}
void enQueue(struct circularQueue * q,int val){
    if(isFull(q)){
        printf("circularQueue is Full\n"); 
    }else{
        q->rear=(q->rear+1)%q->size;
        q->arr[q->rear]=val;
        printf("%d\n",(q->rear+1)%q->size);
    }
}
int deQueue(struct circularQueue * q){
    int a = -1;
    if(isEmpty(q)){
        printf("circularQueue is Empty\n"); 
        return -1;
    }else{
        q->front=(q->front+1)%q->size;
        a= q->arr[q->front];
        return a;
    }
}
int main(){
    struct circularQueue q;
    q.size=3;
    q.front=q.rear=0;
    q.arr=(int *)malloc(q.size*sizeof(int));

    enQueue(&q,10);
    enQueue(&q,20);


    printf("decircularQueue element %d\n",deQueue(&q));
    printf("decircularQueue element %d\n",deQueue(&q));
    enQueue(&q,30);

    printf("decircularQueue element %d\n",deQueue(&q));


   return 0;
}