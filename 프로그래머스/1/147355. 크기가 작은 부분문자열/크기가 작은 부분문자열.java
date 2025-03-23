class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        
        for (int i = t.length() - pLength; i >= 0; i--) {
            String strNum = t.substring(i, i + pLength);
        
            long num = Long.parseLong(strNum);
            if (num <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}