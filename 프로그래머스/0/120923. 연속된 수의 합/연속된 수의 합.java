import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int num, int total) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        int sum = 0;
        
        if (num == 1) {
            arrList.add(total);
            return arrList;
        }
        for (int i = 0; i < num; i++) {
            arrList.add(i);
            sum += i;
        }
        System.out.println("Innitial arr: " + arrList);
        System.out.println("Innitial sum: " + sum);
        
        while (sum > total) {
            sum = 0;
            arrList.add(0, arrList.get(0) - 1);
            arrList.remove(arrList.get(arrList.size()-1));
            
            for (int n : arrList) {
                sum += n;
            }
            System.out.println(sum);
        }
        
        while (sum < total) {
            
            sum = 0;
            arrList.remove(0);
            arrList.add(arrList.get(arrList.size()-1) + 1);
            
            for (int n : arrList) {
                sum += n;
            }
            System.out.println(sum);
        }
        return arrList;
    }
}