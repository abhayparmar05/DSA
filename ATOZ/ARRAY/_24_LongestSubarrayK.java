//Number of subarray with sum is equal to N

import java.util.HashMap;
import java.util.Map;

public class _24_LongestSubarrayK {
    public static void main(String[] args) {
        int a[]={1,2,3,-3,1,1,1,4,2,-3};
        int sum = 3,count=0;
        //time complexity = O(n)
        // for (int i = 0; i < a.length; i++) {
        //     int summ=0;
        //     for (int j = i; j < a.length; j++) {
        //         summ+=a[j];
        //         if(summ==sum){
        //             count++;
        //         }
        //     }
        // }

        Map<Integer, Integer> map = new HashMap<>();
        int presum=0;
        for (int i = 0; i < a.length; i++) {
            presum+=a[i];
            int remove = presum-sum;
            map.put(presum,map.get(presum)+1);
            count+=map.remove(remove);
        }
        System.out.println(count);

    }
}
