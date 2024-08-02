//time o(2^n)
public class _17_Recfibo {
    static int f(int n){
        if(n<=1){
            return n;
        }
        int sum = 0 ;
        int last = f(n-1);
        int Slast = f(n-2);
        sum = last + Slast;
        System.out.println("sum:- "+sum+"first:- "+last+"second:- "+Slast);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println();f(6);

    }
}
