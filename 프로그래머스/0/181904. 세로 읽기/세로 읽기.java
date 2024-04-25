import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i += m){
            String sub = my_string.substring(i, i + m);
            result.add(sub);
            // 문자열 my_string의 길이만큼 반복하면서 m만큼씩 건너뛰면서 부분 문자열을 생성하고 리스트에 추가
        }
        String answer = "";
        for(String str : result){
            answer += str.substring(c-1,c);
        }
        
        return answer;
    }
}