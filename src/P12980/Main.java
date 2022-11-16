package P12980;


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;
        int answer = sol.solution(N);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int N) {
        int answer = 0;
        while (N != 0) {
            if (N % 2 == 0) N /= 2;
            else {
                answer++;
                N--;
            }
        }
        return answer;
    }
}