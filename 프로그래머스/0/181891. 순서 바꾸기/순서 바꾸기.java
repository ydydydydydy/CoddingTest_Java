class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;
        
        for (int i = n; i < num_list.length; i++){
            // n부터 num_list 배열의 끝까지 반복하는 for문
            answer[index++] = num_list[i];
            // num_list 배열의 i번째 요소를 answer 배열의 index 위치에 넣은 다음 index 값을 1 증가
        }
        
        for (int i = 0; i < n; i++){
            // n-1까지 반복
            answer[index++] = num_list[i];
            // num_list 배열의 i번째 요소를 answer 배열의 index 위치에 넣은 다음 index 값을 1 증가
        }
        return answer;
    }
}