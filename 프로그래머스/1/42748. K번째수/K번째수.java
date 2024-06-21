import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++){
            
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // i - 1번째 수부터 j 직전까지 배열 추출
            Arrays.sort(temp);
            // 추출한 배열 오름차순 정렬
            answer[i] = temp[commands[i][2] - 1];
            // k번째 수 answer 배열에 담기
        }
        return answer;
    }
}