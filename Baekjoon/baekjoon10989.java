import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 카운팅을 위한 배열 선언
        int[] list = new int[10001];
        // n 읽기
        int n = Integer.parseInt(br.readLine());

        // n개의 수 읽어서 list에 넣기
        for (int i = 0; i < n; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        // 문자열 생성
        for (int i = 0; i < list.length; i++) {
            while(list[i] > 0){
                sb.append(i).append("\n");
                list[i]--;
            }
        }

        // 출력
        System.out.println(sb);
    }
}
// 우선순위 큐 사용
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        // n 읽기
//        int n = sc.nextInt();
//        // 큐 초기화
//        Queue<Integer> queue = new PriorityQueue<>();
//
//        // n개의 수 읽어서 list에 넣기
//        for (int i = 0; i < n; i++) {
//            queue.offer(sc.nextInt());
//        }
//
//        // 값 출력
//        while(!queue.isEmpty()){
//            sb.append(queue.poll()).append("\n");
//        }
//        System.out.println(sb);
//
//    }
//}

