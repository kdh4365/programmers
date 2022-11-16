package P12909.src.P42747;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] citations = {1, 5, 2, 6, 3, 7};
        int answer = new Solution().solution(citations);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }
        return answer;
    }
}
