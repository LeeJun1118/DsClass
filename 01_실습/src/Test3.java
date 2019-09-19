public class Test3 {
    public static void main(String[] args) {
        System.out.println("3번");
        String s1 = "123" + "456";
        System.out.println(s1);
        String s2 = "123" + 456;
        System.out.println(s2);
        String s3 = 123 + "456";
        System.out.println(s3);
        String s4 = "" + 123 + 456;
        System.out.println(s4);
        String s5 = 123 + 456 + "";
        System.out.println(s5);

        String s6 = 890175453 + "";
        char x = s6.charAt(0);
        System.out.println(s6);
        for (int i = 1; i < s6.length(); i++){
            //s6 = s6.charAt(i);
        }

    }
}
