public class Test10 {
    public static void main(String[] args) {
        String s = "South, Korea 안녕";
        char v[] = s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }

    private static int toUpper(char[] v, int i) {
        if (i == v.length - 1) return v[i];
        if (v[i] >= 'a' && v[i] <= 'z')
            v[i] = (char) (v[i] - 32);

        return toUpper(v, i + 1);
    }
}

