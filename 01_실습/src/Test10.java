import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

        String s1 = "99999999999999999999999999999999999999999999988888888888888888888";
        String s2 = "888888888888888888888888888888888888777777777777777777";

        //길이가 다를 수 있으니 몇개를 덧붙일지 모르니까
        String zeros = "", v = "";
        for (int i = 0; i < Math.abs(s1.length()- s2.length()); i++){
            zeros = zeros + "0";
        }
        if (s1.length() > s2.length()) s2 = zeros + s2;
        else
            s1 = zeros + s1;
        int carry = 0;

        for (int i = s1.length()-1; i >= 0; i--){
            int sum = carry + s1.charAt(i) - '0' + s2.charAt(i) - '0';
            v = (sum%10) + v; //carry 따로 계산해야함
            //캐리가 0보다 크면 v앞쪽에다 붙여줘야함
        }



        //처음에는 올림수를 0으로 지정을 한다.
        //배열 안써도 될 듯 하다.
        //제일 마지막에 올림수가 있으면 하나더 올림수를 덧붙여주는 작업
        //
//        for (int i = 0; i < n1.length - 1; i++) {
//            if ((n1[n1.length - 1 - i] + n2[n2.length - 1 - i])%10 > 0) {
//                //배열에 안넣고 String에 s3에 하나씩 넣는게 더 쉬울듯하다.
//                //Test3파일 참조해서 해보자
//                s3 = s3 + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) % 10;
//                //sum[sum.length - 1 - i] = sum[sum.length - 1 - i] + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) % 10;
//                //sum[sum.length - 2 - i] = sum[sum.length - 2 - i] + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) / 10;
//            }
//            if ((n1[n1.length - 1 - i] + n2[n2.length - 1 - i])/10 > 0) {
//                s3 = s3 + (n1[n1.length - 1 - i] + n2[n2.length - 1 - i]) % 10;
//            }
//
//        }
//        for (int i = 0; i < sum.length; i++) {
//            s3 = "" + s3 + sum[i];
//        }
//        System.out.println(s3);

        //내코드
        // 999999999910888888888888888888888888888888888877666666666666666665
        //BigInteger
        // 100000000000888888888888888888888888888888888877666666666666666665
        // 계속 더하다가 s2의 8이 끝나고 더이상 더해질게 없는 s1은 9만 계속 나오는데 뒤의 연산의 결과로
        // 9에 1이 계속 더해져 0000~ 이 나오다가 끝에 1이 출력된다.
   }
}