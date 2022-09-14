package src;

public class 다음숫자구하기 {
    public int solution(int n) {
        int answer = 0;

        int nextNum = oneLen(n);

        while(true){
            n++;
            if(oneLen(n) == nextNum){
                answer = n;
                break;
            }
        }

        return answer;
    }
    public int oneLen(int n){
       return Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1", "").length();
    }


    public static void main(String[] args) {

    }
}
