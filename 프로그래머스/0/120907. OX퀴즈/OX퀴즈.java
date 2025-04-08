import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] quiz) {
        
        ArrayList<String> answer = new ArrayList<>();
        
        for (String q : quiz) {
            String[] temp = q.split(" ");
            int subject = Integer.parseInt(temp[0]);
            String operator = temp[1];
            int operand = Integer.parseInt(temp[2]);
            int total = Integer.parseInt(temp[4]);
            
            boolean result = false;
            if (operator.equals("+")) {
                System.out.printf("%d %s %d = %d\n", subject, operator, operand, total);
                result = subject + operand == total;
            }
            else {
                System.out.printf("%d %s %d = %d\n", subject, operator, operand, total);
                result = subject - operand == total;
            }
            
            answer.add(result ? "O" : "X");
        }
        
        return answer;
    }
}