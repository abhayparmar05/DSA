#include<stdio.h>
#include<stdlib.h>
int main(){
    int count = 3;
    for (int i = 0; i < count; i++)
    {
        for (int j = 0; j < count; j++)
        {
            if (i==0 || i==count-1 ||j==0||j==count-1)
            {
                printf("*");
            }else{
                printf(" ");
            }
        }
        printf("\n");
        
    }   
   return 0;
}