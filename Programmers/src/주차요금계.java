package src;

import java.util.*;

public class 주차요금계 {


    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        int defaultTime = 23*60 + 59;

        // 계산을 위한 map
        Map<Integer, Integer> salMap = new TreeMap<>();

        // 누적시간 기록
        Map<Integer, Integer> feesRecordMap = new HashMap<>();

        // 출차관리
        Map<Integer, Integer> parkTimeMap = new HashMap<>();

        // 누적시간 계산하기
        for (String record : records) {
            String[] str = record.split(" ");
            Integer key = Integer.parseInt(str[1]);
            if(parkTimeMap.containsKey(key)){
                if(feesRecordMap.containsKey(key)){
                    feesRecordMap.put(key,feesRecordMap.get(key) +( parkCal(str[0])- parkTimeMap.get(key)));
                }
                else{
                    feesRecordMap.put(key,parkCal(str[0]) - parkTimeMap.get(key));
                }
                parkTimeMap.remove(key);
            }else{
                System.out.println("parkCal(str[0]) = " + parkCal(str[0]));
                parkTimeMap.put(key, parkCal(str[0]));
            }

        }

        for (Integer key : parkTimeMap.keySet()) {
            if(!feesRecordMap.containsKey(key)){
                feesRecordMap.put(key,defaultTime - parkTimeMap.get(key));
            }else{
                feesRecordMap.put(key,feesRecordMap.get(key) + (defaultTime - parkTimeMap.get(key)));

            }

        }
        // 요금 계산
        // 주차요금 계산법 : 기본요금 + [누적 시간 / 단위시간] * 단위요금
        for (Integer key : feesRecordMap.keySet()) {
            int time = feesRecordMap.get(key);
            if(time > fees[0]){
                time-=fees[0];
                Double feesTime = Math.ceil((double)time/fees[2]);
                salMap.put(key, (int) (fees[1] + feesTime * fees[3]));
            }else{
                salMap.put(key,fees[1]);
            }
        }
        answer = new int[salMap.size()];
        int i = 0;
        for (Integer sal : salMap.values()) {
            answer[i++] = sal;
        }

        return answer;
    }
    public static int parkCal(String time){
        String[] num = time.split(":");
        return Integer.parseInt(num[0])*60 + Integer.parseInt(num[1]);
    }

    public static void main(String[] args) {
        주차요금계 sol = new 주차요금계();
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN",
                "23:00 5961 OUT"};
        
        // 5961 : 0534
        System.out.println("sol.sou = " + Arrays.toString(solution(fees, records)));
    }
}

