#include<stdio.h>
#include<stdlib.h>
void printArray(int * A,int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d ",A[i]);
    }
    printf("\n");
}
void selectionSort(int * A,int n){
    int indexOfMin,temp;
    for (int i = 0; i < n-1; i++)
    {
        indexOfMin=i;
        for (int j = i+1; j < n; j++)
        { 
            if(A[j]<A[indexOfMin]){
                indexOfMin=j;
            }
        }
        //swap
        temp = A[i];
        A[i]=A[indexOfMin];
        A[indexOfMin]=temp;        
    }
    
}
int main(){
    // 0  1  2  3  4  
    // 03 05 02 13 12

    //After First pass
    // 0  1  2  3  4  
    // 02 05 03 13 12

    //After second pass
    // 0  1  2  3  4  
    // 02 03 05 13 12
    
    //After third pass
    // 0  1  2  3  4  
    // 02 05 03 12 13
    int a[] = {3,5,2,13,12};
    int n = 5;
    printArray(a,n);
    selectionSort(a,n);
    printArray(a,n);
   return 0;
}