#include<stdio.h>
#include<stdlib.h>
int main(){
    int count=0;
    char s[] = "ABhay";
    char temp;
    while (s[count]!='\0')
    {
        count++;
    }
    printf("%d\n",count);
    for (int i = 0; i < ((count)/2); i++)
    {
        temp = s[i];
        s[i]=s[count-1-i];
        s[count-1-i]=temp;
    }
    printf("%s",s);
   return 0;
}