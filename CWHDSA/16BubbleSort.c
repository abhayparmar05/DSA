#include<stdio.h>
#include<stdlib.h>
void printArray(int * A,int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d ",A[i]);
    }
    printf("\n");
}
void bubbleSort(int * A,int n){
    int temp;
    int isSorted = 0;//if array is sort tha complete in pass 1
    for (int k = 0; k < n-1; k++) //for number of passes
    {
        printf("pass %d\n",k+1);
        isSorted=1;
        for (int j = 0; j < n-1-k; j++) //for comparison in each pass
        {
            if(A[j]>A[j+1]){
                temp = A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
                isSorted = 0;
            }
            printArray(A,n);
            if(isSorted){
                return;
            }
        }    
    }
    
}
int main(){
    int a[]={1,2,3,4,5,6};
    int n = 6;
    printArray(a,n); 
    bubbleSort(a,n);
    printArray(a,n); 
   return 0;
}