import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++){
            
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // copyOfRange - 지정한 배열에서 특정 범위만큼의 요소들을 복사해 새로운 배열로 반환
            // commands[i][0]는 commands 배열의 i번째 요소의 첫 번째 값을 의미
            //commands[i][1]는 commands 배열의 i번째 요소의 두 번째 값을 의미
            
            // i - 1번째 수부터 j 직전까지 배열 추출
            Arrays.sort(temp);
            // 추출한 배열 오름차순 정렬
            answer[i] = temp[commands[i][2] - 1];
            // k번째 수 answer 배열에 담기
        }
        return answer;
    }
}