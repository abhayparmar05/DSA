public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";

        //first method Using toCharArray
        char[] ch= str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();

        //Second Method using charAt
        for (int i=str.length()-1;i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        //Third Method Using StringBuffer
        StringBuffer sb = new StringBuffer("test");
        System.out.println(sb.reverse());
        
        //Fourth Method Using StringBuilder
        StringBuilder sbulid = new StringBuilder("test");
        System.out.println(sbulid.reverse());

    }
}