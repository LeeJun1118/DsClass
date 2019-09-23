import java.util.Arrays;

public class Test26 {
    public static void main(String[] args) {
        // O(nlogn)
        // 1. 정렬
        // 2. 인접한 것들이 같으면 중복된 값
        // 3. 출력을 하는 상황을 인접한 두개를 검사를 해서
        // 4. if(v[i-1] != v[i]) v[i] 출력  -> i = 1 ~ v.length-1
        // 5. v[0] 번째는 무조건 출력
        int n[] = {4,5,1,6,1,3,4,5,1};
        Arrays.sort(n);

        System.out.println(n[0]);

        for (int i = 1; i < n.length; i++){

            if (n[i-1] != n[i])
                System.out.println(n[i]);
        }


        // O(n)
        // 범위가 정해져 있으면 O(n)의 시간에 중복을 제거할 수 있다.(계수 정렬)
        // c라는 배열을 하나 만들어 범위는0~9까지
        //
        //i = 0 ~ 끝까지
        // c[v[i]]++
        //if (c[i] > 0) i를 출력

        int v[] = {4,5,1,6,1,3,4,5,1};
        int c[] = new int[10];
        for (int i = 0; i < v.length; i++){
            c[v[i]]++;
        }
        for (int i = 0; i < c.length; i++)
            if (c[i] > 0)
                System.out.println(i);

    }
}
