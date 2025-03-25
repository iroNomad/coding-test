import java.util.*;

public class Solution {
    public int solution(int n) {
        int inputNum = n;
        int answer = 0;

        while (inputNum > 0) {
            int digit = inputNum % 10;
            // System.out.println(digit);
            answer += digit;
            inputNum /= 10;
        }

        return answer;
    }
}