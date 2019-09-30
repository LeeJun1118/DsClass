import java.util.Arrays;

public class Test22 {
    public static void main(String[] args) {
        int n[] = {4, 5, 1, 5, 1, 3, 4, 5, 1, 8, 9, 9, 9};
        int index = n.length - 1;
        Arrays.sort(n);
        int max = n[n.length - 1];
        int max2 = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] == max)
                index--;
        }
        max2 = n[index];
        System.out.println(max2);


        //교수님
        for (int i = 0; i <n.length; i++){
            if(n[i] > max) max = n[i];
        }
        System.out.println(max);
        int second = Integer.MIN_VALUE;
        boolean secondFlag = false;
        for (int i = 0; i< n.length; i++){
            if (n[i] == max) { continue;}
            if (n[i] > second) {
                secondFlag = true;
                second = n[i];
            }
        }
        //if(maxCount == 1) System.out.println(second);
        //else System.out.println(max);

    }

}
