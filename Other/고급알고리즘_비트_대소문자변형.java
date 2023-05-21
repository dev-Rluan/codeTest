import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 고급알고리즘_비트_대소문자변형{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        for(int i =0; i< str.length(); i++){
//            str.charAt(i) ^=32;
        }
        return str;
    }
}