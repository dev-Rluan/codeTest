import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj14500 {
    static int[][] arr = null;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
        }


    }



    public static int t1(int x,int y){
        int maxSum = 0;
        int sum = 0;
        if(arr.length <= x+4){
            for (int i = 0; i < 4; i++) {
                sum += arr[x+i][y];
            }
        }
        if(sum > maxSum){
            maxSum = sum;
        }
        sum =0;
        if(arr.length > y+4){
            for (int i = 0; i < 4; i++) {
                sum += arr[x][y+i];
            }
        }
        if(sum > maxSum){
//            maxSum =
        }
        return maxSum;
    }
}
