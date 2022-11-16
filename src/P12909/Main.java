package P12909;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "()()";
        boolean answer = new P12909.Solution().solution(s);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    boolean solution(String s) {
        // 0번 인덱스가 ')'이거나 마지막 인덱스가 '('이면 올바르지 않는 괄호
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(')
            return false;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') st.add(1);
            else {
                if (st.empty()) {
                    return false;
                }
                st.pop();
            }
        }
        if (st.empty()) return true;
        else return false;
    }
}

