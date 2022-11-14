public class Winter01 {
    public String solution(String line) {
        // 같은 값 반복이면 * 출력
        StringBuilder sb = new StringBuilder();
        int tempC = 0;
        // 이전값이랑 같으면
        // 이전까지 몇번째 같은지 확인
        // 2번째 이상 같은 값이면
        //
        sb.append(line.charAt(0));
        for (int i = 1; i < line.length(); i++) {
            if(line.charAt(i) == line.charAt(i-1)){
                if(tempC < 1){
                    sb.append("*");
                }tempC++;
            }else{
                sb.append(line.charAt(i));
                tempC=0;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Winter01 winter01 = new Winter01();
        String line = "aabbbcc";
        System.out.println(winter01.solution(line));
    }
}
