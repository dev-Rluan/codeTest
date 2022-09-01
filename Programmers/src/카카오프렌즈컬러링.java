package src;

public class 카카오프렌즈컬러링 {

    int numberOfArea;
    int maxSizeOfOneArea;

    int tempCnt;

    // 상하 좌우 탐색을 위한 배열
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;

        int maxX = picture.length;
        int maxY = picture[0].length;
        boolean[][] visited = new boolean[maxX][maxY];
        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < maxY; y++) {
                if(picture[x][y] != 0 && !visited[x][y]) {
                    numberOfArea++;
                    dfs(x, y, picture, visited);
                }
                if(tempCnt > maxSizeOfOneArea){
                    maxSizeOfOneArea = tempCnt;
                }
                tempCnt = 0;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    // 현재 찾는 위치
    public void dfs(int x, int y,int[][] picture,  boolean[][] visited){
        if(visited[x][y]) return;
        visited[x][y] = true;

        tempCnt++;

        // 좌표 탐색
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // picture 배열의 범위를 벗어나면 continue.
            if(nx<0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

            //  현 좌표의 색 == 상,하,좌,우 좌표의 색 && 방문한적 없는 상,하,좌,우 좌표라면.
            if(picture[x][y] == picture[nx][ny] && !visited[nx][ny]){
                // 12. DFS를 위한 재귀호출.
                dfs(nx,ny,picture,visited);
            }
        }

    }

    public static void main(String[] args) {
        카카오프렌즈컬러링 sol = new 카카오프렌즈컬러링();
        int m = 0;
        int n = 0;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println("sol.solution = " + sol.solution(m, n, picture));
    }

}
