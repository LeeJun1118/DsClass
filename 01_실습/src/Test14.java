import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print(random.nextInt(6) + 1 + " ");
        }
    }
}
