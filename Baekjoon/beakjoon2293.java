import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class beakjoon2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i = list.size()-1;i >=0; i--){
            if(k >= list.get(i)){

            }
        }

    }
}
