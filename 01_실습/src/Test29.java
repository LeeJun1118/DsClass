import java.util.Arrays;

public class Test29 {
    public static void main(String[] args) {

        int n[] = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(n[n.length - 1]);

        for (int j = 0; j < k; j++) {

            int temp = n[n.length - 1];

            for (int i = n.length - 1; i > 0; i--) {
                n[i] = n[i - 1];
            }
            n[0] = temp;
        }
        System.out.println(Arrays.toString(n));


        //교수님
        //1.
        int v[] = {1,2,3,4,5};
        int w[] = new int[v.length];
        int k1 = 2;
        for (int i = 0; i < v.length; i++){
            w[(i+k1)%v.length] = v[i];
        }
        for (int i = 0; i < w.length; i++){
            v[i] = w[i];
        }
        System.out.println(Arrays.toString(v));

        //2.
        int v2[] = {1,2,3,4,5};
        k = k%v2.length;
        for (int i = 0; i < k; i++){
        rotate(v); //배열을 오른쪽으로 1회 회전
        }
        System.out.println(Arrays.toString(v));
    }

    private static void rotate(int[] v2) {
        int temp = v2[v2.length-1];
        for (int i = v2.length -2; i >= 0; i--){
            v2[i+1] = v2[i];
        }
        v2[0] = temp;
    }
}
