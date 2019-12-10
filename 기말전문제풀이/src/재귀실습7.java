public class 재귀실습7 {
    public static void main(String[] args) {
        int n[] = {7,3,8,4,1};
        System.out.println(sum(n,0));
    }

    private static int sum(int[] n, int i) {
        if(i == n.length-1) return n[i];
        return n[i] + sum(n,i+1);
    }
}
