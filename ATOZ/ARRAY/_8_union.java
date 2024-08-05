//two method 1.using a set 2.two pointer

import java.util.HashSet;
import java.util.Set;

public class _8_union {
    //two pointer approch
    public static void main(String[] args) {
        int a[]={1,1,2,1,3,4,2,3};
        int b[]={3,4,5,6,7,5,4,1};
        Set<Integer> s= new HashSet();
        for (int i=0; i<a.length; i++){
            s.add(a[i]);
        }
        for (int i=0; i<b.length; i++){
            s.add(b[i]);
        }
        for(int i:s){
            System.out.println(i);
        }
    }

}   
