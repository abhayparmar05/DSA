//hello -> {h-1,e-1,l-2,o-1}

import java.util.HashMap;

public class StringOccurence {
    
    public static void main(String[] args) {
        String str = "test";
        HashMap<Character, Integer> result = new HashMap();
        
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(result.containsKey(c)){
                int val = result.get(c);
                result.put(c,val+1);
            }else{
                result.put(c, 1);
            }
        }
        System.out.println(result);

    }   
}
