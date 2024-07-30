#include<stdio.h>
#include<stdlib.h>
//sum = 1+2+3+4+...+n

int main(){
    int num, sum = 0;
    printf("Enter a last natural number for sum:-");
    scanf("%d",&num);
    for (int i = 0; i <= num; i++)
    {
        sum+=i;
    }
    printf("Sum of N Number is using loop %d\n",sum);
    int sum1 =0;
    sum1 = (num * num+num)/2;
    printf("Sum of N Number is using O(1) %d\n",sum1);
   return 0;
}