package P12939;

import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String answer = new P12939.Solution().solution(s);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int[] n = new int[st.countTokens()];
        int Max = Integer.MIN_VALUE, Min = Integer.MAX_VALUE;
        for (int i = 0; st.hasMoreTokens(); i++) {
            n[i] = Integer.parseInt(st.nextToken());
            Max = Math.max(Max, n[i]);
            Min = Math.min(Min, n[i]);
        }
        String sb = Min + " " + Max;
        return sb;
    }
}