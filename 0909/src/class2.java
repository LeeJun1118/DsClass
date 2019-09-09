import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class class2 {

    public static void main(String[] args) {
        //BigInteger 문제
        //두 String의 길이를 맞춘 후 같은 인덱스 자리의 수를 더한다.
        //더하고 나면 '3' , '9' 라는 문자가 나온다.
        //이걸 정수로 계산해서 int형으로 출력시킨다.
        // 3+9 = 12    12/10 = 1    12%10 = 2

        //1.
        System.out.println("1번");
        String title = "문제해결기법";
        int publicationYear = 2018;
        double weight = 857.4;
        boolean supplementYN = false;
        char language = 'K';
        System.out.println(title + "," + publicationYear + "," + weight + "," + supplementYN + "," + language);

        //1-1
        System.out.println("2번");
        String title1 = "자료구조";
        int year = 2017;
        double length = 2.5;
        boolean supplement = true;
        char lang = '한';
        System.out.println(title1 + "," + year + "," + length + "," + supplement + "," + lang);

        //3.
        System.out.println("3번");
        String s1 = "123" + "456";
        System.out.println(s1);
        String s2 = "123" + 456;
        System.out.println(s2);
        String s3 = 123 + "456";
        System.out.println(s3);
        String s4 = "" + 123 + 456;
        System.out.println(s4);
        String s5 = 123 + 456 + "";
        System.out.println(s5);

        //4.
        System.out.println("4번");
        int n = 1;
        int m = 2;
        System.out.println(n / m);

        //5.
        System.out.println("5번");
        int n1 = 5;
        int m1 = 2;
        System.out.println(n1 / m1);
        System.out.println(n1 % m1);

        //6.
        System.out.println("6번");
        int n2 = 987654321;
        int k = 4;
        int tmp = 0;

        for (int i = 0; i < k - 1; i++) {
            n2 = n2 / 10;
        }
        System.out.println(n2 % 10);

        //7.
        System.out.println("7번");
        int n3 = Integer.MAX_VALUE;
        int m3 = Integer.MIN_VALUE;
        System.out.println(n3);
        System.out.println(m3);
        long v = Long.MAX_VALUE;
        long w = Long.MIN_VALUE;
        System.out.println(v);
        System.out.println(w);


        //8번
        System.out.println("8번");
        long n4 = 20000000000L; // 200억
        System.out.println(n4);

        //9.
        System.out.println("9번");
        int n5 = 2000000000;
        System.out.println((long) n5 + n5);

        //10번.
        System.out.println("10번");
        String st1 = "999999999999999999999999999999999999999999999";
        String st2 = "888888888888888888888888888888888888";
        int v2 = 2;
        String x = 2 + "";

        //12.
        System.out.println("12번");
        int n12[] = {77, 88, 99};
        String v12 = "";
        for (int i = 0; i < n12.length; i++) {
            if (i != 0 && i != n12.length) {
                v12 = v12 + ",";
            }
            v12 = v12 + n12[i] + "";
        }
        System.out.println("[" + v12 + "]");

//        for (int i = 0; i < n12.length; i++) {
//            v12 = n12[i];
//
//        }


        //13
        System.out.println("13번");
        Random random = new Random();
        int v13 = random.nextInt(3);
        System.out.println(v13);

        //14.
        System.out.println("14번");
        Random random14 = new Random();
        for (int i = 0; i < 20; i++) {
            int v14 = 1 + random14.nextInt(6);
            System.out.print(v14 + " ");
        }

        //15.
        System.out.println();
        System.out.println("15번");
        Random random15 = new Random();
        int n15[] = new int[6];
        for (int i = 0; i < 6000; i++) {
            int v15 = 1 + random15.nextInt(6);
            if (v15 == 1)
                n15[0]++;
            else if (v15 == 2)
                n15[1]++;
            else if (v15 == 3)
                n15[2]++;
            else if (v15 == 4)
                n15[3]++;
            else if (v15 == 5)
                n15[4]++;
            else
                n15[5]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(n15[i] + " ");

        }

        //16번
        System.out.println();
        System.out.println("16번");
        int n16[] = {5, 7, 9, 1, 3, 5, 8, 2, 4, 9};
        Arrays.sort(n16);
        System.out.println(Arrays.toString(n16));

        //17번
        System.out.println("17번");
        int n17[] = {5, 7, 9, 1, 3, 5, 8, 2, 4, 9};
        Arrays.sort(n17);
        for (int i = n17.length - 1; i >= 0; i--) {
            System.out.print(n17[i] + " ");
        }
        System.out.println();

        //18.
        System.out.println("18번");
        int n18[] = {5, 7, 9, 1, 3, 5, 8, 2, 4, 9};
        Arrays.sort(n18);
        for (int i = n18.length - 1; i >= 0; i--) {
            System.out.print(n18[i] + " ");
        }


        //17. 0번째랑 끝이랑 위치를 바꾼다. 중앙위치까지만 돌린다.
        //   0  ~  n/2 -1
        /*
        int n17 = 77, m17 = 8;
        System.out.println(n17 + "," + m17);
        int temp = n17;
        n17 = m17;
        m17 = temp;
        System.out.println(n17 + "," + m17);*/


        //19번


        //21번
        System.out.println();
        System.out.println("21번");
        long start;
        int N = 1000000, M = 100;
        int n21[] = new int[N];
        Random random21 = new Random();

        for (int i = 0; i < N; i++) n21[i] = random21.nextInt(M);
        start = System.currentTimeMillis();
        Arrays.sort(n21); // 배열 정렬
        System.out.println("최대값:"+n21[n21.length-1]); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력

        for (int i = 0; i < N; i++) n21[i] = random21.nextInt(M);
        start = System.currentTimeMillis();
        int max = n21[0];
        for (int i = 1; i < n21.length; i++) {
            if (n21[i] > max) max = n21[i];
        }
        System.out.println("최대값:" + max); // 최대값 출력
        System.out.println("소요시간:"+(System.currentTimeMillis()-start)+" ms"); // 소요 시간 출력


    }

}
