import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17070 {
    static int[][] zip = null;
    static int answer= 0;

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        zip = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                zip[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp(1,1,1,2);
        System.out.println(answer);


    }

    public static void dp(int x1, int y1, int x2, int y2){
        if(x2 == n && y2 == n){
            answer++;
        }

        // 가로 상태일 때
        if(getOrientation(x1,y1,x2,y2) =='h'){
            // 가로 이동
            if(y2 < n && zip[x2-1][y2] != 1){
                dp(x2,y2,x2,y2+1);
            }
            // 대각선 이동
            if(y2 < n && x2 < n && isUse(x2,y2)){
                dp(x2, y2,x2+1 ,y2+1);
            }
        }else if(getOrientation(x1,y1,x2,y2)  =='v'){ // 세로 상태일 때
            // 세로 이동
            if(x2 < n && zip[x2][y2-1] != 1){
                dp(x2,y2,x2+1,y2);
            }
            // 대각선 이동
            if(y2 < n && x2 < n && isUse(x2,y2)){
                dp(x2, y2,x2+1 ,y2+1);
            }
        } else { // 대각선 상태일 때
            // 가로 이동
            if(y2 < n && zip[x2-1][y2] != 1){
                dp(x2,y2,x2,y2+1);
            }
            // 세로 이동
            if(x2 < n && zip[x2][y2-1] != 1){
                dp(x2,y2,x2+1,y2);
            }
            // 대각선 이동
            if(y2 < n && x2 < n && isUse(x2,y2)){
                dp(x2, y2,x2+1 ,y2+1);
            }
        }
    }

    public static boolean isUse(int x, int y){
        return zip[x][y] != 1 && zip[x - 1][y] != 1 && zip[x][y - 1] != 1;
    }
    public static char getOrientation(int x1, int y1, int x2, int y2) {
        if(x1 == x2){
            return 'h';
        }else if(y1 == y2){
            return 'v';
        } else{
            return 'd';
        }
    }



}
