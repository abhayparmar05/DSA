#include<stdio.h>
#include<stdlib.h>
int isPrime(int n){
    for (int i = 2; i*i <= n; i++)
    {
        if(n%i==0){
            return 0;
        }
    }
    return 1;
}  
int main(){
    int n1,n2;
    printf("Enter a number one value :-");
    scanf("%d",&n1);
    printf("Enter a number two value :-");
    scanf("%d",&n2);
    for (int i = n1; i <= n2; i++)
    {
        if(isPrime(i)){
            printf("%d\t",i);
        }
    }
   return 0;
}