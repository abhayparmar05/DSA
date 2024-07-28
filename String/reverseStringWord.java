public class reverseStringWord {
    public static void main(String[] args) {
        String str = "Java Language test";
        String[] word = str.split(" ");
        String revWord = "";
        for(String c:word){
            System.out.println(c); 
            for(int i = c.length()- 1; i >= 0; i--){
                revWord+= c.charAt(i);
            }
            revWord+= " ";
        }
        System.out.println(revWord);
    }
}
