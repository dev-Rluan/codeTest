package src;

import java.util.ArrayList;
import java.util.List;

public class 압축 {
    public int[] solution(String msg) {
        int[] answer = {};
        List<String> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 'A' ; i <= 'Z'; i++){
            list.add(String.valueOf((char)i));
        }

        int maxLen = msg.length();

        for (int i = 0; i < maxLen; i++) {
            int a = 1;
            while(i+a <= maxLen && list.contains(msg.substring(i, i + a))){
                a++;
            }
            if(i+a > maxLen){
                answerList.add(list.indexOf(msg.substring(i)) + 1);
                break;
            }


            String s = msg.substring(i, (i+a-1));
            answerList.add(list.indexOf(s) + 1);
            String str = msg.substring(i, i+a);
            list.add(str);
            if(a>1) i+= a-2;
        }

        return answerList.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        압축 sol = new 압축();
        System.out.println("sol = " + sol.solution(msg));
    }
}
