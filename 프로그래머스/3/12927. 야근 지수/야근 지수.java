import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue를 생성, 이 큐는 기본적으로 작은 값이 우선순위를 가지지만 Collections.reverseOrder()를 사용하여 큰 값이 우선순위를 가지도록 설정
        // 1 우선순위 큐 초기화:
//이 코드에서는 PriorityQueue를 사용하여 작업량이 큰 순서대로 정렬되도록 합니다(Collections.reverseOrder() 사용). 우선순위 큐는 가장 큰 값이 맨 앞에 오도록 자동으로 정렬됩니다.
        for(int i = 0; i < works.length; i++) {
            q.offer(works[i]);
            // works 배열에 있는 각 작업량을 우선순위 큐 q에 추가
            // 2 작업량을 큐에 삽입:
            // 주어진 works 배열의 모든 작업량을 우선순위 큐에 삽입합니다. 이때 큐는 자동으로 작업량이 큰 순서대로 정렬됩니다.
        }
        
        while(n > 0) {
            int work = q.poll();
            // 우선순위 큐 q에서 가장 큰 작업량을 가져옴 (poll() 메서드는 큐에서 우선순위 요소를 제거하면서 반환)
            // 3 작업 줄이기 반복:
            // 주어진 시간 n 동안 반복적으로 작업량이 가장 큰 요소를 큐에서 꺼내서 1만큼 줄인 후 다시 큐에 삽입합니다. 작업량이 0이 되면 더 이상 줄일 수 없으므로 반복을 중단합니다.

            if(work == 0) break; //더 이상 줄일 수 있는 일이 없음.
            work -= 1; //일 한시간 줄인다.
            q.offer(work);
            n -= 1; // 남은 작업 시간 한시간 줄인다.
        }
        
        long answer = 0;
        for(int work : q) {
            answer += work * work;
        }
        return answer;
        // 4 최종 결과 계산:
        // 시간이 다 소진되었거나 더 이상 줄일 작업이 없으면, 큐에 남아 있는 모든 작업량의 제곱을 계산하여 합산합니다. 이 합산된 값을 반환합니다.
    }
}


