package P42748;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        Solution solution = new Solution();
        int[] answer = solution.solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int len = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[len];
            int n = 0;
            int k = commands[i][0] - 1;
            for (int j = 0; j < len; j++, k++) {
                arr[j] = array[k];
            }
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}