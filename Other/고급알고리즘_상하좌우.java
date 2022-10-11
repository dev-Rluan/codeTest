
import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class 고급알고리즘_상하좌우 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] dir = {{0, -1}, {0,1}, {-1, 0}, {-1,0} };
        char[] alpha = {'L', 'R', 'U', 'D'};
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x=0;
        int y = 0;
        for(int i=0; i < input.length; i++){
            for(int j =0; j < 4; j++){
                if(input[i].charAt(0) == alpha[j]){
                    int nx  = x + dir[0][j];
                    int ny = y + dir[1][j];
                    if(nx < 1 || ny < 1 || nx > n || ny > n){
                        continue;
                    }
                    x = nx;
                    y = ny;
                }
            }
            
        }

        System.out.println(x + ", " + y);
    }
}


