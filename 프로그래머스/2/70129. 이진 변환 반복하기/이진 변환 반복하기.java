class Solution {
    public int[] solution(String s) {
        
        String mainStr = s;
        int strLen = 0;
        int zeroCount = 0;
        int rotCount = 0;
        
        while (!mainStr.equals("1")) {
            for (char c : mainStr.toCharArray()) {
                if (c == '0') {
                    zeroCount++;
                }
                else {
                    strLen++;
                }
            }            
            mainStr = Integer.toBinaryString(strLen);
            strLen = 0;
            rotCount++;
        }
        int[] answer = {rotCount, zeroCount};
        return answer;
    }
}