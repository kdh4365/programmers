package P120864;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        Solution solution = new Solution();
        int answer = solution.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String my_string) {
        String[] num = my_string.replaceAll("[^0-9]"," ").split(" ");
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("")) {
                continue;
            }
            sum += Integer.parseInt(num[i]);
        }
        return sum;
    }
}