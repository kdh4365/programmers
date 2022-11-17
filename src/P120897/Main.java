package P120897;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 24;
        int[] answer = solution.solution(n);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n%i==0) al.add(i);
        }

        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}