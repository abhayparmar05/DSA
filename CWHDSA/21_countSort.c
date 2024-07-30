#include<stdio.h>
#include<stdlib.h>
void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
}
int maximum(int a[],int n){
    int max = 0 ;
    for (int i = 0; i < n; i++)
    {
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
}
void countSort(int a[],int n){
    //find a maximum element from array
    int j,i;
    int max = maximum(a,n);

    //create a count array
    int * count = (int *)malloc((max+1)*sizeof(int));

    //initialize the array element to 0
    for ( i = 0; i < n; i++)
    {
        count[i]=0;
    }

    //increment the corresponding index in the count array
    for (i = 0; i < n; i++)
    {
        count[a[i]]=count[a[i]]+1;
    }
    i=0;//counter for count array
    j=0;//counter for given array
    while (i<=max){
        if(count[i]>0){
            a[j]=i;
            count[i]--;
            j++;
        }else{
            i++;
        }
    }
    

}
int main(){
    int a[] = {9,14,4,8,7,5,6};
    int n = 7;
    printArray(a, n);
    countSort(a,n);
    printArray(a, n);
   return 0;
}