public class _16_REcPalidrom {
    static boolean f(int i, char c[]){
        if(i>=c.length/2) return true;
        if(c[i]!=c[c.length-i-1]) return false;
        return f(i+1, c);
        
    }
public static void main(String[] args) {
    String s = "ABHAYB";
    char c[] = s.toCharArray();
    System.out.println(f(0,c));
    }
} 
