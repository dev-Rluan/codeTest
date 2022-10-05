
import java.util.*;
public class main {

    public static void main(String[] args){
        int[][] dir = {{0, -1}, {0,1}, {-1, 0}, {-1,0} };
        char[] alpha = {'L', 'R', 'U', 'D'};
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x=0; y = 0;
        for(int i=0; i < input.length; i++){
            for(int j =0; j < 4; j++){
                if(input[i] == alpha[j]){
                    int nx  = x + dir[0][j];
                    int ny = y + dir[1][j];
                }
            }
            
        }
        if(nx < 1 || ny < 1 || nx > n || ny > n){
            continue;
        }
        System.out.Println(x + ", " + y);
    }
}


