public class Test3 {
    public static void main(String[] args) {
        int m = 2, n = 0;
        System.out.println(power(m,n));
    }

    private static long power(int m, int n) {
        if (n == 0) return 1;
        return m * power(m, n-1);
    }
}
