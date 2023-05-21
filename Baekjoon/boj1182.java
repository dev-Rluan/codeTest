import java.io.IOException;
import java.util.Scanner;
public class boj1182 {

    public static int[] arr;
    public static int n;
    public static int s;
    public static int answer = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        dfs(0,0);
        System.out.println(s==0 ? answer-1 : answer);

    }

    public static void dfs(int d, int sum){
        if(d == n){
            if(sum == s)
                answer++;
            return;
        }
        dfs(d + 1, sum + arr[d]);
        dfs(d + 1, sum);
    }
}

