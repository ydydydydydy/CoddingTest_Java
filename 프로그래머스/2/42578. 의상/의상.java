import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();       
        int answer = 1;
        
        for(int i = 0; i < clothes.length; i++) {
            // 의상 종류 별로 몇개씩 있는지 hash에 저장해주기 
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1); 
        }
        
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);   // 조합 -> 안입는 경우도 고려하기 위해 + 1
        }
        
        answer -= 1; // 모두 '안입음'일 경우 -1 해주기 
        
        return answer;
    }
}

// map에 의상 종류 별로 몇 개씩 있는지 저장해 준다. 

// (동그란 안경 + 파란색 티셔츠) 
// (동그란 안경 + 안 입음)  → 이런 식으로 안 입는 경우도 생각해줘야 하기 때문에 개수에 +1 해서 구해준다. 

// 그리고 (안 입음 + 안 입음 + 안 입음 + 안 입음)으로 모두 안 입는 경우가 한 번 나오기 때문에 최종 결과에서 -1 해준다. 
