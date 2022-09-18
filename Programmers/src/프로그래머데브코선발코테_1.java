package src;

public class 프로그래머데브코선발코테_1 {
    public String solution(String src) {
        String answer = "";
        char tempChar = src.charAt(0);
        int cnt = 1;
        answer += src.charAt(0);
        for (int i = 1; i < src.length(); i++) {
            if(tempChar != src.charAt(i)){
                answer += (char)(cnt + 64);
                tempChar = src.charAt(i);
                cnt = 1;
            }else{
                cnt++;
            }

        }
        answer += (char)(cnt + 64);

        return answer;
    }

    public static void main(String[] args) {
        프로그래머데브코선발코테_1 sol = new 프로그래머데브코선발코테_1();
        String str = "00011011100000";
        System.out.println(sol.solution(str));
    }
}
