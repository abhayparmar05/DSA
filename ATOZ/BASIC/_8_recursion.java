public class _8_recursion {
    static void test(int count){
        if(count==6){
            return;
        }
        System.err.println(count);
        count++;
        test(count);
    }
    public static void main(String[] args) {
        int count = 1;
        test(count);
    }
}
