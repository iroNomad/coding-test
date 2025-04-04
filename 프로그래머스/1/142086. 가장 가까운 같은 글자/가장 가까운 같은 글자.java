import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        String[] strArr = s.split("");
        answer.add(-1);
        
        for (int i = 0; i < strArr.length; i++) {

            for (int b = i - 1; b >= 0; b--) {
                // System.out.println("index - " + index);
                // System.out.println("pointer - " + i);
                
                if (i != b && strArr[i].equals(strArr[b])) {
                    answer.add(i - b);
                    break;
                }
                else if (b <= 0) {
                    answer.add(-1);
                    break;
                }
            }
        }
        return answer;
    }
}