class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            multiple *= num_list[i];
        }
        return multiple < Math.pow(sum,2)? 1:0;
    }
}