//not allow increment by 1
// print  1 to N
public class _11_RecuBackTracking {
    static void test(int i){
        if(i<1){
            return;
        }
        test(i-1);
        System.err.println(i);
    }
    public static void main(String[] args) {
        test(5);
    }
}
