package src;

public class 플래티어_2 {

    public int solution(int n, int m) {
        int answer = 0;
        int num = n +m;
        int divN = n;
        int divM = m;
        answer = num;
        for (int i = num-1; i > 0; i--) {
            answer *= i;
        }
        System.out.println(divN);
        for (int i = n-1; i > 0; i--) {
            divN *= i;
            System.out.println("i = " + i);
            System.out.println("t: divN = " + divN);
        }for (int i = m-1; i > 0; i--) {
            divM *= i;
        }
        if(divN > 0){
            answer/=divN;
        }if(divM > 0){
            answer/=divM;
        }

        System.out.println("divN = " + divN);
        answer/=divM;
        System.out.println("divM = " + divM);
        return answer;
    }

    public static void main(String[] args) {
        플래티어_2 sol = new 플래티어_2();
        
        System.out.println("sol.solution() = " + sol.solution(3,0));

    }
}
