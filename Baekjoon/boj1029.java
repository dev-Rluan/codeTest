import java.util.Scanner;
import java.util.StringTokenizer;

public class boj1029 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int answer = 1;

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        int max = 0;
        int oldI  = 0;


        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j) -'0';
            }
            
        }

        for (int i = 0; i < n; i++) {
            boolean isTrance = true;
            for (int j = 0; j < n; j++) {
                System.out.println("arr[i][j] = " + arr[i][j]);
                if (arr[i][j] != 0 && isTrance){
                    System.out.println("start if ========");
                    System.out.println("oldI = " + oldI);
                    System.out.println("arr[i][j] = " + arr[i][j]);
                    if(arr[i][j] >= max){
                        max = arr[i][j];
                        answer++;
                        isTrance = false;
                    }

                    System.out.println("end if ========");
                }

            }
            System.out.println("i = " + i);
            System.out.println("answer = " + answer);
        }

        System.out.println(answer);

    }



}
