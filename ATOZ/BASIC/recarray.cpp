#include<iostream>
using namespace std;
void f(int  i , int a[],int n){
    if(i>=n/2) return; 
    swap(a[i],a[n-i-1]);
    f(i+1,a,n);
}
int main(){
    int a[]={1,2,3,4,5};
    int len = sizeof(a)/sizeof(a[0]);
    f(0,a,len);
    for(int i = 0 ; i < len ; i++) cout<<a[i]<<" ";
    return 0;
}
