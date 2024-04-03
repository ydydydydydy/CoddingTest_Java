class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int a, b, temp;
        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];
            
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
}
// 변수 a는 queries 배열의 각 행에서 첫 번째 요소인 인덱스를 나타냄. queries[i][0]는 i번째 행의 첫 번째 요소를 의미

// ex) queries 배열의 한 행이 [2, 5]라면, a는 2이고 b는 5이다. 이는 arr 배열에서 2번 인덱스와 5번 인덱스의 요소를 교환하라는 의미