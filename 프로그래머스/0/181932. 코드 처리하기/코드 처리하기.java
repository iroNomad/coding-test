class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (mode == 0 && c == '1') {
                mode = 1;
            }
            else if (mode == 0 && c != '1' && i % 2 == 0) {
                ret += c;
            }
            else if (mode == 1 && c == '1') {
                mode = 0;
            }
            else if (mode == 1 && c != '1' && i % 2 != 0) {
                ret += c;
            }
        }
        
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}