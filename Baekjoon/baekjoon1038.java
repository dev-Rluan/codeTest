import java.util.Scanner;

public class baekjoon1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int cnt = 0;
        int nCnt = 0;
        while(nCnt < n){
            if(checkNum(cnt++)){
                System.out.println(cnt + ": cccccc");
                nCnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean checkNum(int n){

        if(n < 10){
            return true;
        }
        while(true){
            System.out.println("n = " + n);
            System.out.println("n%10 = " + n%10);
            if(n >= n%10){
                return false;
            }else{
                return true;
            }
        }

    }
}
