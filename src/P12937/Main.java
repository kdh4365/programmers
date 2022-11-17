package P12937;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int num = 3;
        String answer = sol.solution(num);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(int num) {
        return num%2 == 0 ? "Even" : "Odd";
    }
}