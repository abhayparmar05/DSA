// find second largest element from array
import java.util.Arrays;

public class A312 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        int sortLargest = arr[arr.length - 1];
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (sortLargest != arr[i]) {
                sortLargest = arr[i];
                break;
            }
        }
        System.out.println("\n Second Largest with Sort :- " + sortLargest); //o(n)

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE ; //if array has a nagative than also run else use -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Using without sort : " + secondLargest); // O(2n)

        //method 3 
        int lrg = arr[0];
        int slrg = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(lrg < arr[i]){
                slrg = lrg;
                lrg = arr[i];
            }
            else if(arr[i]<lrg) {
                slrg = arr[i];
            }
    }   
    System.out.println(slrg);
}
}