class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
            //queries 배열의 요소 i번째에서 시작하는 인덱스 queries[i][0]부터 끝나는 인덱스 queries[i][1]까지 반복
                if (j % queries[i][2] == 0) arr[j] += 1;
            //j가 queries 배열의 i번째 요소의 세 번째 값(k)으로 나누어 떨어지는지 확인하고 arr 배열의 해당 인덱스에 1을 더함
            }
        }
        return arr;
    }
}