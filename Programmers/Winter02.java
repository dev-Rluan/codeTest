import java.util.*;

public class Winter02 {
    public int solution(int n, int[] student, int[] point) {
        int answer = 0;
        // n명의 학생
        // 초기화
        Map<Integer,Integer> elite = new HashMap<>();
        Map<Integer,Integer> dum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(i < n/2){
                elite.put(i+1, 0);
            }else{
                dum.put(i+1, 0);
            }
        }

        for (int i = 0; i < student.length; i++) {
            if(elite.containsKey(student[i])){
                elite.put(student[i], elite.get(student[i]) + point[i]);
            }else{
                dum.put(student[i], dum.get(student[i]) + point[i]);
                List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(elite.entrySet());

                // 비교함수 Comparator를 사용하여 오름차순으로 정렬
                Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
                    // compare로 값을 비교
                    public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
                        // 내림 차순 정렬
                        if(obj1.getValue().compareTo(obj2.getValue()) == 0){
                            return obj1.getKey().compareTo(obj2.getKey())*-1;
                        }
                        return obj1.getValue().compareTo(obj2.getValue());
                    }
                });
                for (Map.Entry<Integer, Integer> list_entry : list_entries) {
                    if(list_entry.getValue() <= dum.get(student[i])){
                        if(list_entry.getValue() == dum.get(student[i]) && list_entry.getKey() < student[i]){
                            break;
                        }
                        dum.put(list_entry.getKey(),list_entry.getValue());
                        elite.remove(list_entry.getKey());
                        elite.put(student[i], dum.get(student[i]));
                        dum.remove(student[i]);
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Winter02 winter02 = new Winter02();
        int[] arr1 = {6, 1, 4, 2, 5, 1, 3, 3, 1, 6, 5};
        int[] arr2 = {3, 2, 5, 3, 4, 2, 4, 2, 3, 2, 2};

        System.out.println(winter02.solution(6, arr1,arr2));
    }
}
