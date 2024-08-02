//two pointer reverse array is available in recarray.cpp file
public class _15_RECRev_array {
    //simple method
    static void rev(int n,int[]a){
        if(n<0){
            return;
        }
        System.out.print(a[n]);
        rev(n-1, a);
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;

        rev(n-1, a);
    }
}
