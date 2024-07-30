#include<stdio.h>
#include<stdlib.h>
struct queue
{
    int size;
    int front;
    int rear;
    int * arr;
};
int isFull(struct queue * q){
    if(q->rear==q->size-1){
        return 1;
    }
    return 0;
}
int isEmpty(struct queue * q){
    if(q->rear==q->front){
        return 1;
    }
    return 0;
}
void enqueue(struct queue * q,int val){
    if(isFull(q)){
        printf("Queue is Full"); 
    }else{
        q->rear++;
        q->arr[q->rear]=val;
    }
}
int dequeue(struct queue * q){
    if(isEmpty(q)){
        printf("Queue is Empty"); 
    }else{
        q->front++;
        return q->arr[q->front];
    }
}
int main(){
    struct queue q;
    q.size=10;
    q.front=q.rear=-1;
    q.arr=(int *)malloc(q.size*sizeof(int));

    enqueue(&q,10);
    enqueue(&q,20);
    printf("dequeue element %d\n",dequeue(&q));
    printf("dequeue element %d\n",dequeue(&q));

   return 0;
}