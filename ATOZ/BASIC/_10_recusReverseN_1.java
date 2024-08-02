public class _10_recusReverseN_1 {
    static void rev(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        rev(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        rev(n);        
    }    
}
