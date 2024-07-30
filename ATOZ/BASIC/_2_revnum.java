public class _2_revnum {
    public static void main(String[] args) {
        int n = 1234;
        int revNum = 0; 
        while (n>0) {
            int lastdigit = n%10;
            revNum =(revNum*10)+lastdigit ;
            n=n/10;
        }
        System.out.println(revNum);
    }
}
