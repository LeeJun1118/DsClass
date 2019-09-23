import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Test29 {
    public static void main(String[] args) {
        //Test18번 참고하기

        int n[] = {1,2,3,4,5,};

        rev(n,0,n.length-1);
    }

    private static void rev(int[] n, int s, int e) {
        //오른쪽 회전
        for ( ; s < e; e--){
            swap(n[s],n[e]);
            s++;
            e--;
        }


    }

    private static void swap(int i, int i1) {

    }

}
