#include<stdio.h>
#include<stdlib.h>
//     *     
//    ***
//   *****
//  *******
// *********
int main(){
    int  n = 4;
    for (int i = 0; i <n; i++)
    {
        for (int j = 0; j < 2*n; j++)
        {
            if(j>=n-1-i && j<=n-1+i)
                printf("*");
            else
                printf(" ");
        }
     printf("\n");   
    }
    
   return 0;
}