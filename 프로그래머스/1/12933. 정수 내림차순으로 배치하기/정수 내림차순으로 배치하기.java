import java.util.*;

class Solution {
    public long solution(long n) {
        
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        long num = n;
        
        while (num > 0) {
            arr.add(num % 10L);
            num /= 10L;
        }
        
        Collections.sort(arr);
        Collections.reverse(arr);
        
        while (!arr.isEmpty()) {
            answer *= 10L;
            answer += arr.remove(0);
        }
        
        return answer;
    }
}