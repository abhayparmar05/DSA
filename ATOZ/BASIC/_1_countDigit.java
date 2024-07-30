import java.math.*;
public class _1_countDigit {
    public static void main(String args[]){
        int n =1299;
        int cnt = (int)(Math.log10(n))+1; //first method
        int lastdigit=0;
        int count=0;
        while(n>0){  // O(log10(n)) time complexity
            lastdigit=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Using Log Method :- "+cnt);
        System.out.println("Using A dev & mod Metohd :- "+count);
    }
}