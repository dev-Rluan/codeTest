import java.util.Scanner;
public class IUPC_B {
    
    public static int[][] arr;
    public static int n;
    public static int m;
    public static int answer;
    public static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[2][3];
        System.out.println("m = " + m);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /**
         * 하루에 정보수집 or 감시 둘중에 한가지의 임무만 수행 할 수 있으며
         * 하루에 한가지 장소에서만 임무를 수행 할 수 있다.
         * 다시말해, 하루에 6가지의 행동중 하나만 선택해서 할 수 있다.
         *
         * 전날에 임무를 수행한 곳과 같은 장소를 선택하면 그날은 원래의 절반에 해당하는 진척도만 얻을 수 있음
         */

        /**1
         * [0][][]
         * [][][]
         *
         * [0][0][]
         * [][][]
         * 2
         * [][0][]
         * [][][]
         *
         * [][0][0]
         * [][][]
         *
         */
        mission(0,3, 0);
        System.out.println(answer);




    }

    public static void mission(int depth, int yesterday, int count){
        if(depth == n){
            System.out.println("depth = " + depth);
            System.out.println("count = " + count);
            System.out.println("answer = " + answer);
            System.out.println("===================");
            if(count >= m) answer++;
            return;
        }


        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                count = 0;
                if(yesterday == j){
                    count += (arr[j][k])/2;
                }else{
                    count += arr[j][k];
                }

                mission(depth+1, j, count);

            }
        }
    }

//    public int point(){
//
//
//        return 0;
//    }
}
