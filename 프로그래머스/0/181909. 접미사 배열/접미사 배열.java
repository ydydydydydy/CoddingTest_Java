import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        // 주어진 문자열의 길이를 구함. 이 길이는 후행 문자열을 만들 때 사용
        // 후행 문자열: 주어진 문자열에서 특정 위치부터 끝까지의 부분 문자열
        String[] suffixes = new String[length];
        // 주어진 문자열의 길이만큼의 공간을 가지는 문자열 배열을 생성
        // 이 배열에는 주어진 문자열의 모든 후행 문자열이 저장

        for(int i = 0; i < length; i++){
            suffixes[i] = my_string.substring(i);
            // 현재 인덱스부터 주어진 문자열의 끝까지의 후행 문자열을 구해 suffixes 배열에 저장
        }
  
        Arrays.sort(suffixes);
        // 생성된 후행 문자열들을 알파벳 순으로 정렬
        return suffixes;
    }
}