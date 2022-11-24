package P120878;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int a = 12, b = 21;
        int answer = solution.solution(a, b);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int a, int b) {
        // 기약분수
        for (int i = 1; i <= a; i++) {
            if (b % i == 0 && a % i == 0) {
                a /= i; b /= i;
            }
        }

        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        return b == 1 ? 1 : 2;
    }
}