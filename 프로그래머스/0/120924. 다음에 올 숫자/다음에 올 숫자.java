class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int firstDiff = common[1] - common[0];
        int secondDiff = common[2] - common[1];
        
        if (firstDiff == secondDiff) {
            answer = common[common.length - 1] + firstDiff;
        }
        else {
            answer = common[common.length - 1] * (common[2] / common[1]);
        }
        
        return answer;
    }
}