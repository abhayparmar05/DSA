public class _14_sort012 {
    public static void main(String[] args) {
        // Array to sort
        int a[] = {1, 1, 1, 0, 0, 0, 1, 2, 2, 2, 1, 0};
        
        // Dutch National Flag algorithm
        int low = 0, mid = 0, high = a.length - 1;

        // Sorting the array
        while (mid <= high) {
            if (a[mid] == 0) {
                swapp(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                swapp(a, mid, high);
                high--;
            }
        }

        // Print the sorted array
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    // Swap method to swap two elements in the array
    public static void swapp(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
       //optimal
        // int a[]={1,1,1,0,0,0,1,2,2,2,1,0};
        // int cont= 0;
        // int cont1= 0;
        // int cont2= 0;

        // for (int i = 0; i < a.length; i++) {
        //     if(a[i]==0){
        //         cont++;
        //     }else if(a[i]==1){
        //         cont1++;
        //     }else{
        //         cont2++;
        //     }
        // }
        // System.out.println(cont+" "+cont1+" "+cont2);
        // for (int i = 0;i<=cont;i++) {
        //     a[i]=0;
        // }
        // for (int i=0;i<cont1;i++) {
        //     a[i+cont]=1;
        // }
        // for(int i=0;i<cont2;i++) {
        //     a[i+cont+cont1]=2;
        // }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+" ");
        // }
    