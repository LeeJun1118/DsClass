public class Test11 {
    public static void main(String[] args) {

        String s = "Korea";
        char v[] = s.toCharArray();

        char c = v[0];

        System.out.println(c);
        c = (char) (c - 32);

        System.out.println(c);

        System.out.println(v[0]);
    }
}
