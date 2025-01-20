import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        // 'a', 'b', 'c'를 ','로 대체
        myStr = myStr.replaceAll("a|b|c", ",");

        // ','를 기준으로 문자열 분리
        String[] splitStr = myStr.split(",");

        // 빈 문자열 제거
        List<String> resultList = new ArrayList<>();
        for (String str : splitStr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }

        // 결과가 비어있으면 "EMPTY" 반환
        if (resultList.isEmpty()) {
            return new String[] { "EMPTY" };
        }

        // 결과 배열 반환
        return resultList.toArray(new String[0]);
    }
}
