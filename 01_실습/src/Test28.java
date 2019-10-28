import java.util.Arrays;

public class Test28 {
    public static void main(String[] args) {
        int	v[]= {1,2,3,4,5};
        int	k=2;
        int	w[]=new int[v.length];
        for (int i = 0; i < v.length; i++) w[(i+k)%v.length]=v[i];
        for (int i = 0; i < w.length; i++) v[i]=w[i];
        System.out.println(Arrays.toString(v));
    }
}
