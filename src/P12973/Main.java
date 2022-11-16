package P12973;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "baabaa";
        int answer = sol.solution(s);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    int solution(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.empty() && st.peek() == ch) st.pop();
            else st.push(ch);
        }
        return st.empty() ? 1 : 0;
    }
}