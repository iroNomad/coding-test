class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = "" + a + b;
        System.out.println(str);
        
        int doubleInt = 2 * a * b;
        
        if (doubleInt > Integer.parseInt(str)) {
            answer = doubleInt;
        }
        else {
            answer = Integer.parseInt(str);
        }
        
        return answer;
    }
}