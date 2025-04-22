class Solution {
    public int solution(int n) {
        int answer = 0;
        int originalCount = 0;
        String inputBinary = Integer.toBinaryString(n);
        int inputBinaryLen = inputBinary.replace("0", "").length();
        
        while (answer == 0) {
            for (int i=n+1; i < 1000000; i++) {
                String binaryOnes = Integer.toBinaryString(i).replace("0", "");
                if (binaryOnes.length() == inputBinaryLen) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}