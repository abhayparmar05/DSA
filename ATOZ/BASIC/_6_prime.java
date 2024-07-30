public class _6_prime {
    public static void main(String[] args) {
        int n =2;
        Boolean flage = false;
        for(int i = 2 ; i*i<=n;i++){
            if(n%i==0){
                flage = true;
                break;
            }
        }
        if(!flage){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}
