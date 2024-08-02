//hash map
public class _18_HASHMAPcountArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,2,3,4,3,2,1,5,6,33,4,2,2};
        int hash[]=new int[34];
        for(int i=0;i<=arr.length;i++){
            hash[arr[i]]+=1;
        }
        for(int i=0;i<=hash.length;i++){
            if(hash[i]!=0){
                System.out.println("index :- "+i+" value:- "+hash[i]);
            }
            else{
                continue;
            }
        }
    }
}
