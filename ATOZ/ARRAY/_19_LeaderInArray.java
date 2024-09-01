// arr[]={10,22,3,2,1,4} then leader is 22 
//after 22 all are smaller

import java.util.Arrays;

public class _19_LeaderInArray {
    public static void main(String[] args) {
       int a[] = {10,22,12,3,0,6};
       int ans[] =new int[a.length];
       int max = Integer.MIN_VALUE;
       int index=0;
       for (int i = a.length-1; i >=0; i--) {
        if(a[i]>max){
            max=a[i];
            ans[index]=a[i];
            index++;
        }
     }
    Arrays.sort(ans);
    int aa[] = Arrays.stream(ans).filter(num->num!=0).toArray();
    for (int i : aa) {
        System.out.println(i);
    }
    }
}
