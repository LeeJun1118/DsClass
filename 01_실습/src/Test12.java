public class Test12 {
    public static void main(String[] args) {
        int n[] = {77, 88, 99};
        String v = "";
        for (int i = 0; i < n.length; i++) {
            if (i != 0 && i != n.length) {
                v = v + ",";
            }
            v = v + n[i] + "";
        }
        System.out.println("[" + v + "]");

//        //교수님 코드
//        for (int i = 0; i < n12.length; i++) {
//            v12 = v12 + n12[i];
//            if (i < n12.length-1)
//            v12 = v12 + ",";
//        }
//        System.out.println("[" + v12 + "]");
    }
}
