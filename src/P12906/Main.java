package P12906;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 1, 3, 3, 0, 1, 1};

        int[] answer = solution.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) continue;
            li.add(arr[i]);
        }
        int[] answer = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            answer[i] = li.get(i);
        }

        return answer;
    }
}