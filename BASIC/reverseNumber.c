#include<stdio.h>
#include<stdlib.h>
int main(){
    int rev = 0;
    int num = 1234;
    int rem=0;
    while (num!=0)
    {
        rem = num %10; //last digit of number
        rev = rev*10+rem; //genereate a rev using last digit
        num = num /10; 
    }
    printf("%d",rev);
   return 0;
}