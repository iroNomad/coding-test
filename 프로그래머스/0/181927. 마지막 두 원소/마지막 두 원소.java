import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int num : num_list) {
            arr.add(num);
        }
        
        int last = num_list.length - 1;
        int secondLast = num_list.length - 2;
        if (num_list[last] > num_list[secondLast]) {
            arr.add(num_list[last] - num_list[secondLast]);
        }
        else {
            arr.add(num_list[last] * 2);
        }

        return arr;
    }
}