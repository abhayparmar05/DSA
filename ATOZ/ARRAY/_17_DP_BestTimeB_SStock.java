public class _17_DP_BestTimeB_SStock {
    public static void main(String[] args) {
        int maxProfit = 0 ;
        int a[]={7,1,2,3,5,3,6,3};
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            int cost =a[i]-min;
            maxProfit = Integer.max(maxProfit, cost);
            min=Integer.min(min, a[i]); 
        }
        System.out.println(maxProfit);
    }    
}
