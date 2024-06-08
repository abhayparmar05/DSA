#include<stdio.h>
#include<stdlib.h>
struct myArray
{
    int useSize; //memory to be reserved
    int totalSize; // memory to be used
    int *ptr;
};
void createArray(struct myArray * a , int tSize , int uSize){
    // (*a).totalSize = tSize; // (*a) is get struct of marks
    // (*a).useSize = uSize;
    // (*a).ptr = (int*)malloc(tSize*sizeof(int)); //return integer pointer
    a->totalSize = tSize; // (*a) is get struct of marks
    a->useSize = uSize;
    a->ptr = (int*)malloc(tSize*sizeof(int)); //return integer pointer
}
void show(struct myArray * a){
    for (int i = 0; i < a->useSize; i++)
    {   
        printf("value at %d index :- %d\n",i,(a->ptr)[i]);
    }  
} 
void setValue(struct myArray * a){
    int n;
    for (int i = 0; i < a->useSize; i++)
    {
        printf("Enter value at %d index :- ",i);
        scanf("%d",&n);
        (a->ptr)[i] = n;
    }
    
}
int main(){
    struct myArray marks;
    createArray(&marks,10,3);
    printf("We are running SetValue Now \n");
    setValue(&marks);
    printf("We are running Show Now \n");
    show(&marks);
    return 0;
}