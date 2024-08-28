import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        // 배열 A와 B를 오름차순으로 정렬
        int idx = 0;
        for(int i = 0; i < B.length; i++){
            if(A[idx] >= B[i]) continue;
            idx++;
            // B를 기준으로 순회
            // 현재 B값이 A보다 같거나 작을 경우 B의 다음 index 체크
            // 현재 B값이 A보다 큰 경우를 A의 index를 증가 
        }
        return idx;
    }
}
// A: 1, 3, 5, 7
// B: 2, 2, 6, 8
// 2 -> 6 -> 8 
// 2는 3보다 작으므로 skip 
// 순회가 끝난 후 A의 index 반환

 