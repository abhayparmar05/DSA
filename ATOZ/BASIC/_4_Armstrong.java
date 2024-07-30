//thata the a number if the number cube then add that a number itself
// ex 371 = 3*3*3 + 7*7*7 + 1*1*1 = 371
public class _4_Armstrong{
    public static void main(String[] args) {
        int n = 371;
        int sum = 0 ;
        int temp = n ;
        while (n>0){
            int ld= n%10;
            sum = sum+(ld*ld*ld);
            n=n/10;
        }
        if(temp == sum) {
           System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
            
}
