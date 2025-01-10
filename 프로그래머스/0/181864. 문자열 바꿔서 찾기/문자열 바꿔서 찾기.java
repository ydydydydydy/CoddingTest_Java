class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String text;
        text = myString.replace('A', 'C');
        text = text.replace('B', 'A');
        text = text.replace('C', 'B');
        if(text.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}