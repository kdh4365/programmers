package P70129;

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        StringBuffer sb = new StringBuffer();
        // s가 1일때까지 반복
        while(!s.equals("1")) {
            // 0 제거
            char[] arr0 = s.toCharArray();
            for (char ch : arr0) {
                if (ch != '0') sb.append(ch);
                else answer[1]++; // 0 지운 횟수
            }
            // 0제거 후 길이
            int len = sb.toString().length();
            s = Integer.toBinaryString(len); // len을 2진수로 변환
            // StringBuffer를 지워준다
            sb.delete(0, sb.length());
            answer[0]++; //사이클 횟수
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
       String s = "110010101001";

        int[] answer = new P70129.Solution().solution(s);

        System.out.println(Arrays.toString(answer));
    }
}
