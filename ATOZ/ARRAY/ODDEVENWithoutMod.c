#include<stdio.h>
int main(){
    int n =40;
    for (int i = 0; i <= n; i++)
    {
        if(i & 1){
            printf("number is OOD %d \n" , i);
        }else{
            printf("number is evene %d \n", i);
        }    
    }
     
    
    return 0;
}