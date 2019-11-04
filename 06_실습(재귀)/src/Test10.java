/*
public class Test10 {
    public static void main(String[] args) {
        //대문자로 바꾸기
        //소문자인지 검사
        //v[1] >= 'a' && v[1] <= 'z'
        //대문자로 바꾸려면 'a' - 32 = 'A'
        String s = "South, Korea";
        char v[] = s.toCharArray();
        System.out.println(countUpper(v, 0));
    }

    private static int countUpper(char[] v, int i) {
        //i부터 끝까지
        if (i == v.length - 1) return v[i];

        if (v[i] >= 'a' && v[i] <= 'z')
            //char c = v[i];


        return countUpper(v, i + 1);
    }
}
*/
