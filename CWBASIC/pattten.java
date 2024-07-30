import java.lang.Math;
public class pattten {
    static void pattern5(int n) {
        // ***
        // **
        // *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.err.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        // *
        // ***
        // *****
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.err.print(" ");
            }
            // stare
            for (int j = 0; j < 2 * i + 1; j++) {
                System.err.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.err.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n) {
        // *****
        // ***
        // *
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.err.print(" ");
            }
            // stare
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.err.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.err.print(" ");
            }
            System.out.println();
        }
    }

    static void pattten9(int n) {
        // *
        // ***
        // *****
        // *****
        // ***
        // *
        pattern7(n);
        pattern8(n);
    }

    static void pattern10(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stared = i;
            if (i > n)
                stared = 2 * n - i;
            for (int j = 1; j <= stared; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattten11(int n) {
        // 0
        // 10
        // 010
        // 1010
        // 01010
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 1; j <= i; j++) {
                start = 1 - start;
                System.out.print(start);
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void pattern13(int n) {
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 
        int num =1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
        
    }

    static void pattern14(int n) {
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        for (char i = 0;i < n; i++) {
            for (char j = 'A'; j <= 'A'+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern15(int n) {
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        for (int i = 0;i < n;i++) {
            for (char ch = 'A' ; ch <= 'A'+(n-i-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern16(int n) {
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
        for (int i = 0;i < n;i++) {
            char ch = (char) ('A' +i);
            for (int j = 0; j <=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern17(int n) {
    //      A    
    //     ABA   
    //    ABCBA  
    //   ABCDCBA 
    //  ABCDEDCBA
        for (int i = 0; i < n;i++){
            //spaces 
            for (int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //char
            char ch ='A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j<=2*i+1;j++){

                System.out.print(ch);
                
                if (j<=breakpoint) ch++;   
                else
                    ch--;
            }  
            //spaces 
            for (int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }        
    }
    static void pattern18(int n){
        // E
        // ED
        // EDC
        // EDCB
        // EDCBA
        for (int i =0 ;i<n;i++){
            for (char j ='E';j>='E'-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        int spaces = 0;
        for (int i =0;i<n;i++){
            //stare
            for (int j =1;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stare
            for (int j =1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        //second half print 
        spaces = 8;
        for (int i =1;i<=n;i++){
            //stare
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stare
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }
    static void pattern22(int n){
        // 555555555
        // 544444445
        // 543333345
        // 543222345
        // 543212345
        // 543222345
        // 543333345
        // 544444445
        // 555555555
        for (int i = 0;i<2*n-1;i++){
            for (int j =0;j<2*n-1;j++){
                int top = i;
                int left = j ;
                int right =(2*n-2)-j;
                int down  = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top, down),Math.min(left, right)));  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        pattern22(n);
    }
}