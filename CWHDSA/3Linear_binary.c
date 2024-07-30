#include<stdio.h>
#include<stdlib.h>
int linear(int a[],int size,int element){
    for(int i = 0 ;i < size ; i++){
        if(a[i]==element) {
            return i;
        }
    }
    return -1;
}
int binary(int a[],int size,int element){
    int low,mid,high;
    low=0;
    high=a[size-1];
    while (low<=high)
    {
        mid = (low+high)/2;
        if(a[mid]==element){
            return mid;
        }if (a[mid]<element)
        {
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;   
}
int main(){
    int a[]={1,2,3,4,5,6,7,8,9};
    int size = sizeof(a)/sizeof(int);
    int index = linear(a,size,5);
    int index1 = binary(a,size,9);
    printf("%d",index);
    printf("%d",index1);
    return 0;
}