import java.util.Scanner;

public class beakjoon11047 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer =0;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = in.nextInt();
        }
        for (int i = prices.length-1; i > -1; i--) {
            if(k >= prices[i]){
                answer += k/prices[i];
                k %=prices[i];
            }

        }
        System.out.println(answer);
    }
}
