public class _19_HasMapCharcount {
    public static void main(String[] args) {
        String str = "1234@!#$%ABHAYBHAKTIabc";
        char c[]=str.toCharArray();

        int hash[] = new int[256];
        for (int i=0; i<c.length; i++){
            hash[c[i]]++;
        }
        for(int i=0; i<hash.length;i++){
            if(hash[i]!=0){
                System.out.println("Char:- "+(char)i+"  Index:- "+ i+ "  Value:- "+hash[i]);
            }else{
                continue;
            }
        }
    }

}
