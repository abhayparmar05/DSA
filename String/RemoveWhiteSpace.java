import java.util.Arrays;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "   Ja avav  avav  jj   ";
        String newstring = str.replaceAll("\\s","");
        System.out.println(newstring);
        //second method

        String temp = "";
        for(int i = 0; i < str.length();i++) {
            char c = str.charAt(i);
            if(!Character.isWhitespace(c)){
                temp += c;
            }    
        }
        System.out.println(temp);
        }
    }
