//find a maximum time occure 1 in array
//input a[1,1,0,1,1,1,0,1,1] ans = 3; //because 1 in middle occure 3 times
public class _10_MaximumCOnsictiveOne {
    public static void main(String[] args) {
        int a[]={1,1,1,1,0,1,1,1,0,1,1};
        int cont = 0 ; 
        int max=0;
        for(int i = 0 ; i<a.length ; i++) {
            if(a[i]==1){
                cont = cont+1;
                if(cont>max) max = max+1;
                
            }else{
                cont = 0;
            }
        }
        System.out.println(max);
    }
}
