import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) +1);
            set.add(num);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        boolean[] isUse = new boolean[arr.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == (int)map.get(arr[i] +1)){
                int tempJ = -1;
                for (int j = 0; j < 1002; j++) {
                    if(map.getOrDefault(j, 0) != 0) {
                        tempJ = j;
                        break;
                    }
                }
                if(tempJ != -1){
                    for(int l=0; l < map.get(i);l++){
                        sb.append(i).append(" ");
                    }
                    for(int l=0; l < map.get(tempJ);l++){
                        sb.append(tempJ).append(" ");
                    }
                    map.put(tempJ, 0);
                                        
                }else{

                }
            }

        }

// 1 1 1 1 2 2
// {1,1,1 ... }


    }
}
