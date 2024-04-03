class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        if(a != b && a != c && b != c){
            answer = a + b + c;
        }else if(a == b && a == c && b == c){
            for (int i = 1; i <= 3; i++) {
                answer *= (int)(Math.pow(a,i)+ Math.pow(b,i)+Math.pow(c,i));
            } 
        }else{
            for (int i = 1; i <= 2; i++){
                answer *= (int)(Math.pow(a,i)+ Math.pow(b,i)+Math.pow(c,i));
            }
        }
        return answer;
    }
}

// Math.pow() 메서드의 반환 값은 double 형식