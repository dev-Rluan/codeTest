package src;

public class 하노이 {
    int[][] answer ;
    int x =0;
    public int[][] solution(int n) {
        int num =(int)Math.pow(2, n)-1;
        answer = new int[num][2];
        hanoi(n, 1, 2,3);

        return answer;
    }
    public void hanoi(int n, int start, int mid, int end){
        if(n == 0) return;

        hanoi(n-1, start, end, mid);

        answer[x][0] = start;
        answer[x++][1] = end;
        hanoi(n-1, mid, start, end);

    }

    public static void main(String[] args) {

    }
}
