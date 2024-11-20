import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            int[] temp = arr.clone();
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, temp)){
                break;
            }
            answer++;
        }
        return answer;
        // 배열이 더 이상 변하지 않을 때 반복 횟수를 반환
    }
}

// arr(x) = arr(x+1)
// 위의 1번 연산(50보다 크거나~~)을 진행한 후 배열의 인덱스 크기와 각 원소의 크기가
// 1번 연산을 진행하기 이전의 인덱스 크기와 각 원소의 크기가 같을 때 while문이 몇 번 반복되었는지 반환하는 문제
