import java.util.Arrays;

public class Test15 {
    public static void main(String[] args) {
        int v[]={10005,10002,10002,10001,10003};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int max = v[0], min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (max < v[i])
                max = v[i];
            if(min > v[i])
                min = v[i];
        }
        int c[] = new int[max-min+1];
        for (int i = 0; i < v.length; i++) c[v[i] - min]++;
        for (int i = 0, k = 0; i < c.length; i++) {
            while (c[i]-->0) v[k++] = i + min;
        }
    }
}
