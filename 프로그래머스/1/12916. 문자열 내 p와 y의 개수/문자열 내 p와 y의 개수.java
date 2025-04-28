class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        String str = s.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'p') {
                pCount++;
            }
            else if (c == 'y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}