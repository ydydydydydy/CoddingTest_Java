import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n); 

        while (n != 1) {  // n의 값이 1이 아닌 동안 계속되는 while 루프를 시작
            if (n % 2 == 0) {
                n /= 2;  // n의 값을 2로 나누고 결과를 다시 n에 할당
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);  // 업데이트된 n의 값을 sequence 리스트에 추가
        }

        int[] answer = new int[sequence.size()];
        // answer라는 정수 배열을 선언, 배열의 크기는 sequence 리스트의 크기와 같음
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
            // sequence 리스트의 각 요소를 answer 배열의 해당 인덱스에 할당
        }
        return answer;
    }
}