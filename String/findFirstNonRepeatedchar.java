//String str = AABBCCDEH;

import java.util.HashMap;
import java.util.Map.Entry;

public class findFirstNonRepeatedchar {
    public static void main(String[] args) {
        String str = "AABBCCDEH";
        //method 1 
        for (int i=0;i<str.length();i++){
            boolean unique=false;
            for (int j=0;j<str.length();j++){
                if(i!=j&& str.charAt(i)==str.charAt(j)){
                    unique=true;
                    break;
                }
            }
            if(!unique){
                System.out.print(str.charAt(i));//Output :- D
                break;//if break is absent then all unique element will print
            } 
        }
        //method 2 using java collection
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        for(Entry<Character,Integer> entrySet:map.entrySet()){
            if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                
            }
        }   
 }
}