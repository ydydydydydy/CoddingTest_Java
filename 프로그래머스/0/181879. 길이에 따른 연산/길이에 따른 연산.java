class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);
        // answer의 초기값이 0이면 아무리 곱해도 0이 나오기 때문에 1로 변경이 필요
        for(int i = 0; i < num_list.length; i++){
            if(num_list.length >= 11){
                answer += num_list[i];
            }else{
                answer *= num_list[i];
            }
        }
        return answer;
    }
}