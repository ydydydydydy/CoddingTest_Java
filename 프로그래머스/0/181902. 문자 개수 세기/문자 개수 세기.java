class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        // answer 배열은 알파벳의 등장 횟수를 저장하는 배열,
        // 대문자 알파벳은 인덱스 0부터 25까지, 소문자 알파벳은 인덱스 26부터 51까지 저장됨
        for (int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            // 주어진 문자열을 한 글자씩 순회 후 현재 문자를 가져옴
            if (c >= 'A' && c <= 'Z'){
                answer[c - 'A']++;
                // 만약 현재 문자가 대문자 알파벳이라면,
                // 해당 알파벳의 인덱스에 1을 추가하여 등장 횟수를 증가
            }else if ( c >= 'a' && c <= 'z'){
                answer[26 + c - 'a']++;
                // 혹은 현재 문자가 소문자 알파벳이라면,
                // 해당 알파벳의 인덱스에 1을 추가하여 등장 횟수를 증가
            }
        }
        return answer;
    }
}