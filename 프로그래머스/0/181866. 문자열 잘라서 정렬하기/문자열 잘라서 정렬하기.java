import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();
        // resultList를 toArray 메서드를 사용하여 다시 배열로 변환
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);
        // sort -> 정렬
     
        return resultArr;
    }
}
