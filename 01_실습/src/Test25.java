import java.rmi.dgc.VMID;
import java.util.Arrays;

public class Test25 {
    public static void main(String[] args) {
        int n[] = {4,5,1,6,1,3,4,5,1};

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        int mid = (n.length)%2;
        int m = (n.length)/2;
        float middle = 0;

        switch (mid){
            case 0:
                middle = (n[m] + n[m-1]);
                System.out.println(middle);
            case 1:
                middle = n[m];
                System.out.println(middle);
        }

    }
}
