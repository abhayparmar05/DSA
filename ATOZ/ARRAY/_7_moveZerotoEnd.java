//two method 1.two pointer and 2.brut force
// in brut force method create a temp  and put non zero element and than temp push to main array linery then put zero at the end

// two pointer method code given below
public class _7_moveZerotoEnd {
    public static void main(String[] args) {
        int a[]={1,2,0,3,4,0,4,1,2,01,2,11,0,0,0,0,};
        int j = Integer.MAX_VALUE;
        //find  a first j index for point zero
        for (int i = 0; i < a.length; i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        //swap a array with non zero and push zero at the end 
        for (int i =j+1;i<a.length;i++){
            if(a[i]!=0){
                a[i]=a[i]+a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
                j++;
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
