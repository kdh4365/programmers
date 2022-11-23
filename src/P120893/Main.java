package P120893;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String my_string = "abCdEfghIJ";
        String answer = solution.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') c = (char)(c - 'A' + 'a');
            else if (c >= 'a' && c <= 'z') c = (char)(c - 'a' + 'A');
            answer += c;
        }
        return answer;
    }
}