import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

        int n[]  = {32,54,65,21,10};
        int max = n[0];
        //1.
        System.out.println("1.");
        for (int i = 0; i < n.length; i++)
        {
            if (n[i] > max)
                max = n[i];
        }
        System.out.println(max);
        System.out.println();

        //2.
        System.out.println("2.");
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[n.length-1]);

    }
}
