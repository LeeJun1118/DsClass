import java.util.Arrays;

public class Test23 {
    public static void main(String[] args) {
        int n[] = {4, 5, 1, 5, 1, 3, 4, 5, 1};
        Arrays.sort(n);
        int max = n[n.length-2];
        System.out.println(max);
    }
}
