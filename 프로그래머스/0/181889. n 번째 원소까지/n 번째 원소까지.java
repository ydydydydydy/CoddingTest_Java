class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        //  int[] answer = new int[n];는 크기가 n인 새로운 정수형 배열을 만들고 answer 변수에 할당
        // n이 5라면 answer는 5개의 정수형 요소를 가지는 배열이 되고, 초기 값은 모두 0이 된다
        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}