import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, participant);
        Collections.addAll(list, completion);
        
        //풀이 = participant 와 completion 를 합쳐서 개수가 홀수인 것을 출력
        //답은 맞았지만 역시나 효율성에서 탈락ㅠㅠ
        for(int i = 0; i < participant.length; i++) {
            if(Collections.frequency(list,participant[i]) % 2 != 0) {
                answer =  participant[i];
                break;
            }
        }
        return answer;
    }
}
