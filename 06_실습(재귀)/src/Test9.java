public class Test9 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(max(n,0,n.length- 1));
    }

    private static long max(int[] n, int low, int high) {
        //low와 high의 중간 지점 찾기
        //v1, v2의 Math.max(v1,v2)
        //low == high -> return n[low]
        //(n,low,m)  (n,m+1,high)

    }
}
