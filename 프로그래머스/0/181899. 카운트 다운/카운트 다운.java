class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for(int i=0; i<answer.length ; i++){
            answer[i] = start--;
            // start 값을 현재 인덱스 i에 할당한 후에 start 값을 1 감소
            // 배열의 각 요소에는 start부터 시작하여 하나씩 감소하는 값이 할당
        }
        return answer;
    }
}