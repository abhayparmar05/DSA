public class _12_reccuBackTrakingN_1 {
    static void test(int i ){
        if(i>5){
            return;
        }
        test(i+1);
        System.out.println(i);
    }
    public static void main(String[] args) {
       test(1); 
    }
}
