import java.util.*;
class Solution {
    public List solution(String[] strArr) {
        List<String> answer = new ArrayList<String>();
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].contains("ad") == false){
                answer.add(strArr[i]);
            }
        }
        return answer;
    }
}