#include<stdio.h>
#include<stdlib.h>
void display(int arr[] , int n){
    //traversal
    for (int i = 0; i < n; i++)
    {
        printf("%d  ",arr[i]);
    }
    printf("\n");
}
int insert(int arr[],int useSize,int capacity){
    int val,index;
    printf("Enter a Vaule and Index you want to insert :- ");
    scanf("%d %d",&val,&index);

    if(index>=capacity){
        return -1;
    }
    else{
    for (int i = useSize-1; i >=index; i--)
    {
        arr[i+1]=arr[i];
    }
    arr[index]=val;

    return 1;
    }
    return 0;
}
void delete(int arr[],int useSize,int capacity,int index){
    for (int i = index; i <useSize-1; i++)
    {
        arr[i]=arr[i+1];
    }
    return 1;
}

int main(){
    int arr[10]={1,2,3,4};
    int useSize = 4;
    int capacity=10;
    display(arr,useSize);
    // int t = insert(arr,useSize,capacity);
    // if(t==-1){
    //     printf("error in intertion");
    // }else{
    //     useSize++;
    //     display(arr,useSize);
    // }
    int index;
    printf("enter a index");
    scanf("%d",&index);
    delete(arr,useSize,capacity,index);
    useSize--;
    display(arr,useSize);
    return 0;
}