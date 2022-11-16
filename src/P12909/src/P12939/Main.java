package P12909.src.P12939;

import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String answer = new Solution().solution(s);

        System.out.println(answer);
    }
}

class Solution {
    public String solution(String s) {
        // stringTokenizer를 이용해서 나누기
        StringTokenizer st = new StringTokenizer(s, " ");
        int[] n = new int[st.countTokens()];
        int Max = Integer.MIN_VALUE, Min = Integer.MAX_VALUE;
        // 나눌때 마다 최댓값, 최솟값 정의
        for (int i = 0; st.hasMoreTokens(); i++) {
            n[i] = Integer.parseInt(st.nextToken());
            Max = Math.max(Max, n[i]);
            Min = Math.min(Min, n[i]);
        }
        // 최댓값, 최솟값을 String형으로 변경
        String sb = Min + " " + Max;
        return sb;
    }
}