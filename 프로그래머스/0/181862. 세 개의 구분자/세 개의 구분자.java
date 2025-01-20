import java.util.*;
class Solution {
    public List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        myStr = myStr.replaceAll("a|b|c", ",");
        String[] list = myStr.split(",");
        for (String i : list)
            if (!i.equals(""))
                answer.add(i);
        if (answer.size()==0) answer.add("EMPTY");
        return answer;
    }
}