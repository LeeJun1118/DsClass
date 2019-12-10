public class 재귀실습10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        if(i == v.length) return;
        if(v[i] >= 'a' && v[i] <= 'z') v[i] += 'A' - 'a';
        toUpper(v,i+1);
    }
}
