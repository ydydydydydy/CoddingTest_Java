import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // 우선순위 큐 선언
        // 기본적으로 작은 값이 우선순위
        for(int i=0; i<scoville.length; i++){
            queue.add(scoville[i]);
        }
        // scoville 배열의 모든 원소를 우선순위 queue에 담기
        while (queue.peek() < K){
            // 가장 먼저 나올 스코빌 지수(첫번째 원소)가 K보다 작으면 반복
            if (queue.size() == 1) return -1;
            // queue의 사이즈가 1이면 K를 넘을 방법이 없음
            queue.add(queue.poll() + (queue.poll() * 2));
            // 가장 작은 두 원소를 꺼내 새로운 스코빌 지수를 계산 후 큐에 추가
            // poll()은 가장 작은 원소를 꺼내서 반환 후 제거
            answer++;
            // 섞는 횟수를 증가

        }
        return answer;
    }
}