import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 고급알고리즘_문제조건 {
    public static String solution(String str){
        ArrayList<Character> charList = new ArrayList<>();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                 charList.add(str.charAt(i));
             }
             else{
                 cnt += Integer.parseInt(String.valueOf(str.charAt(i)));
             }
        }
        Collections.sort(charList);
        for (Character character : charList) {
            sb.append(character);
        }
        
        return sb.toString() + cnt;
    }
    public static void main(String[] args) {
        System.out.println("solution(\"K1KA5CB7\") = " + solution("K1KA5CB7"));
    }
}
