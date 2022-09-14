package src;

import java.lang.reflect.Array;

public class K진수에서소수찾기 {

    String str = "";
    public int solution(int n, int k) {
        /**
         * 1. n을 k진수로 진수변환
         * 2. n을 0으로 구분해서 배열로 뽑기
         * 3. 배열에 있는 값을 다시 10진수로 변환해서 소수인지 검사
         * 4. 맞으면 answer값 늘려주기
         */
        int answer = 0;

        while(n > 0){
            str = (n%k) + str;
            n/=k;
        }
        System.out.println(str);
        String[] strs = str.split("0");
        for (String s : strs) {
            if(s.equals("")) continue;
            if(decimal(Double.valueOf(s))) answer++;
        }


        return answer;
    }

    boolean decimal(double num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        K진수에서소수찾기 sol = new K진수에서소수찾기();
        int n = 110011;
        int k = 10;
        System.out.println(sol.solution(n, k));
    }
}
