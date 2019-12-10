public class 재귀실습6 {
    public static void main(String[] args) {
        int n[] = {7,3,8,4,1};
        System.out.println(sum(n,n.length-1));
    }

    private static int sum(int[] n, int i) {
        if(i == 0) return n[i];
        return n[i] + sum(n,i-1);
    }
}
