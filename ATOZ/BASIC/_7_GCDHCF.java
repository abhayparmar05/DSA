public class _7_GCDHCF {
    public static void main(String[] args) {
        int n = 20;
        int n1 = 10;
        // normal logic
        int min = n;
        if (n > n1) {
            min = n1;
        }
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && n1 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
    // Equlid algorithm
    while (n > 0 && n1 > 0) {
    if (n > n1)
    n = n1 % n1;
    else
    n1 = n1 % n;
    }
    if (n == 0)
    System.out.println(n1);
    else
    System.out.println(n);
}
