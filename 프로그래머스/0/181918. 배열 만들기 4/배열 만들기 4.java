import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i=0; i<arr.length;){
            if(stk.size() == 0){
                stk.add(arr[i]); i++;
            } else if(stk.size() != 0 && stk.get(stk.size()-1)<arr[i]){
              // 스택이 비어있지 않고, 스택의 맨 위 요소가 현재 배열 요소보다 작은지 확인
                stk.add(arr[i]); i++;
                // 그렇다면 현재 배열 요소를 스택에 추가, 배열 인덱스를 증가
            } else {
                stk.remove(stk.size() - 1);
                // 아니라면 스택의 맨 위 요소를 제거
                // 이는 스택의 LIFO (Last In First Out) 특성에 따라 가장 최근에 추가된 요소를 제거
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
        // 스택에 남아있는 요소들을 정수 배열로 변환하여 반환
        // 스트림을 이용하여 리스트의 각 요소를 정수형으로 매핑하고, toArray 메서드를 사용하여 정수 배열로 변환
    }
}
