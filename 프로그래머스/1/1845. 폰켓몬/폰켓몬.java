import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int num = nums.length / 2;
        // num = 가져갈 수 있는 포켓몬의 수
        Set<Integer> hs = new HashSet<Integer>();
        // HashSet = 중복을 허용하지 않는 데이터 구조(중복 제거해줌)
        for (int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        
        int pokemon = hs.size();
        // pokemon = HashSet의 크기, 중복을 없애고 구한 포켓몬 종류의 수
        if (pokemon <= num){
            return pokemon;
        }else{
            return num;
        }
        // 선택 가능한 고유한 값의 개수보다 실제 고유한 값의 개수가 적을 때를 처리
    }
}