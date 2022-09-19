//로또의 최고 순위와 최저 순위
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0; //알 수 없는 숫자 개수
        int count = 0; // 맞은 개수

        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0)
                zero++;
            else {
                for(int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]){
                        count++;
                    }
                }
            }
        }
        //주의! 범위에서 벗어나는 숫자는 6으로 처리해줘야한다는 것을 잊지말기!!!!
        if(count == 0 && zero == 0) 
            answer[0] = 6;
        else 
            answer[0] = 7 - count - zero;
        if(count == 0)
            answer[1] = 6;
        else
            answer[1] = 7 - count;
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/77484
