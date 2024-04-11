class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            String str = my_strings[i];
            
            answer += str.substring(parts[i][0], parts[i][1]+1);
            // str 문자열에서 parts[i][0]에서 parts[i][1]+1까지의 부분 문자열을 answer 문자열에 추가
            // parts[i][0]은 시작 인덱스를, parts[i][1]은 끝 인덱스를 나타냄
            // 문자열의 substring 메서드는 시작 인덱스부터 끝 인덱스 전까지의 부분 문자열을 반환
        }
        return answer;
    }
}