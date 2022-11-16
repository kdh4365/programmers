package P12941;
import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer = answer + (A[i] * B[A.length - i - 1]);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int answer = new P12941.Solution().solution(A, B);

        System.out.println(answer);
    }
}
