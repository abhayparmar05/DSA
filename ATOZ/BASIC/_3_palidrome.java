public class _3_palidrome {
    public static void main(String[] args) {
        int n = 21;
        int temp = n;
        int rev_num = 0 ; 
        while (n>0) {
            int ld=n%10;
            rev_num = (rev_num*10) + ld;
            n=n/10;
        }
        if (rev_num == temp) 
            System.out.println("number is Palidrome");
        else 
            System.out.println("number is not Palidrome");

    }
}
