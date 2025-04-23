import java.util.*;

class Solution {
    Hashtable<Integer, Integer> memo = new Hashtable<>();
    public int solution(int n) {
        return fib(n);
    }
    public int fib(int num) {
        
        int result = 0;
        if (memo.containsKey(num)) {
            return memo.get(num);
        }
        if (num == 0) {
            return 0;
        }
        else if (num == 1) {
            return 1;
        }
        result = (fib(num - 1) + fib(num - 2)) % 1234567;
        memo.put(num, result);
        return result;
    }
}