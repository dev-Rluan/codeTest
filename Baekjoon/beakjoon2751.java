import java.util.*;

public class beakjoon2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // n 읽기
        int n = sc.nextInt();
        // 리스트 초기화
        ArrayList<Integer> list = new ArrayList<>();

        // n개의 수 읽어서 list에 넣기
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        // 문자열 생성
        for (Integer i : list) {
            sb.append(i).append("\n");
        }
        // 출력
        System.out.println(sb);

    }
}

