import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] end = new int[100];
        // end = 각 일자별로 완료된 작업수를 저장할 배열
        int day = -1;
        // 작업 완료 일자를 계산하기 위한 변수
        for(int i=0; i<progresses.length; i++){
            while(progresses[i] + (day*speeds[i]) < 100){
                day++;
            }
            // progresses[i] + (day*speeds[i]) < 100 조건을 만족할 때까지 day 증가
            end[day]++;
            // 완료된 작업의 개수를 해당 일자(day)의 인덱스에 증가
        }
        return Arrays.stream(end).filter(i -> i!=0).toArray();
        // end 배열에서 0이 아닌 값들만 필터링하여 배열로 변환 후 반환
        // 완료된 작업이 있는 일자만 결과에 포함시키기 위함
    }
}