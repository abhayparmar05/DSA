#include <stdio.h>
#include <stdlib.h>
void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
}
int partition(int a[], int low, int high,int n)
{
    int pivot = a[low];
    int i = low + 1;
    int j = high;
    int temp;

    do
    {
        while (a[i] <= pivot)
        {
            i++;
        }
        while (a[j] > pivot)
        {
            j--; 
        }
        if (i < j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    } while (i < j);

    temp = a[low];
    a[low] = a[j];
    a[j] = temp;
    return j;
}
void quickSort(int a[], int low, int high,int n)
{
    int partitionIndex; // index of piviot after partition

    if (low < high)
    {
        partitionIndex = partition(a, low, high,n);
        printArray(a, n);
        quickSort(a, low, partitionIndex - 1,n); // sort left sub array
        quickSort(a, partitionIndex + 1, low,n); // sort right sub array
    }
}

int main()
{
    // 3 5 2 13 12 3 2 13 45 
    // 3 2 2 3 12 13 5 13 45 
    // 2 2 3 3 12 13 5 13 45 
    // 2 2 3 3 12 13 5 13 45 
    // 2 2 3 3 12 13 5 13 45 
    int a[] = {3,5,2,13,12,3,2,13,45};
    int n = 9;
    printArray(a, n);
    quickSort(a, 0, n - 1,n);
    return 0;
}
