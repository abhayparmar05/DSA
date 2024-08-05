//time complexity o(n)
//space o(n) because we modify the array
public class _5_LeftRotetdArray1place {
    public static void main(String[] args) {
     int[] a = {1,2,3,4,5,6};
     int temp = a[0];
     for (int i = 0; i<a.length-1; i++) {
         a[i]=a[i+1];
     }
     a[a.length-1]=temp;
     for(int i:a){
        System.err.println(i);
     }
    }
}
