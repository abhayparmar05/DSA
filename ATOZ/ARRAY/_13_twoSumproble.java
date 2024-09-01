import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class _13_twoSumproble {
public static void main(String[] args) {
    int arr [] ={2,7,3,11,15};
    int target = 26;
    //bruteforce o(n^2)
    // for (int i = 0; i < arr.length; i++) {
    //     for (int j = i+1; j < arr.length; j++) {
    //         int sum=arr[i]+arr[j];
    //         if(sum==target) {
    //             System.out.println(i+" "+j+" "+sum);
             
    //         }
    //     }
    // }

    //better using map O(n)
    // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    // for (int i = 0; i < arr.length; i++) {
    //     int num = arr[i];
    //     int moreNeed = target-num;
     
    //     if(map.containsKey(moreNeed)) {
    //         System.out.println(map.get(moreNeed));
    //         System.out.println(i);
    //     }
        
    //     map.put(arr[i], i);
    // }    
    
    //two pointer approch
    Arrays.sort(arr);
    int right = arr.length - 1;
    int left = 0;
    while (left < right) {
        int sum = arr[left]+arr[right];
        if (sum==target) {
            System.out.println(left+" "+right);
            return ;
        }
        else if(sum>target){
            right--;
        }
        else if(sum<target){
            left++;
        }
    }
    
}    
}
