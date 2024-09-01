//minimum subarray sum
public class _16_Kadnela {
    public static void main(String[] args) {
        int arr[]={-1,-2,1,4,2,-1,-4,5,1,-3};
        int a[]={-1,-2,-3};
        int sum =0; 
        int start=0;
        int ansStart=0,ansEnd=0;
        int max=Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if(sum ==0 ) start=i;
            sum+=arr[i];
            if (sum <0) {
                sum = 0 ;
                
            }
            ansStart=start;
            
            if(sum>max){
                max=sum;
                ansEnd=i;
            }
        }
        System.out.println(max);
        System.out.println(ansStart+" "+ansEnd);
    }    
}
