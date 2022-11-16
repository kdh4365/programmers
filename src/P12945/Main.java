package P12945;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int answer = sol.solution(n);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    int solution(int n) {
        int answer = 0;
        int[] Fibo = new int[n+1];
        Fibo[0] = 0; Fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            int sum = Fibo[i-1] + Fibo[i-2];
            Fibo[i] = sum % 1234567;
        }
        return Fibo[n];
    }
}