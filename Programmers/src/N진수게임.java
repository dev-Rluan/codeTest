package src;

import java.util.Locale;

public class N진수게임 {
    /**
     *
     * @param n : 진법
     * @param t : 미리구할 숫자의 갯수
     * @param m : 게임에 참여하는 인원
     * @param p : 튜브의 순서
     * @return
     *
     * 자바에서 String객체끼리 더하는 것은 메모리 할당과 해제를 발생시키는데  덧셈연산이 많아진다면 성능적으로 좋지 않다.
     * 이를 해결하기 위해서 StringBuilder를 사용한다.
     */
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer =  new StringBuilder();
        StringBuilder str = new StringBuilder();


        for (int i = 0; str.length() <= m*t; i++) {
            str.append(Integer.toString(i, n));
        }

        for (int i = p-1; answer.length() < t; i += m) {
            System.out.println(i);
            answer.append(str.charAt(i));
        }

        return answer.toString().toUpperCase();
    }



    public static void main(String[] args) {
        N진수게임 sol = new N진수게임();
        System.out.println("answer : " + sol.solution(2,	4,	2,	1));
    }
}
