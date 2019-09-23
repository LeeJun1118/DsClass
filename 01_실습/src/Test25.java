import java.rmi.dgc.VMID;
import java.util.Arrays;

public class Test25 {
    public static void main(String[] args) {
        //정렬하고 시작
        //중앙 위치의 값을 찾은 것
        //홀수 일때는 중앙 위치가 정확하게 나오지만 짝수 일때는 두개가 걸쳐있다. 그 두개를 더해서 평균을 낸다.
        // 길이 % 2 == 0 짝수 ,  길이 % 2 == 1 홀수
        // 짝수일때는 길이를 2로 나눈 위치와 그 위치 - 1 의 위치를 더해서 평균을 내야한다.

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
