#include<stdio.h>
#include<stdlib.h>
int main(){
    int a[]={1,2,3322,4,323,454};
    int max = 0;
    for (int i = 0; i <= 5; i++)
    {
        if(max<=a[i]){
            max=a[i];
        }
    }
    printf("%d",max);
   return 0;
}