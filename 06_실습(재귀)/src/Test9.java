public class Test9 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(max(n,0,n.length- 1));
    }

    private static long max(int[] n, int low, int high) {
        long left = max(n,low,high/2 -1);
        long right = max(n,high/2, high);
        if (low == high)
        return left >  right ? left : right;
    }
}
