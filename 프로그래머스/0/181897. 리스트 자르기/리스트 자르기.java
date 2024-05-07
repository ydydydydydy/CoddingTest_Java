import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if (n == 1){
            for(int i=0; i<b+1; i++){
                list.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i=a; i<num_list.length; i++){
                list.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i=a; i<b+1; i++){
                list.add(num_list[i]);
            }
        }else if(n == 4){
            for(int i=a; i<b+1; i+=c){
                list.add(num_list[i]);
            }
        }
        
        int[] answer = list.stream().mapToInt(x -> x).toArray();
        //리스트에 있는 요소들을 정수 배열로 변환
        // Stream API를 사용하여 각 요소를 정수로 변환한 후, toArray 메소드를 호출하여 배열로 반환
        
        // list.stream()
        // 리스트를 스트림으로 변환, 이렇게 하면 리스트의 각 요소를 순차적으로 처리할 수 있음
        
        // mapToInt(x -> x)
        // Stream의 mapToInt 메서드를 사용하여 각 요소를 int로 매핑
        // 여기서 람다 표현식 (x -> x)은 각 요소를 그대로 반환하도록 지정
        // 이 매핑 작업을 통해 Integer 객체가 저장된 리스트의 각 요소가 기본형 int로 변환됨
        
        return answer;
    }
}