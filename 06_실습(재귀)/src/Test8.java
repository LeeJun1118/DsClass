public class Test8 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(max(n,n.length- 1));
    }

    private static int max(int[] n, int i) {
        if (i == 0) return n[0];
        return n[i] > max(n,i-1) ? n[i] : max(n,i-1);
        //return Math.max(n[i], max(n, i - 1));


        /*교수님 코드
        if(n == 0) return n[0];

        int max = max(n,i-1);
        if(n[i] > max) return n[i];
        else return max;*/
    }
}

