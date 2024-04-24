class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        StringBuffer sb = new StringBuffer(answer);
        // StringBuffer는 변경 가능한 문자열을 만들 때 사용되는 Java의 클래스
        String reversedStr = sb.reverse().toString();
        // toString() 메서드는 StringBuffer 객체를 String으로 변환하는 데 사용
        // 이 코드에서 toString() 메서드는 sb.reverse()의 결과인 StringBuffer를 String으로 변환
        
        my_string = my_string.replaceAll(answer, reversedStr);
        // my_string에 있는 모든 answer 부분 문자열을 reversedStr으로 대체,
        // 수정된 문자열을 다시 my_string에 할당
        return my_string;
    }
}