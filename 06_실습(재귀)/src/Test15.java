import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        int R = 5, C = 5, count = 0;
        char ground[][] = new char[R][C];
        Random random = new Random();
        for (int i = 0; i < ground.length; i++) { // 임의 개수의 물웅덩이 포함 평면 생성
            for (int j = 0; j < ground[i].length; j++)
                ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
        }
        for (int i = 0; i < ground.length; i++) { // 평면 출력
            for (int j = 0; j < ground[i].length; j++) System.out.print(ground[i][j]);
            System.out.println();
        }
        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++) {
                if (ground[i][j] == '1') {
                    dfs(ground, R, C, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(char[][] ground, int R, int C, int i, int j) {
        ground[i][j] = '0';
        for (int dx = -1; dx <= 1; dx++)// dx = delta x => x방향으로의 변화량
        {
            for (int dy = -1; dy <= 1; dy++)
            {
                int r = i + dx, c = j + dy;
                if(r >= 0 && r < R && c >= 0 && c < C && ground[r][c] == '1')
                    dfs(ground, R, C, r, c);
            }
        }
        /*if (j > 0 && ground[i - 1][j + 1] == '1')
            dfs(ground, R, C, i - 1, j + 1);

        if (ground[i][j + 1] == '1')
            dfs(ground, R, C, i - 1, j + 1);

        if (ground[i + 1][j + 1] == '1')
            dfs(ground, R, C, i - 1, j + 1);

        if (ground[i - 1][j] == '1')
            dfs(ground, R, C, i - 1, j + 1);
        if (ground[i + 1][j] == '1')
            dfs(ground, R, C, i - 1, j + 1);

        if (ground[i - 1][j - 1] == '1')
            dfs(ground, R, C, i - 1, j + 1);

        if (j > 0 && ground[i][j - 1] == '1')
            dfs(ground, R, C, i, j - 1); // 교수님

        if (j - 1 >= 0 && i + 1 < R && ground[i + 1][j - 1] == '1')
            dfs(ground, R, C, i, j - 1); //교수님*/

    }
}
