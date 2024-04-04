import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] resultArr = Arrays.copyOf(arr, arr.length); // arr 배열 복사
        
        for (int[] query : queries) { // 각 query에 대해
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for (int i = s; i <= e; i++) { // s부터 e까지의 범위에 대해
                if (i % k == 0) { // k의 배수인지 확인
                    resultArr[i]++; // k의 배수면 해당 인덱스에 있는 값에 1을 더함
                }
            }
        }
        
        return resultArr;
    }
}
