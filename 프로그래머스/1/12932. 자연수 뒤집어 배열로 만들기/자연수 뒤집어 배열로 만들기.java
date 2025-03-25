import java.util.ArrayList;
class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        long inputNum = n;
        while (inputNum > 0) {
            long digit = inputNum % 10;
            answer.add(digit);
            inputNum /= 10;
        }
        
        return answer;
    }
}