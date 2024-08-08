import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        Map<String, String> parentMap = new HashMap<>();
        // 각 판매원의 부모(추천인), 키 -> 판매원 이름, 값 -> 추천인
        Map<String, Integer> memberIndexMap = new HashMap<>();
        // 키 -> 판매원 이름, 값 -> 판매원의 인덱스

        for(int i=0; i < enroll.length; i++){
            parentMap.put(enroll[i], referral[i]);
            // enroll 배열의 현재 판매원과 그 판매원의 추천인을 추가
            memberIndexMap.put(enroll[i], i);
            // 현재 판매원의 이름과 해당 인덳 추가
        }

        for(int i=0; i<seller.length; i++){

            String now = seller[i]; // 현재 판매원 이름 저장
            int profit = 100 * amount[i];
            // amount[i] -> 판매한 횟수, 1회당 100원의 수익을 올리기 때문에 곱하기 100
            
            while(!now.equals("-")){
                int profitForParent = profit / 10; // 추천인(부모)에게 넘겨줄 금액
                int nowProfit = profit - profitForParent; // 현재 판매원이 가져갈 금액

                answer[memberIndexMap.get(now)] += nowProfit;
                // 현재 판매원 인덱스에 수익만큼 더함

                now = parentMap.get(now);
                // 노드는 추천인(부모)로 이동하면서 수익을 부모에게 넘겨준 금액으로 초기화
                profit /= 10;
                
                if (profit < 1) {
                // 10%의 금액이 1원 미만인 경우
                    break;
                }
            }
        }

        return answer;
    }
}