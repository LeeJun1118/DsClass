public class Test2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fac(5 ));
    }

    private static double fac(int n) {
        if (n==0) return 1;
        return n*fac(n-1 );
    }
}
