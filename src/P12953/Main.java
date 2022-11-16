package P12953;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {2, 6, 8, 14};
        int answer = sol.solution(arr);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] arr) {
        int gcd = 0;
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(arr[i - 1], arr[i]); // 최대공약수
            arr[i] = arr[i - 1] * arr[i] / gcd;
        }
        return arr[arr.length - 1];
    }

    public int gcd (int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}