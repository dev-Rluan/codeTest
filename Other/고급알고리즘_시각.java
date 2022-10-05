
import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // int ks = sc.nextInt();
        int ks = 3;
        int cnt =0;
        for(int i = 0 ; i <= n;i++){
            for(int  j= 0; j < 60 ; j++ ){
                for(int k=0; k < 60; k++){
                    if( i%10 == ks || i/10==ks
                       || j%10 == ks || j/10 == ks 
                       || k%10 == ks || k/10==ks){
            cnt++;
        }
                }
            }
        }
        System.out.println(cnt);
    }
}