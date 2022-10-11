import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class beakjoon11399 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int cnt = 0;
            int sum = 0;
            Queue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int pi = sc.nextInt();
                cnt +=pi;
                pQueue.offer(pi);
            }

            while(!pQueue.isEmpty()){
                sum = sum + cnt;
                cnt -= pQueue.poll();
            }
            System.out.println(sum);
    }
}
