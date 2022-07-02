import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class k번째수 {
    public static class Solution {
        public static int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            // 전체 테스트 수
            for(int s=0; s < commands.length; s++){
                List<Integer> arr = new ArrayList<>();
                // commands에있는 케이스 숫자대로 반복
                for(int i = commands[s][0]-1; i < commands[s][1] ; i++ ){
                    arr.add(array[i]);
                }
                Collections.sort(arr);
                answer[s] = arr.get(commands[s][2]-1);

            }
            return answer;
        }


    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][]  commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(sol.solution(array, commands));
    }
}
