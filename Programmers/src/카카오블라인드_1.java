package src;

import java.util.ArrayList;
import java.util.HashMap;

public class 카카오블라인드_1 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] strs = term.split(" ");
            termMap.put(strs[0],Integer.parseInt(strs[1]));
        }
        String[] todays = today.split("\\.");
        for (int i = 0; i < privacies.length; i++) {
            System.out.println("i = " + i);
            String[] privacy = privacies[i].split(" ");
            System.out.println("TODAY = " + today);
            String[] strs = updateDate(privacy[0], termMap.get(privacy[1]));
            if(Integer.parseInt(todays[0]) > Integer.parseInt(strs[0])){
                System.out.println("strs[0] = " + strs[0]);
                System.out.println("todays[0] = " + todays[0]);
                list.add(i+1);
            }else if(Integer.parseInt(todays[0]) == Integer.parseInt(strs[0])){
                if(Integer.parseInt(todays[1]) > Integer.parseInt(strs[1]) ) {
                    System.out.println("strs[1] = " + strs[0]);
                    System.out.println("todays[1] = " + todays[0]);
                    list.add(i+1);
                } else if(Integer.parseInt(todays[1]) == Integer.parseInt(strs[1])){
                    if(Integer.parseInt(todays[2]) > Integer.parseInt(strs[2])){
                        System.out.println("strs[2] = " + strs[0]);
                        System.out.println("todays[2] = " + todays[0]);
                        list.add(i+1);
                    }
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list : " + list.get(i));
            answer[i] = list.get(i);

        }


        return answer;
    }
    public String[] updateDate(String privacy, int term){
        String[] strs = privacy.split("\\.");
        System.out.println("privacy = " + privacy);
        if(strs[2].equals("01")){
            strs[2] = "28";
            if(strs[1].equals("01")){
                strs[1] = "12";
                strs[0] = String.valueOf(Integer.parseInt(strs[0])-1);
            }else{
                strs[1] = String.valueOf(Integer.parseInt(strs[1]) - 1);
            }
        }else{
            strs[2] = String.valueOf(Integer.parseInt(strs[2]) - 1);
        }
        strs[1] = String.valueOf(Integer.parseInt(strs[1]) + term);

        if(Integer.parseInt(strs[1]) > 12){
            int year = Integer.parseInt(strs[1])/12;
            strs[0] = String.valueOf(Integer.parseInt(strs[0]) + year);
            int month = Integer.parseInt(strs[1])%12;
            if(month != 0){
                strs[1] = String.valueOf(month);
            }else{
                strs[1] = "12";
            }
        }
        System.out.println("date : " + strs[0] + "." +  strs[1] + "." + strs[2] );
        return strs;
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        카카오블라인드_1 sol = new 카카오블라인드_1();
        System.out.println("sol.solution(today, terms,privacies) = " + sol.solution(today, terms,privacies));
    }
}
