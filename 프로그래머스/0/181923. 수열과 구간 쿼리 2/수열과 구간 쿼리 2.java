class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            // queries 배열의 요소 i번째에서 시작하는 인덱스 s, 끝나는 인덱스 e 그리고 k값을 가져옴
            
            int min = Integer.MAX_VALUE;
            // min변수를 Integer.MAX_VALUE로 초기화
            for (int j = s; j <= e; j++){
            // 현재 쿼리의 범위인 s부터 e까지 반복하는 루프
                if (arr[j] > k && arr[j] < min){
                // arr[j]값이 k보다 크면서 현재까지 최솟값인 min보다 작은지 확인
                    min = arr[j];
                    // 조건 만족시 min값을 현재 arr[j]값으로 업데이트
                }
            }
            answer[i] = min == Integer.MAX_VALUE? -1 : min;
            // 최종 결과를 answer 배열의 해당 인덱스에 할당
            // min 값이 Integer.MAX_VALUE와 같으면 k보다 큰 값이 없었다는 것이므로 -1을 할당
        }
        return answer;
    }
}