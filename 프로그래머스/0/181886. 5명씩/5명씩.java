import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i % 5 == 0)
                list.add(names[i]);
        }
        return list.toArray(new String[list.size()]);
        // new String[list.size()]는 리스트 크기와 동일한 길이의 String 배열을 생성
    }
}