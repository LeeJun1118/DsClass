import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

        String s1 = "99999999999999999999999999999999999999999999988888888888888888888";
        String s2 = "888888888888888888888888888888888888777777777777777777";
        String s3 = "";
        int[] n1 = new int[70];
        int[] n2 = new int[70];
        int[] sum =new int[70];
        int v1 = 0;
        int v2 = 0;
        char c1 = 0;
        char c2 = 0;

        //크기가 정확하게 안나옴 바이트 단위로 나오는 건가
        //s1과 s2는 4자리 차이가 나지만 s1.length()-s2.length() = 1 이 나옴
        //charAt으로 잘라서 배열에 넣는 것부터 먼저 해야함

        //** s1 잘라서 n1배열에 넣기
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(s1.length() - i - 1);
            v1 = c1 - '0';
            n1[n1.length - 1 - i] = v1;
        }

        //** s2 잘라서 n2배열에 넣기
        for (int i = 0; i < s2.length(); i++) {
            c2 = s2.charAt(s2.length() - i - 1);
            v2 = c2 - '0';
            n2[n2.length - 1 - i] = v2;
        }

        for (int i = 0; i < n1.length - 1; i++) {
            if ((n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) > 0) {
                sum[sum.length - 1 - i] = sum[sum.length - 1 - i] + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) % 10;
                sum[sum.length - 2 - i] = sum[sum.length - 2 - i] + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) / 10;
            }
        }
        for (int i = 0; i < sum.length; i++) {
            s3 = "" + s3 + sum[i];
        }
        System.out.println(s3);

    }
}