package P12944;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2, 3, 4};
        double answer = sol.solution(arr);
        System.out.println(answer);
    }
}

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}