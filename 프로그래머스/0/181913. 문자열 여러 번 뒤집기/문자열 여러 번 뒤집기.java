class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();  // 문자열을 배열로 변환
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];  // 현재 반복하는 쿼리의 시작 위치
            int end = queries[i][1];  // 현재 반복하는 쿼리의 끝 위치
            
            for(int j = start; j <= (start+end) / 2; j++){
            // 현재 쿼리의 범위 내에서 반복
            // (start+end) / 2 는 현재 반복하는 쿼리의 중간 위치
            // 이 반복문은 시작 위치부터 중간 위치까지만 실행
            // 이것은 문자열을 뒤집는 작업을 수행하기 때문에 반복 범위가 절반으로 축소됨

            char temp = arr[j];
                arr[j] = arr[start+end-j];
                arr[start+end-j] = temp;
                // 현재 반복하는 위치의 문자를 뒤집는다
                // 이를 위해 현재 위치의 문자와 대칭되는 위치의 문자를 교환
            }
        }
        return new String(arr);
        // 뒤집힌 문자열을 새로운 String 객체로 만들어 반환
    }
}