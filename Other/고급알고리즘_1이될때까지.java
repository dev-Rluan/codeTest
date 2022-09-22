import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class 고급알고리즘_1이될때까지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();

        while(n > 1 ){

            if(n > k){
                answer += n%k +1 ;
                n /= k;

            } else if(n == k){
                answer++;
                n = 1;
            } else {
                answer += n-1;
                n = 1;
            }

        }
        System.out.println(answer);
    }
}
