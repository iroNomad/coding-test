import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        for (int num: arr) {
            answer.add(num);
        }
        
        int min = Collections.min(answer);
        answer.remove(Integer.valueOf(min));
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}