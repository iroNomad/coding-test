import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int counter = a;
        int[] arr = new int[included.length];
        for (int i=0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = counter;
            }
            else {
                counter += d;
                arr[i] = counter;
            }
        }
        
        for (int i=0; i < arr.length; i++) {
            if (included[i]) {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}