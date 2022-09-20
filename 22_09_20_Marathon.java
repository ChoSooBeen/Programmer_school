import java.util.ArrayList;
import java.util.Arrays;

//테스트케이스는 통과하지만 효율성 테스트는 통과하지 못함
//java를 오랜만에 하는 거라 문법이 많이 헷갈린다. 자바 공부하기!
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList result = new ArrayList(Arrays.asList(completion));
        for(int i = 0; i < participant.length; i++) {
            String name = participant[i];
            if(result.contains(name)) {
                result.remove(name);
                answer = answer + 'o';
            }
            else
                answer = answer + 'x';
        }
        answer = participant[answer.indexOf('x')];
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/42576
