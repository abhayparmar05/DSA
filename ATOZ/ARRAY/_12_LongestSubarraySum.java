public class _12_LongestSubarraySum {
    public static void main(String[] args) {
        int a[] = {1,2,0,-1,3,1,1,1,1,3,3};
        int left = 0,right=0 ;
        int n = a.length;
        int maxLen = 0;
        int target = 6;
        int sum = a[0];
        while (right < n) {
            while (left<=right&&sum>target){
                sum-=a[left];
                left++;
            }
            if(sum==target){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n) sum+=a[right];
        }
        System.out.println(maxLen);
    }    
}
