import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arraylist = new ArrayList<>(); // 정수를 담을 수 있는 리스트
        for(int i=l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){
            // 현재 반복 중인 수를 문자열로 변환 후, 정규 표현식 [05]+과 일치하는지 확인
            // [05]+는 문자열이 '0' 또는 '5'로만 이루어진 경우를 의미
                arraylist.add(i);
            }
        }
        
        if(arraylist.isEmpty()){
        // 리스트가 비어있는지 확인
            return new int[]{-1};
        }
        
        int[] a = new int[arraylist.size()];
        // 리스트의 크기만큼의 크기를 갖는 정수 배열 a를 생성
        for(int j=0; j<arraylist.size(); j++){
        // 리스트의 모든 요소에 대해 반복문을 실행
            a[j] = arraylist.get(j);
            // 리스트의 각 요소를 배열에 저장
        }
        return a;
    }
}