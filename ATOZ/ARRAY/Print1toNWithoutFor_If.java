
import java.util.stream.IntStream;

public class Print1toNWithoutFor_If {
    public static void main(String[] args) {
     IntStream in = IntStream.rangeClosed(1,10);
        
        in.forEach(System.out::println);
    }
}
