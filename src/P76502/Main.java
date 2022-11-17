package P76502;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "[](){}";
        int answer = sol.solution(s);
        // 출력
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<Character> c = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            c.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            boolean empty = new Cycle().cycle(c);

            if (empty) answer++;
            c.add(c.get(0));
            c.remove(0);
        }

        return answer;
    }
}

class Cycle {
    public boolean cycle (List<Character> s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.size(); i++) {
            char c = s.get(i);
            // 괄호를 열면 push
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            // 닫으면 pop
            // 비어있거나 top에 있는 괄호와 맞지 않으면 break
            else {
                if (st.empty()) {
                    break;
                }

                if (c == ')') {
                    if (st.peek() == '(') st.pop();
                    else break;
                }
                else if (c == '}') {
                    if (st.peek() == '{') st.pop();
                    else break;
                }
                else {
                    if (st.peek() == '[') st.pop();
                    else break;
                }
            }
            if (i == s.size() - 1 && st.empty()) return true;
        }
        return false;
    }
}
