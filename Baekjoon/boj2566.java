import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2566 {
    public static void main(String[] args) throws IOException {
        int x = 0;
        int y = 0;
        int maxNum = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num =Integer.parseInt(st.nextToken());
                if(maxNum < num){
                    x = i+1;
                    y = j+1;
                    maxNum = num;
                }

            }

        }
        System.out.println(maxNum + "\n" + x + " " + y);
    }
}
