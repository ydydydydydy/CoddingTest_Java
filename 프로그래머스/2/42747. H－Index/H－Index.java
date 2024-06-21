import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
		// citation을 오름차순으로 정렬하고
		for(int i = 0; i < citations.length; i++) {
            // for문 써서 citation길이만큼 
			int h = citations.length - i; // 인용된 논문의 수 저장
            // citations.length - i : 남은 배열 요소의 개수
			
			if(citations[i] >= h) {
				answer = h;
				break;
			}
		}
        
        return answer;
    }
}