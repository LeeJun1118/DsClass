import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

        String s1 = "99999999999999999999999999999999999999999999988888888888888888888";
        String s2 = "888888888888888888888888888888888888777777777777777777";

        //길이가 다를 수 있으니 몇개를 덧붙일지 모르니까
        String zeros = "";
        String v = "";
        for (int i = 0; i < Math.abs(s1.length()- s2.length()); i++){
            zeros = zeros + "0";
        }
        if (s1.length() > s2.length()) s2 = zeros + s2;
        else
            s1 = zeros + s1;
        int carry = 0;

        for (int i = s1.length()-1; i >= 0; i--){
            int sum = carry + s1.charAt(i) - '0' + s2.charAt(i) - '0';
            v = (sum%10) + v;
            carry = (sum/10);
        }
        if (carry > 0)
            v = carry + v;
        System.out.println(v);

   }
}