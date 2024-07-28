import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        String str = "test" ;
        
        System.out.println();
        //First method 
        StringBuilder sb = new StringBuilder();
        
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb); //output :- tes

        //SecondMethod 
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<str.length();i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch,i+1); //indexOf is used for check if char is occur or not
            if (index == -1) {
                sb1.append(ch);
            }
        }
        System.out.println(sb1); // outpur:- est

        //Third Method using toCharArray
        StringBuffer sb2 = new StringBuffer();
        
        char ch[] = str.toCharArray();
        for(int i = 0 ;i<str.length();i++) {
            boolean flage = false;
            for(int j = i+1 ; j<str.length(); j++) {
                if(ch[i]==ch[j]){
                    flage = true;
                    break;
                }
            }
            if(!flage){
                sb2.append(ch[i]);
            }
        }
        System.out.println(sb2);//output :- est

        //fourth method using hash 
        StringBuilder sb3 = new StringBuilder();
        Set<Character> st  = new LinkedHashSet<>();
        for(int i = 0 ; i < str.length();i++){
            st.add(str.charAt(i));
        }
           
        System.out.println(st);// outPut:- [t,e,s]
        for(Character c:st){
            sb3.append(c);
        }
        System.out.println(sb3);
    }
}
