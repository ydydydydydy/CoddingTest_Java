import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for(String str : intStrs){
        // intStrs 배열의 각 요소에 대해 반복문을 실행한다. str은 intStrs 배열의 각 요소를 나타냄
            int i = Integer.parseInt(str.substring(s, s+l));
            // str 문자열에서 s부터 시작하여 l 길이만큼의 부분 문자열을 추출
            // 해당 부분 문자열을 정수로 변환 -> Integer.parseInt()
            if (i > k){
                result.add(i);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
        // 결과 리스트를 스트림으로 변환, mapToInt 메소드를 사용하여 각 요소를 int로 매핑
        // 그런 다음 toArray 메소드를 사용하여 int 배열로 변환하여 반환
        // i->i는 각 요소를 입력으로 받아 그대로 반환하는 람다 표현식, 이것은 간단히 말해 "입력받은 요소를 그대로 반환한다"는 의미
        // 이 람다 표현식은 mapToInt 메소드에 전달되어 스트림의 각 요소를 int로 매핑하는데 사용
    }
}