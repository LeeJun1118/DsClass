import java.util.Arrays;

public class Test29 {
    public static void main(String[] args) {

        int n[] = {1, 2, 3, 4, 5};

        System.out.println(n[n.length - 1]);
        int k = 6;
        for (int j = 0; j < k; j++) {

            int temp = n[n.length - 1];

            for (int i = n.length - 1; i > 0; i--) {
                n[i] = n[i - 1];
            }
            n[0] = temp;
        }
        System.out.println(Arrays.toString(n));
    }

}
