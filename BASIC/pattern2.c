#include<stdio.h>
#include<stdlib.h>
//    *
//   **
//  ***
// ****       if(i+J>=n-1)
//***** 

//*****
//**** 
//***       if(i+J<=n-1)
//**
//*
int main(){
    int n;
    printf("Enter a number:- ");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        for(int j =0; j < n ; j++){
            if (i+j>=n-1)
            {
                printf("*");
            }else{
                printf(" ");
                
            }   
        }
        printf("\n");
    }
    for (int i = 0; i < n; i++)
    {
        for(int j =0; j < n ; j++){
            if (i+j<=n-1)
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