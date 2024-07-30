#include<stdio.h>
#include<stdlib.h>
int main(){
    int n = 34;
    int isPrime=1;
    for (int i = 2; i*i <= n; i++)
    {
        if(n%i==0){
            isPrime=0;
        }
    }
    if(isPrime){
    printf("Number is Prime %d ",n);
    }else{
    printf("Number is not Prime %d ",n);
    }
    
   return 0;
}