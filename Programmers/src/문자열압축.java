import java.util.LinkedList;
import java.util.Queue;

public class 문자열압축 {
    static class Solution {
        public int solution(String s) {
            int answer = s.length();

            for(int i=1; i < s.length()/2+1; i++) {
                int cnt = 1;
                String answerStr = "";
                String checkStr = s.substring(0, i);
                String str = "";

                for (int j = i; j <= s.length(); j += i) {
                    if(j+i > s.length()){
                        str = s.substring(j, s.length());
                    }else{
                        str = s.substring(j, j+i);
                    }
                    if(checkStr.equals(str)){
                        cnt++;
                    }else{
                        if(cnt == 1){
                            answerStr += checkStr;
                        }
                        else{
                            answerStr = answerStr + cnt + checkStr;
                            cnt=1;
                        }
                        checkStr = str;

                    }
                }
                if(i != checkStr.length()) answerStr += checkStr;
                System.out.println(answerStr);
                if(answerStr.length() < answer){
                    answer = answerStr.length();
                }
                System.out.println("i : " + i);
            }



            return answer;
        }



    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ababcdcdababcdcd";
        System.out.println(sol.solution(s));
    }
}
