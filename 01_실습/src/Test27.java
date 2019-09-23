import java.util.Arrays;

public class Test27 {
    public static void main(String[] args) {
        int v[] = {4, 5, 1, 6, 1, 3, 4, 5, 1};
        int c[] = new int[9];
        int rank = 0;

        Arrays.sort(v);

        for (int i = 0; i < v.length / 2; i++) {
            int temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }

        for (int i = 0; i < v.length; i++) {
            c[v[i]]++;
        }
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(c));

        for (int i = 0; i < v.length; i++) {

            if (c[i] > 0)
            {
                for (int j = 0; j < c[i] - 1; j++) {
                    System.out.print(rank);
                }
                rank++;
            }


        }


    }
}
