package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 플래티어_1 {
    public int solution(String phone_number) {
        if(phone_number.matches("^(?:010)-(?:\\d{3}|\\d{4})-\\d{4}$")){
            return 1;
        }else if(phone_number.matches("^(?:010)(?:\\d{3}|\\d{4})\\d{4}$")){
            return 2;
        }else if(phone_number.matches("^(?:\\+82-10)-?(?:\\d{3}|\\d{4})-?\\d{4}$")){
            return 3;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        플래티어_1 sol = new 플래티어_1();
        String phone_number ="010123456780";
        System.out.println(sol.solution(phone_number));
    }

}
