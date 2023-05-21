import java.util.ArrayList;
import java.util.List;

public class 고급알고리즘_배열좌우크기비교 {
    public static void solution(int[] arr){
        int[] leftMax = new int[arr.length];
        int[] rightMin = new int[arr.length];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
        }
        rightMin[arr.length-1] = Integer.MAX_VALUE;
        for (int i = arr.length-2; i >=0; i--) {
            if(rightMin[i+1] > arr[i+1]){
                rightMin[i] = arr[i+1];
            }
            else{
                rightMin[i] = rightMin[i+1];
            }
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if(leftMax[i] < arr[i] && rightMin[i] > arr[i]){
                System.out.println(i);
            }
            else{
                rightMin[i] = Math.min(rightMin[i], arr[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        solution(arr);

    }

}
