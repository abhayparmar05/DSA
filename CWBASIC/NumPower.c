#include<stdio.h>
#include<stdlib.h>
int main(){
    int n = 2;
    int m =4;
    int val = 1;
    for (int i = 1; i <= m; i++)
    {
        val*=n;
    }
    printf("%d",val);
   return 0;
}