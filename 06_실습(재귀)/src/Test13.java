import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(n, 0);
        System.out.println(Arrays.toString(n));
    }

    private static int reverse(int[] n, int i) {
        if (i == n.length/2) return n[i];
        int temp = n[i];
        n[i] = n[n.length-1-i];
        n[n.length-1-i] = temp;
        return reverse(n,i+1);
    }
}
