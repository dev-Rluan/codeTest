import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        long tempMax = 0;
        long tempMin = 0;

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            trees[i] = num;
            if(num > tempMax){
                tempMax = num;
            }
        }

        while(tempMin < tempMax){
            long mid = (tempMax + tempMin)/2;
            long sum = 0;
            for (int tree : trees) {
                if(tree - mid > 0){
                    sum+= (tree-mid);
                }
            }
            if(sum < m){
                tempMax = mid;
            } else{
                tempMin = mid +1;
            }

        }
        System.out.println(tempMin-1);

    }
}
