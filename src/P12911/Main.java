package P12911;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        int answer = sol.solution(n);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    int solution(int n) {
        int answer = 0;
        int cnt = 0;

        String bin_n = Integer.toBinaryString(n);
        char[] binn = bin_n.toCharArray();
        // 이진수 변환 후 1의 갯수
        for (char ch : binn) if (ch == '1') cnt++;

        String bin_answer = "";
        while (true) {
            int cnt_answer = 0;
            n++;
            bin_answer = Integer.toBinaryString(n);
            char[] binan = bin_answer.toCharArray();
            for (char ch : binan) if (ch == '1') cnt_answer++;
            if (cnt == cnt_answer) break;
        }
        answer = Integer.parseInt(bin_answer, 2);
        return answer;
    }
}
