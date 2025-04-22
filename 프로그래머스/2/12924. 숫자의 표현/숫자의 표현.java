class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        
        while (start <= n) {
            
            int total = 0;
            
            for (int i=start; i <= n; i++) {
                total += i;
                if (total > n) {
                    break;
                }
                else if (total == n) {
                    answer++;
                }
            }
            start++;
        }
        
        
        return answer;
    }
}