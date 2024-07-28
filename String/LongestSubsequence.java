
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubsequence {
    public static void main(String[] args) {
        String str = "abbac";
        String LongestSubsequence = null;
        int length = 0;
        Map<Character, Integer> map = new LinkedHashMap();
        char[] ch=str.toCharArray();

        for (int i=0; i<ch.length;i++){
            char c = ch[i];
            if(!map.containsKey(c)){
                map.put(c,i);
            }else{
                i = map.get(c);
                map.clear();
            }
            if(map.size() >length){ 
                length = map.size();
                LongestSubsequence = map.keySet().toString();
            }
        }
        System.out.println(length + "  "+LongestSubsequence);
    }
}
