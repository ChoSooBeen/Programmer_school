import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//문제 유형이 HashMap이길래 사용해보았다.
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        //참가자 수만큼 더해주고
        for(int i = 0; i < participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        //완주한 수 만큼 빼준다.
        for(int i = 0; i < completion.length; i++){
            map.put(completion[i], map.getOrDefault(completion[i], 0) - 1);
        }

        //value 값이 0이 아닌 참가자의 이름을 찾아내면 된다.
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}

