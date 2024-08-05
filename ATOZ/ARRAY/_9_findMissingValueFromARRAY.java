public class _9_findMissingValueFromARRAY {
public static void main(String[] args) {
    int a[] = {2,3,4,5};
    int n = 5;
    //Brut force
    // for(int i = 1 ; i <=n; i++) { //TC:- (n*w) SC:(1)
    //     int flag = 0 ; 
    //     for(int j =0;j<n-1;j++){
    //         if(a[j]==i){
    //             flag = 1;
    //             break;
                
    //         }
    //     }
    //     if(flag==0){
    //         System.out.println(i);
    //     }
    // }
    //Optimal solution using xor
    //1^1=0 same with all so non zero will be answer
    int xor=0,xor1=0;
    for(int i = 0 ;i<n-1;i++){
        xor1 =xor1^a[i];
        xor =xor^(i+1);
    }
    xor=xor^n;
    System.out.println(xor^xor1);

    //optimal solution TC:- O(n) SC:-O(1)
    // int sum = n*(n+1)/2;
    // int sum1=0;
    // for(int i=0;i<a.length;i++){
    //     sum1+=a[i];
    // }
    // System.out.println(sum-sum1);
}    
}
