public class removeSpecialChar {
    public static void main(String[] args) {
        String str ="@1727##ABc";
        //1 Method using ReplaceAll()
        String s=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
