package src;

import java.util.Arrays;

public class 프로그래머데브코선발코테_3 {
    int[][] location = {{0,-1}, {-1,0}, {-1, -1}, {1, 0}, {0, 1}, {1, 1}, {1, -1}, {-1, 1}};
    int answer = 0;
    int[][] mineMap;
    public int solution(int N, int[][] mine, int[] P) {

        mineMap = new int[N][N];

        // 지뢰 넣기
        for (int[] m : mine) {
//            System.out.println("m[0],m[1]"+ m[0] + " : " + m[1]);
            m[0]--;
            m[1]--;
            mineMap[m[0]][m[1]] = 9;
            for (int[] l : location) {
                if(m[0]+l[0] >= 0 &&  m[0] + l[0] < 9 && m[1]+l[1] >= 0 &&  m[1] + l[1] < 9)
                mineMap[m[0] + l[0]][m[1] + l[1]]++;
            }
        }
        boolean[][] isVisited = new boolean[N][N];


        // 지뢰 탐색
        dfs(isVisited, P[0]-1, P[1]-1,N);

        System.out.println(Arrays.deepToString(mineMap));
        return answer;
    }
    public void dfs(boolean[][] visited, int x, int y, int n){
        if(visited[x][y]) return;
        visited[x][y] = true;

        System.out.println("x : y = " + x +  " : "+ y);
        System.out.println("mineMap : " + mineMap[x][y]);
        if(mineMap[x][y] >= n){
            return;
        }

        answer++;

        for (int i =0; i < location.length; i++) {
            int nx=x+location[i][0];
            int ny=y+location[i][1];
            if(nx < 0 || nx >= n || ny < 0 || ny >= n ) continue;


            if(!visited[nx][ny]){
                // 12. DFS를 위한 재귀호출.
                dfs(visited, nx,ny,n);
                if(mineMap[nx][ny] == 0){

                }

            }

        }

    }


    public static void main(String[] args) {
        int n = 9;
        int[][] mine = {{1, 2}, {2, 6}, {3, 4}, {3, 8}, {4, 9}, {5, 4}, {5, 8}, {6, 7}, {7, 2}, {9, 1}};
        int[] p = {8,5};
        프로그래머데브코선발코테_3 sol = new 프로그래머데브코선발코테_3();
        System.out.println(sol.solution(n, mine, p));
    }
}
