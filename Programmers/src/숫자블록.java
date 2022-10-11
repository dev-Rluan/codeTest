package src;

public class 숫자블록 {
    int maxLen = 10000000;
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)end-(int)begin+1];

        for (int i = (int)begin; i <= (int)end; i++) {
            answer[i-(int)begin] = decimal(i);

        }

        return answer;
    }
    public int decimal(int num){ //소수찾기 함수
        if(num==1){ return 0; } //1은 소수가 x

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0&&(num/i)<=maxLen){
                return num/i;
            }
        }
        return 1;
    }

}
