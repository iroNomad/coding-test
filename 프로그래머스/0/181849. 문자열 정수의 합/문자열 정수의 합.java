class Solution {
    public int solution(String num_str) {
        int answer = 0; 
        char[] charArr = num_str.toCharArray();
        for (char c: charArr) {
            if (c == '0') continue;
            answer += c - '0';
        }
        return answer;
    }
}