//find largest emelemt from array
import java.util.Arrays;

public class A311{
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr); //time complexity nlog(n)
        System.out.println("len"+arr[arr.length - 1]);
        int max=arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if (max<arr[i+1]) {
                max = arr[i+1];
            }
        }    
        System.out.println("\nMaximum element in the array is: " + max);//o(n)
    }
}
