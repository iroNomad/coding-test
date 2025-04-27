class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) {
            return a;
        }
        
        boolean aIsBig = a - b > 0;
        System.out.println(aIsBig);
        if (aIsBig) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }
        
        return answer;
    }
}