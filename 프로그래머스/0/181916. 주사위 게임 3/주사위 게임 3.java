import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);  // 오름차순 정렬
        
        int ans = 0;
        
        if (dice[0] == dice[3]){
            ans = 1111 * dice [3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]){
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
            // Math.pow(): 거듭제곱을 계산하는 함수로 두 개의 매개변수를 받음
            // 첫 번째 매개변수는 밑(base)이고, 두 번째 매개변수는 지수(exponent)
            // 즉, Math.pow(a, b)는 a의 b 제곱을 반환
        } else if (dice[0] == dice[1] && dice[2] == dice[3]){
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]){
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]){
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]){
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }
        
        return ans;
    }
}
