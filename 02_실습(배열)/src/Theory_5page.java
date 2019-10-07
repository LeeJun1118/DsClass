import java.util.Arrays;

public class Theory_5page {
    public static void main(String[] args) {
        int n[] = new int[10];
        for (int i = 0; i < 5; i++)
            n[i] = i + 1;
        System.out.println(Arrays.toString(n));


        for (int j = 4; j >= 0; j--)
            n[j + 1] = n[j];
        n[0] = 9;
        System.out.println(Arrays.toString(n));
    }
}
