import java.util.Arrays;

public class Test15 {
    public static void main(String[] args) {
        int v[]={10005,10002,10002,10001,10003};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int c[] = new int[v.length];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < c.length-1; i++) {
            if (max > v[i])
                max = v[i];

        }

    }
}
