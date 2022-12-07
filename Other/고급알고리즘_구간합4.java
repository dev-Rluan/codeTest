import java.util.Scanner;

public class 고급알고리즘_구간합4 {
    public static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        nums = new int[n+1];
        for(int i = 1 ; i <= n; i++){
            nums[i] = nums[i-1] + sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int firstNum = sc.nextInt();
            int lastNum = sc.nextInt();
            sb.append(nums[lastNum] - nums[firstNum-1])
                    .append("\n");
        }
        System.out.println(sb);
    }


}
