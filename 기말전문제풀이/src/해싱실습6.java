import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class 해싱실습6 {
    public static void main(String[] args) {
        /*//1.최빈값 찾기
        int n[] = {1,2,7,7,7,7,4,7,5,2,};

        int maxCount = 0, maxValue = n[0];
        for (int i = 0; i < n.length; i++){
            int count = 0;
            for (int j = 0; j < n.length; j++){
                if(n[i] == n[j])
                    count++;
            }
            if (count > maxCount){
                maxCount = count;
                maxValue = n[i];
            }
        }*/

        /*//2번
        int n[] = {1, 2, 7, 7, 7, 7, 4, 7, 5, 2,};

        Arrays.sort(n);
        int maxCount = 0, maxValue = n[0], count = 1;
        for (int i = 1; i < n.length; i++) {
            if (n[i - 1] != n[i]) { //n[i-1] 값의 연속의 마지막 지점
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = n[i - 1];
                }
                count = 0;
            }
            count++;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = n[n.length - 1];
        }*/


        /*//3번
        int n[] = {1, 2, 7, 7, 7, 7, 4, 7, 5, 2,};
        HashMap<Integer, Integer> ht = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            if (ht.containsKey(n[i])) ht.put(n[i], ht.get(n[i]) + 1);
            else
                ht.put(n[i], 1);
        }
        int maxValue = n[0], maxCount = 0;
        for (int key :
                ht.keySet()) {
            int count = ht.get(key);
            if (count > maxCount){
                maxCount = count;
                maxValue = key;
            }
        }*/

        /*//4번
        int n[] = {1, 2, 7, 7, 7, 7, 4, 7, 5, 2,};
        TreeMap<Integer, Integer> ht = new TreeMap<>();
        for (int i = 0; i < n.length; i++) {
            if (ht.containsKey(n[i])) ht.put(n[i], ht.get(n[i]) + 1);
            else
                ht.put(n[i], 1);
        }
        int maxValue = n[0], maxCount = 0;
        for (int key :
                ht.keySet()) {
            int count = ht.get(key);
            if (count > maxCount){
                maxCount = count;
                maxValue = key;
            }
        }*/


        //5번
        int n[] = {1, 2, 7, 7, 7, 7, 4, 7, 5, 2,};
        int count[] = new int[101]; // 0 ~ 100
        for (int i = 0; i < n.length; i++) count[n[i]]++;
        int maxCount = 0, maxValue = n[0];
        for (int i = 0; i < count.length; i++){
            if (count[i] > maxCount){maxCount = count[i]; maxValue = i;}
        }
        System.out.println(maxValue);
    }
}
