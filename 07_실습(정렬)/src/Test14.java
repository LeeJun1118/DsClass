import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        int v[] = {87, 95, 53, 77, 100, 95, 14};
        sort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void sort(int[] v) {
        int c[] = new int[101];
        for (int i = 0; i < v.length; i++) c[v[i]]++;
        for (int i = 0, k = 0; i < c.length; i++) {
            for (int j = c[i]; j > 0; j--)
                v[k++] = i;
        }

    }
}
