package src;

import java.util.Arrays;

public class 카카오블라인드_2 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int[] checkArr = new int[n];
        int cnt1 = 0;
        int cnt2 = 0;
        while(!Arrays.equals(deliveries, checkArr) && !Arrays.equals(deliveries, pickups) ){
            for(int i = n-1; i >= 0 ;i--){
                if(deliveries[i] != 0 || pickups[i] != 0){
                    answer += (i+1)*2;
//                    System.out.println("i = " + i);
                    for(int j =i;j >= 0; j--){
                        if(deliveries[i] > cap){
                            deliveries[i] -= cap-cnt1;
                            cnt1=cap;
                        }
                        if(cnt1 + deliveries[j] <= cap){
                            cnt1 += deliveries[j];
                            deliveries[j] = 0;
                        }
                        if(pickups[i] > cap){
                            pickups[i] -= cap-cnt2;
                            cnt2=cap;
                        }
                        if(cnt2 + pickups[j] <= cap){
                            cnt2 += pickups[j];
                            pickups[j] = 0;
                        }
                    }
                    cnt1 = 0;
                    cnt2 = 0;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        카카오블라인드_2 sol = new 카카오블라인드_2();
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        System.out.println("sol.solution() = " + sol.solution(cap, n, deliveries, pickups));
    }
}
