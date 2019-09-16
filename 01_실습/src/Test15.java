import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random random = new Random();
        int n[] = new int[6];
        for (int i = 0; i < 6000; i++) {
            int v = random.nextInt(6) + 1;
            if (v == 1)
                n[0]++;
            else if (v == 2)
                n[1]++;
            else if (v == 3)
                n[2]++;
            else if (v == 4)
                n[3]++;
            else if (v == 5)
                n[4]++;
            else
                n[5]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(n[i] + " ");

        }
    }
}
