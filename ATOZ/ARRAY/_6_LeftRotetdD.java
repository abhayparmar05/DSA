// time complexti O(a.length+d)
//space O(d)
//code is also be done by reverse array function
//eg a={1,2,3,4,5} d=3;
//output {4,5,1,2,3}
// so take d={1,2,3} and reverse so{3,2,1}
// take another parth {4,5} and reverse it {5,4}
//reverse both array first reverse second part then first part {4,5,1,2,3} 
public class _6_LeftRotetdD {
    public static void main(String[] args) {
        int d = 12;
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        int temp[] = new int[d];
        // storing a dth position array in temp array
        d=d%a.length;
        for(int i =0 ; i < d ; i++){
            temp[i] = a[i];
        }
        
        //move a array position in to d times
        for(int i = d ; i < a.length ; i++){
            a[i-d]=a[i];
        }

        //move temp array element into a
        for(int i=a.length-d ; i<a.length ; i++){
            a[i]=temp[i-(a.length-d)];
        }
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
