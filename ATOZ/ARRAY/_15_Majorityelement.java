//element occurence more than n/2 times 
//not n/2 times

import java.util.HashMap;
import java.util.Map;

public class _15_Majorityelement {
public static void main(String[] args) {
    //optimal 
    int a[]={2,2,1,3,1,1,3,1,1};
    // Map<Integer, Integer> map = new HashMap<>();
    // int count=0;
    // for (int i=0; i<a.length; i++){
    //     map.put(a[i], map.getOrDefault(a[i],0)+1);
    // }

    // for (int i : map.keySet()) {
    //     if(map.get(i)>=a.length/2){
    //         System.out.println(i+":-"+map.get(i));
    //     }
    // }

    //moore's voting algorithm
    int count=0;
    int el=0;
    for (int i = 0; i < a.length; i++) {
        if(count==0) {
            count=1;
            el=a[i];
        }else if(a[i]==el){
            count++;
        }else{
            count--;
        }
    }
    int cunt1=0;
    for (int i = 0; i < a.length; i++) {
        if(a[i]==el) cunt1++;
    }
    if(cunt1>a.length/2){
        System.out.println(el);
    }
}    
}
