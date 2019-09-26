import java.util.Arrays;

public class Test29 {
    public static void main(String[] args) {
        //Test18번 참고하기
        //k = k%n.length

        int n[] = {1, 2, 3, 4, 5};
        rev(n, 0, n.length - 1);
    }

    private static void rev(int[] n, int s, int e) {
        //오른쪽 회전
        for (int i = s; s < e; e--) {
            System.out.println(Arrays.toString(n));
            swap(n,s, e);
            s++;
            e--;
            System.out.println(Arrays.toString(n));
        }
    }

    private static void swap(int n[], int j, int k) {
        for (int i = 0; i < j; i ++){

        }

        for (int i = j; i < k; j++){

        }
        int temp = n[j];
        n[j] = n[k];
        n[k] = temp;
    }

}
