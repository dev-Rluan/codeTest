class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String strs[] = str.split("");
        int[] answer = new int[strs.length];
       
        int value = strs.length;
        for(int i = 0; i< strs.length;i++){
            answer[i] = Integer.parseInt(strs[--value]);
        }
        return answer;
    }
    public static void main(String[] args) {
        
    }
}