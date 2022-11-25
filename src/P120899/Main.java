package P120899;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {9, 10, 11, 8};

        int[] answer = solution.solution(array);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            answer[0] = Math.max(answer[0], array[i]);
            if (answer[0] == array[i]) answer[1] = i;
        }
        return answer;
    }
}