class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean result = false;
        
        String operator = ineq;
        
        if (eq.equals("=")) {
            operator += "=";
        }
        
        switch (operator) {
            case ">=": result = n >= m; break;
            case "<=": result = n <= m; break;
            case ">": result = n > m; break;
            case "<": result = n < m; break;
        }
        
        return result ? 1 : 0;
    }
}