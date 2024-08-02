//time complexity : O(n)
//space compl : - o(n)
public class _9_RecuNtimes {
    static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("test"+i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(1,n);
        
    }
}
