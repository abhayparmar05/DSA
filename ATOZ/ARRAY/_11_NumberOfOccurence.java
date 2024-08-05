//done using map also

import java.util.HashMap;
import java.util.Map;

public class _11_NumberOfOccurence {
    public static void main(String[] args) {        
    //     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int a[]={1,1,2,2,3,4,5,8,9,8,9};
        
    //     for (int i = 0; i < a.length; i++) {
    //         if(map.containsKey(a[i])){
    //             map.put(a[i],map.get(a[i])+1);
    //         }else{
    //             map.put(a[i], 1);
    //         }
    //     }
    //     for (Map.Entry<Integer, Integer> e: map.entrySet()) {
    //        System.out.println(e);

    //     //    System.out.println(e.getKey());
    //     //    System.out.println(e.getValue());
    //    }

    //optimal 
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
            System.out.println(xor+" "+i);

        }
        System.out.println(xor);
    }
}
