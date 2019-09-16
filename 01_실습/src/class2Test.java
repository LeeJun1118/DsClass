import static org.junit.Assert.*;

public class class2Test {
        public static void main(String[] args) {
            String s1 = "999999999999999999999999999999999999999999999";
            String s2 = "888888888888888888888888888888888888";
            char c = s1.charAt(s1.length() - 1);
            int[] n = new int[s1.length()-1];
            //String v = add(s1,s2);
            for (int i = 0; i < s1.length()-1; i++) {
                n[i] = s1.charAt(s1.length()-i-1);
            }
            for (int i = 0; i < n.length; i++){
                System.out.print(n[i]);
            }
    /*
     private static String add(String s1, String s2) {
        char c = s1.charAt(s1.length()-1);
        int[] n1 = new int[s1.length()];
        int[] n2 = new int[s2.length()];
        String result= "0";

        if (s1.length() > s2.length()){
            for (int i = 0; i < s1.length()-s2.length(); i++)
            {
                n2[i] = 0;
            }
            for (int i = s1.length() - s2.length(); i < s2.length()-1; i++)
            {
                n2[i] = s2.charAt(s2.length()-1);
            }
        }


        return result;
    }*/
        }
    }