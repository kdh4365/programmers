package P120922;

public class Main {
    public static void main(String[] args) {
        int M = 2, N = 2;

        Solution solution = new Solution();
        int answer = solution.solution(M, N);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int M, int N) {
        return M * N - 1;
    }
}