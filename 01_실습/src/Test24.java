import java.util.Arrays;

public class Test24 {
    public static void main(String[] args) {
        int n[] = {4, 5, 1, 5, 1, 3, 4, 5, 1};
        int index[] = new int[n.length];
        int number = 1;
        Arrays.sort(n);

        for (int i = n.length-1; i >= 0; i--)
        {
            index[i] = number++;
            if (n[i] == n[i-1])
                index[i-1] = number;
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(index));

    }
}
