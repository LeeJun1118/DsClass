public class Test11 {
    public static void main(String[] args) {
        String s = "South, Korea";
        char v[] = s.toCharArray();
        System.out.println(countUpper(v, 0));
    }

    private static int countUpper(char[] v, int i) {
        if (i == v.length) return 0;
        if (v[i] >= 'A' && v[i] <= 'Z')
            return 1 + countUpper(v, i + 1);
        else
            return 0 + countUpper(v, i + 1);
    }
}
