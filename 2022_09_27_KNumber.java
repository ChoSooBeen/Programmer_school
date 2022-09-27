import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];;
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int finish = commands[i][1];
            int index = commands[i][2];

            int[] tmp = new int[finish - start + 1];
            for(int j = 0; j < tmp.length; j++) {
                tmp[j] = array[start-1 + j];
            }

            Arrays.sort(tmp);
            answer[i] = tmp[index-1];
        }
        return answer;
    }
}
//주의할점 : 주어진 commands는 인덱스가 1번부터 시작하는 것으로 생각하고 말함.
//그러므로 bounds of index 오류 조심해야한다.
