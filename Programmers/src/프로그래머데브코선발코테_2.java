package src;

import java.util.*;

public class 프로그래머데브코선발코테_2 {
    public String[] solution(int n, String[] queries) {
        int cnt = 0;
        List<String> answerList = new ArrayList<>();
        String ip = "192.168.0.";
        HashMap<String, Integer> hash = new HashMap<>();
        HashMap<String, Integer> logMap = new HashMap<>();
        // IP 검색
        for (String query : queries) {
            System.out.println(query);
            String[] strs = query.split(" ");
            switch (strs[1]){
                case "request":
                    if(hash.containsKey(strs[0])){
                        answerList.add(strs[0] + " " + (ip + hash.get(strs[0]).toString()));
                    } else {
                        boolean isValue = false;
                        if(logMap.containsKey(strs[0])){
                            if(!hash.containsValue(logMap.get(strs[0]))){
                                hash.put(strs[0],logMap.get(strs[0]));
                                isValue = true;
                            }
                        } else{
                            for(int i = 1; i <= n; i++){
                                if(!hash.containsValue(i)){
                                    hash.put(strs[0],i);
                                    logMap.put(strs[0],i);
                                    isValue = true;
                                    break;
                                }
                            }
                        }

                        if(isValue){
                            answerList.add(strs[0] + " " + (ip + hash.get(strs[0]).toString()));
                        } else {
                            answerList.add(strs[0] + " reject");
                        }

                    }
                    break;
                case "release":
                    hash.remove(strs[0]);
                    break;

            }
        }
        return answerList.toArray(new String[answerList.size()]);
    }


    public static void main(String[] args) {
        프로그래머데브코선발코테_2 sol = new 프로그래머데브코선발코테_2();
        int n = 2;
        String[] queries = {"desktop1 request", "desktop2 request", "desktop3 request",
                "desktop3 request", "desktop1 release", "desktop3 request"};
        String[] queries2 = {"desktop1 request", "desktop2 request",
                "desktop1 release", "desktop2 release", "desktop3 request",
                "desktop3 release", "desktop2 request", "desktop1 request"};


        System.out.println(Arrays.toString(sol.solution(n, queries2)));
    }
}
