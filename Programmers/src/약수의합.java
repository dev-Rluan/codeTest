package src;

public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        // 약수 구하기

        for (int i = 1; i <= Math.sqrt(n); i++) {
             if(n%i==0){
                 if(n==i){
                     answer+=i;
                     continue;
                 }
                 System.out.println(i);
                 answer+=i;
                 answer+=n/i;
             }

        }
        return answer;
    }

    public static void main(String[] args) {
        약수의합 sol = new 약수의합();
        int n = 16;
        System.out.println(sol.solution(n));
    }
}
