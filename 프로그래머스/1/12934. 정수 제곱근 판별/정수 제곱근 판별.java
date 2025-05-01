class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if (num % 1 == 0) {
            return (long)(num + 1) * (long)(num + 1);
        }
        return -1;
    }
}