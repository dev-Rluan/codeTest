import java.util.Scanner;

class 고급알고리즘_홀수짝수{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    public static boolean isEven(int n){
        if((n & 1) == 1){
            return true;
        }else {
            return false;
        }

    }
}