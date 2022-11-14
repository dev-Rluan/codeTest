package src;

public class 플래티어_6 {
    static int sum =0;

    public static void main(String[] args) {
        플래티어_6 sol = new 플래티어_6();
        int data = 0;
        int sum = 0;
        while(data <= 10){
            sum += data;
            data++;
        }
        System.out.println(data+  " : " +sol.sum);
    }
}
