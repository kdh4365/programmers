package P12985;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 8, a = 4, b = 7;
        int answer = sol.solution(n, a, b);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }
        return answer;
    }
}