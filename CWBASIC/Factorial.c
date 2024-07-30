#include<stdio.h>
#include<stdlib.h>
int factorialItrativ(int n){
int val=1;
    for (int i = n; i > 1; i--)
    {
        val *=i;
    }
    return val;
}
int factorialReccusive(int n){
    
    if(n==0||n==1){
        return 1;
    }
    return n*factorialReccusive(n-1);
}
int main(){
    int n;
    printf("Enter a number :- ");
    scanf("%d",&n);  
    printf("Factorial Using Itrative method :- %d\n",factorialItrativ(n));
    printf("Factorial Using Reccusive method :- %d\n",factorialReccusive(n));
   return 0;
}