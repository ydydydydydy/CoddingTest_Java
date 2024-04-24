class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        // my_string.length()-n 인덱스부터
        return answer;
    }
}