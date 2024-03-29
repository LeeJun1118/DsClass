import java.util.Random;

public class Test1_2 {
    public static void main(String[] args) {
        int v[] = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < v.length; i++) v[i] = random.nextInt(1000000);
        int key = 1234;
        System.out.println(search(v, key));
    }

    private static int search(int[] v, int key) {
        int i = 0;
        int lastValue = v[v.length - 1];
        v[v.length - 1] = key;

        while (v[i] != key) i++;
        v[v.length-1] = lastValue; //복원

        if (i < v.length - 1) return i;

        if (key == lastValue) return v.length - 1;
        else return -1;
    }
}
