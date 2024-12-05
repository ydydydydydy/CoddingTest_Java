import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        // mats 배열을 내림차순으로 정렬
        Arrays.sort(mats);  // 오름차순 정렬
        for (int i = 0; i < mats.length / 2; i++) {  // 내림차순으로 변경
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }

        // 공원 배열에서 확인
        for (int i : mats) {  // 각 돗자리 크기에 대해
            for (int j = 0; j <= park.length - i; j++) {  // 공원의 모든 셀을 탐색
                for (int h = 0; h <= park[0].length - i; h++) {
                    boolean chk = true;

                    // 돗자리를 놓을 수 있는지 확인 
                    if (park[j][h].equals("-1") && j + i <= park.length && h + i <= park[0].length) {
                        for (int k = 0; k < i; k++) {  // 돗자리 크기만큼 내부 확인
                            for (int l = 0; l < i; l++) {
                                if (!park[j + k][h + l].equals("-1")) {  // 사람이 있으면 돗자리 설치 불가
                                    chk = false;
                                    break;
                                }
                            }
                            if (!chk) break;  // 중간에 사람이 있으면 루프 중단
                        }
                        if (chk) {  // 설치 가능할 경우 바로 답을 반환
                            return i;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
// 돗자리를 크기가 큰 순서부터 필 수 있는지 검사하기 위해 내림차순으로 정렬하고 각 돗자리 크기에 맞게 배열을 탐색
// 4중 for문으로 구성할건데 첫 for문2개는 공원의 모든 인덱스를 탐색
// 공원에서 빈 공간을 찾으면 그 공간에서 시작해서 돗자리 크기만큼 모두 빈 공간인지 탐색해야함
// 돗자리가 공원의 범위를 벗어나면 안되니까 범위 지정