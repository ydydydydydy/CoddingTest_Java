import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        for (int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
                // arr 배열을 0부터 query[i]까지 자름
                // Arrays.copyOfRange 메서드는 주어진 배열의 특정 범위를 복사하여 새 배열을 반환
                // 여기서 query[i]는 포함되므로 query[i]+1까지의 범위를 지정
            }else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}