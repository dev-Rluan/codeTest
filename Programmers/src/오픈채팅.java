import java.util.*;

public class 오픈채팅 {
    public static class Solution {
        List<Log> logs = new ArrayList<>();
        Map<String, String> session = new HashMap<>();
        public String[] solution(String[] record) {
            String[] answer = {};

            for(int i =0; i < record.length; i++){
                String[] log = record[i].split(" ");
                switch (log[0]){
                    case "Enter":
                        Log enter = new Log("Enter", log[1], log[2]);
                        logs.add(enter);
                        break;
                    case "Leave":
                        Log leave = new Log("Leave", log[1]);
                        logs.add(leave);
                        break;
                    case "Change":
                        session.put(log[1], log[2]);
                        break;
                }
            }
            answer = new String[logs.size()];
            int cnt = 0;
            for(Log log : logs){
                switch (log.getState()){
                    case "Enter":
                        answer[cnt++] = log.getNickName() + "님이 들어왔습니다.";
                        break;
                    case "Leave":
                        answer[cnt++] = log.getNickName() + "님이 나갔습니다.";
                }
            }
            return answer;
        }

        class Log {
            String id;
            String state;

            public Log(String state, String id) {
                this.id = id;
                this.state = state;
            }
            public Log(String state, String id, String nickName) {
                this.id = id;
                this.state = state;
                setNickName(nickName);
            }
            public String getNickName() {
                return session.get(id);
            }

            public void setNickName(String nickName) {
                session.put(id, nickName);
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    } //End of solution

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(sol.solution(record)));
    }
}
