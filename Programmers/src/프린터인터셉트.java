package src;

import java.util.*;

public class 프린터인터셉트 {


    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            pQueue.offer(priority);
        }

        while(!pQueue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(pQueue.peek() == priorities[i]) {
                    if(location == i) {
                        return answer;
                    }
                    pQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
         프린터인터셉트 sol = new 프린터인터셉트();
         int[] priorities = {2, 1, 3, 2};
         int location = 2;
        System.out.println(sol.solution(priorities, location));
    }
}
