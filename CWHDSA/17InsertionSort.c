#include<stdio.h>
#include<stdlib.h>
void printArray(int * A,int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d ",A[i]);
    }
    printf("\n");
}
void insertionSort(int * A,int n){
    int key,j;
    //loop for passes
    for (int i = 1; i <=n-1; i++)
    {
        printf("Pass %d :- ",i);   
        //loop for each pass
        key=A[i];
        j=i-1;
        while (j>=0&&A[j]>key)
        {
            A[j+1]=A[j];
            j--;
    printArray(A,n);

        }
        A[j+1]=key;
        printArray(A,n);

    }

}
int main(){
            // 0    1   2   3   4   5
            // 12 | 54  65  07  23 09 --> i = 1 , key = 54 ,j=0;
            // 12 | 54  65  07  23 09 --> i = 1 pass 1 done;

            // 12   54| 65  07  23 09 --> i = 2 , key = 65 ,j=1;
            // 12   54| 65  07  23 09 --> i = 1 pass 2done;

            // 12   54  65| 07  23 09 --> i = 3 , key = 07 ,j=2;
            // 12   54  65| 65  23 09 --> i = 3 , key = 07 ,j=1;
            // 12   54  54| 07  23 09 --> i = 3 , key = 07 ,j=0;
            // 12   12  65| 07  23 09 --> i = 3 , key = 07 ,j=-1;
            // 07   12  65| 07  23 09 --> i = 3 , key = 07 ,j=-1 pass 3 done;



    int a[] = {12,54,65,7,23,9};
    int n = 6;
    printArray(a,n);
    insertionSort(a,n);
   return 0;
}