
public class A314 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,4,5,5,6,6};

    //    Set<Integer> ar = new HashSet<>();
        
    //     for(int i = 0 ; i < arr.length ; i++) {
    //         ar.add(arr[i]);
    //     }
    //     for (Integer test : ar) {
    //         System.out.print(test + " ");
    //     }
        //optimal solution
        int i = 0;
        System.out.println(arr[i]);
        for(int j = 1 ; j < arr.length ; j++) {
            if(arr[i] != arr[j]){
                arr[i+1]=arr[j];
                System.out.println(arr[i+1]);
                i++;
            }
        }
        
    }
}
