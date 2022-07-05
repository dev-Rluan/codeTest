import java.util.*;
import java.util.Map.Entry;

public class 실패율 {
    public static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Map<Integer, Double> list = new HashMap<>();

            // 도전자 먼저 구하고
            // 그걸로 나누어야함
            for(int i = 0; i < N; i++){
                int cnt = 0;
                int clear = 0;
                for(int j = 0; j < stages.length; j++){
                    if(stages[j] > i){
                        cnt++;
                        if(stages[j] > i+1){
                            clear++;
                        }
                    }
                }

                System.out.println("main ::: clear : " +  clear + ", cnt : " +  cnt);
                if(cnt == 0) {
                    System.out.println("-------------");
                    list.put(i, (double)0);
                } else{
                    System.out.println("clear : " +  clear + ", cnt : " +  cnt);
                    list.put(i, (double)clear/cnt);
                }
            }
            // Map.Entry 리스트 작성
            List<Entry<Integer, Double>> list_entries = new ArrayList<>(list.entrySet());


            System.out.println(list_entries);
            list_entries.sort(Map.Entry.comparingByValue());
            System.out.println(list_entries);
            int c = 0;
            for(Map.Entry<Integer, Double> entry : list_entries){
                answer[c++] = entry.getKey()+1;
            }

            return answer;


        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages2 = {4,4,4,4,4};
        int[] stages3 = {3,3,3,3};
        int[] stages4 = {2,1,2,4,2,4,3,3};
        int N = 5;

        System.out.println(Arrays.toString(sol.solution(N, stages4)));

    }
}
