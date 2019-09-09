import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

        int n[]  = {32,54,65,21,10};
        int max = n[0];
        //1.
        System.out.println("1.");
        for (int i = 0; i < n.length; i++)
        {
            if (n[i] > max)
                max = n[i];
        }
        System.out.println(max);
        System.out.println();

        //2.
        System.out.println("2.");
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[n.length-1]);

        //3-1.정렬하지 않고 가장 거리가 짦은 두 곳 찾기
        System.out.println("3.");

        //Math.abs를 하면 절댓값이 나옴
        //중복 없이 하려면 n*(n-1)/2
        long v[] = {34,76,11,3,7,13,9};
        int small;
        for (int i = 0; i < n.length - 1; i++)
            for (int j = i+1; j < n.length; j++)
            {
                  small =  Math.abs(n[i]-n[j]);
                  //if ()
            }

        //3-2정렬 후 가장 거리가 짧은 두 곳 찾기


        //4.
    }
}
