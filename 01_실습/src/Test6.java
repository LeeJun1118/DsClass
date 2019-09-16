public class Test6 {
    public static void main(String[] args) {
        int n = 987654321;
        int k = 4;
        for (int i = 0; i < k - 1; i++) {
            n = n / 10;
        }
        System.out.println(n % 10);
    }
}
