public class 없는숫자더하기 {

    public static class Solution {
        public int solution(int[] numbers) {
            int answer = 45;

            for(int i = 0; i < numbers.length; i++){
                answer -= numbers[i];
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        Solution sol = new Solution();
        System.out.println(sol.solution(numbers));
    }
}
