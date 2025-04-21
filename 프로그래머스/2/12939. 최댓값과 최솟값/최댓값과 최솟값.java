import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        ArrayList numArr = new ArrayList<>();
        
        for (String c: strArr) {
            numArr.add(Integer.parseInt(c));
        }
        
        answer += Collections.min(numArr);
        answer += " " + Collections.max(numArr);
        
        return answer;
    }
}