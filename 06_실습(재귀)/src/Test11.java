public class Test11 {
    public static void main(String[] args) {
        String s = "SoutDDh, Korea";
        char v[] = s.toCharArray();
        System.out.println(countUpper(v, 0));
    }

    private static int countUpper(char[] v, int i) {
        if (i == v.length ) return v[i];
        if (v[i] >= 'a' && v[i] <= 'z')
            return v[i];
        return countUpper(v, i + 1);
    }
}
