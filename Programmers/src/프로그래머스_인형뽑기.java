import java.util.Stack;

public class 프로그래머스_인형뽑기 {

    public static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;

            /**
             *
             [[0, 0, 0, 0, 0],
             [0, 0, 1, 0, 3],
             [0, 2, 5, 0, 1],
             [4, 2, 4, 4, 2],
             [3, 5, 1, 3, 1]],

             [1, 5, 3, 5, 1, 2, 1, 4]

             4 3 1 1 3 2 3
             */
            Stack<Integer> basket = new Stack<Integer>();

            System.out.println(board.length);

            for(int i = 0; i < moves.length; i++){
                int doll = drawDoll(board, moves[i]);
                if(doll == 0 ) continue;
                if(basket.isEmpty()){
                    basket.push(doll);
                }
                else{
                    if(basket.peek() == doll){
                        answer+= 2;
                        basket.pop();
                    }else{
                        basket.push(doll);
                    }
                }
                System.out.println(basket);
            }


            return answer;
        }

        private int drawDoll(int[][] board, int moves){
            int result = 0;
            for(int j = 0; j < board.length; j++){
                if(board[j][moves-1] == 0){
                    continue;
                }else{
                    result = board[j][moves-1];
                    board[j][moves-1] = 0;
                    return result;
                }
            }

            return 0;
        }
    }




    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        Solution sol = new Solution();
        System.out.println(sol.solution(board, moves));
    }
}
