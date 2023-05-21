package src;

public class 프로그래머스_스프링코딩_3 {
    public static void main(String[] args) {
        프로그래머스_스프링코딩_3 sol = new 프로그래머스_스프링코딩_3();
//        int[][] queries =  {{2, 0}, {3, 1}};
        int[][] queries =  {{0, 2, 0, 1}, {0, 1, 0, 1}};
        System.out.println(sol.solution(queries).toString());
    }

    public int[] solution(int[][] queries) {
        /*
        1. 게임은 턴제로 진행되며, 항상 두명이 플레이함
        2. 초기에 0 이상 9 이하의 정수가 들어있는 배열이 주어짐, 양 플레이어는 하나의 배열을 공유하며 플레이
        3. 각 플레이어는 자신의 턴이 되면 다음과 같은 행동을 해야함
            1. 배열에서 0이 아닌수 구하기
            2. 고른 수에서 1 뺴기
        4. 3번 행동을 통해 배열을 팰린드롬으로 만들면 승리
        5. 팰린드롬이 되지 않았다면 상대방에게 턴이 넘어가며, 둘 중 한명이 승리 할 때까지 2~4번을 반복합니다.

        팰린드롬 게임을 진행할 때, 각 게임의 결과를 구해야한다. 단, 두사람 모두  최적으로 플레이 한다고 가정
        즉, 양 플레이어는 이기기위해 최선을 다 하며, 실수를 하지 않는다.

        초기배열이 홀수일때 : 가운데값 제외하고 양 옆 값만 비교
        초기배열이 짝수일때 : 양 옆 값 비교
         */
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int cnt = 0;
            for (int j = 0; j < query.length/2; j++) {
                System.out.println("query[i]" + query[i]);
                System.out.println("cnttt : " + Math.abs(query[j] - query[query.length - j-1]));
                System.out.println("cntt2 : " + query[j] + ", c; " + query[query.length - j-1]);

                cnt += Math.abs(query[j] - query[query.length - j-1]);
            }
            System.out.println("cnt : " + cnt);
            if(cnt%2 != 0){
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }
        }
        return answer;
    }

}
