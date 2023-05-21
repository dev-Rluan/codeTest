package src;

import java.util.HashMap;

public class 프로그래머스_스프링코딩_1 {
    public static void main(String[] args) {
//        int[][] lotteries = {{100, 100, 500}, {1000, 1000, 100}};
//        int[][] lotteries = {{10, 19, 800}, {20, 39, 200}, {100, 199, 500}};
        int[][] lotteries = {{50, 1, 50}, {100, 199, 100}, {1, 1, 500}};
        프로그래머스_스프링코딩_1 sol = new 프로그래머스_스프링코딩_1();
        System.out.println(sol.solution(lotteries));
    }
    public int solution(int[][] lotteries) {
        int answer = 0;
        /* 복권 구매
        복권은 여러개 중에 하나 구매 가능

        복권에 대해 알고 있는 정보
        1. 당첨자 수
        2. 구매한 사람 수
        3. 당첨 금액

        복권 추첨
        1. 당첨자 수 보다 구매한 사람 수가 같거나 적을 경우 구매한사람 모두가 당첨
        2. 당첨자 수 보다 구매한 사람 수가 많을 경우 무작위로 당첨자가 정해짐

        나의 목표
        1. 가장 확률이 높은 복권
        2. 가장 당첨 확률이 높은 복권이 여러개라면 당첨 금액이 높은 순서로


        */
        double percent = 0;
        int cnt = 0;
        int maxAmount = 0;
        for (int i = 0; i < lotteries.length; i++) {
            cnt++;
            int[] lottery = lotteries[i];
            System.out.println(lottery[0] + " : " + (lottery[1] + 1));
            if(lottery[0] >= lottery[1]+1){
                if(percent >= 100){
                    if(lottery[2] > maxAmount){
                        maxAmount = lottery[2];
                        answer = cnt;
                    }
                }else {
                    percent = 100;
                    maxAmount = lottery[2];
                    answer = cnt;
                }

            } else{
                System.out.println(percent);
                if(percent < (double)lottery[0] / (double)(lottery[1]+1) * 100.0) {
                    percent = (double)lottery[0] / (double)(lottery[1]+1) * 100.0;
                    maxAmount = lottery[2];
                    answer = cnt;
                }else if(percent == (double)lottery[0] / (double)(lottery[1]+1) * 100.0) {
                    if(lottery[2] > maxAmount){
                        maxAmount = lottery[2];
                        answer = cnt;
                    }
                }
            }
            System.out.println("test" + (double)lottery[0] / (double)(lottery[1]+1) * 100.0);
        }


        return answer;
    }

}
