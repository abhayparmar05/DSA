#include<stdio.h>
#include<stdlib.h>
int main(){
    int count = 0;
    int num=19910;
    while(num!=0){
        num=num/10;
        count++;
    }
    printf("%d",count);
   return 0;
}