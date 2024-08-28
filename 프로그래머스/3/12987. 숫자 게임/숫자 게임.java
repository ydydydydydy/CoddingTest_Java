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
            // B[i] 값이 A[idx]보다 작거나 같을 경우 나머지 코드를 건너뛰고 다음 i로 넘어감
            // B[i]값이 A[idx]보다 큰 경우 A의 idx 증가
            // -> A배열에서 B의 현재 원소보다 작은 값을 하나 더 찾음
        }
        return idx;
    }
}
