package src;

import java.util.*;

public class 프로그래머스_데브매칭_1 {


    public String solution(String[] registered_list, String new_id) {
        String answer = "";
        StringBuilder sn = new StringBuilder();
        // 모든 아이디는 S+N
        StringBuilder S = new StringBuilder();
        StringBuilder str_N = new StringBuilder();
        int N;

        // new_id는 모두 올바른 형식의 S+N이기 때문에 registered_list 에 없다면 바로 new_id를 리턴해주면 된다.
        Set<String> set = new HashSet<String>(Arrays.asList(registered_list));
        List<String> registeredList= Arrays.asList(registered_list);
        if(!set.contains(new_id)){
            System.out.println("끝");
            return new_id;
        }

        // new_id를 S+N 으로 나누어주기
        for (int i = 0; i < new_id.length(); i++) {
            System.out.println("new_id.charAt(i) = " + new_id.charAt(i));

            if((int)new_id.charAt(i) < 'a' || (int)new_id.charAt(i) > 'z' ){
                str_N.append(new_id.charAt(i));
            }else{
                S.append(new_id.charAt(i));
            }

        }
        if(str_N.length() == 0){
            N=1;
        }else{
            N = Integer.parseInt(str_N.toString());
        }


        // registeredList 에 같은값이 안나올때까지 N++ 시켜준다.
        while(true){
            System.out.println("N = " + N);
            sn.append(S);
            sn.append(N++);
            if(!set.contains(sn.toString())){
                return sn.toString();
            }
            sn.setLength(0);

        }

        // 성공한다면 S+N을 리턴해준다.



    }

    public static void main(String[] args) {
//        String[] registered_list = {"card", "ace13", "ace16", "banker", "ace17", "ace14"};
        String[] registered_list = {"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow999999"};
        String new_id = "cow999999";
        프로그래머스_데브매칭_1 sol = new 프로그래머스_데브매칭_1();
        System.out.println("sol.solution(registered_list, new_id) = " + sol.solution(registered_list, new_id));
    }
}
