//check array is sortes or not

public class A313 {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = (int) (Math.random() * 100);
        //     System.out.print(a[i] + " ");
        // }
        int flag = 0 ;
        for(int i = 0 ; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                flag = 1 ;
            }
        }
        if(flag==0){
            System.out.println("Sortest");
        }else{
            System.out.println("not sortest");
        }
    }
}
