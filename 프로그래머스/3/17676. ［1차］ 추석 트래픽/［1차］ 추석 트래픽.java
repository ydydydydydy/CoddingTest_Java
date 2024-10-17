import java.util.*;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        
        // lines의 길이가 1이라면 초당 최대 처리량은 1이됨
        if (lines.length == 1) return 1;
        
        List<Traffic> list = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            // 종료 시간
            // lines[i]에서 시간을 추출해 ms로 변환 (hh * 3600 + mm * 60) * 1000 + ss.sss * 1000
            int end = (Integer.parseInt(lines[i].substring(11, 13)) * 3600  // hh 
                + Integer.parseInt(lines[i].substring(14, 16)) * 60) *1000  // mm
                + (int)(Double.parseDouble(lines[i].substring(17, 23)) * 1000);  //ss.sss

            // 처리 시간
            int time = (int)(Double.parseDouble(lines[i].substring(24, lines[i].length() - 1)) * 1000);
            
            // 시작 시간 = 종료 시간 - 처리 시간 + 1
            int start = end - time + 1;
            
            list.add(new Traffic(start, end));  // list에 Traffic(시작 시간, 종료 시간)으로 넣어줌
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int count = 1;  // 작업 수행 후 1초 동안 겹치는 작업 개수
            for (int j = i + 1; j < list.size(); j++) {
                // list(i) 종료 후 1초 내에 list(j)가 시작된다면 count++;
                if (list.get(i).end + 1000 > list.get(j).start)
                    count++;
            }

            answer = Math.max(answer, count);  // max 값으로 answer 값 갱신
        }
        
        return answer;
    }
    
    static class Traffic {  // 트래픽 작업 시간 저장 class
        int start;
        int end;
        
        Traffic(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}

// 종료 시간과 작업 시간을 구하고 이 둘을 이용해 시작 시간을 구하기
// Traffic이라는 형태로 List에 넣어주고 시간을 비교해주며 초당 최대 작업량을 계산
// 현재 작업 종료 시간 + 1000ms > 이후 작업 시작 시간
// 해당 조건에 충족된다면 두 작업이 1초 내에 겹치기 때문에 초당 작업량을 1 증가해주면 됨