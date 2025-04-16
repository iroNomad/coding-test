class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        String oddTotal = "";
        String evenTotal = "";
        
        for (int num: num_list) {
            if (num % 2 == 0) {
                evenTotal += num;
            }
            else {
                oddTotal += num;
            }
        }
        
        answer = Integer.parseInt(oddTotal) + Integer.parseInt(evenTotal);
        
        return answer;
    }
}