import java.util.Arrays;

public class ReplaceCharWithOccurence {
    public static void main(String[] args) {
        String str = "tets";
        char replaceTheChar ='t';

        //check Char is present in string or not
        if(str.indexOf(replaceTheChar)==-1){
            System.out.println("CharNot Not Found");
            System.exit(1);
        } 
        char ch[] = str.toCharArray();
        int count=1;
        // for(int i=0;i<str.length();i++){
        //     if(ch[i]==replaceTheChar){
        //         ch[i] =String.valueOf(count).charAt(0);
        //         count++;
        //     }
        // }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==replaceTheChar){
                str=str.replaceFirst(String.valueOf(replaceTheChar),String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
}
