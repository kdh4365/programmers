package P12951;

public class Main {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String answer = new P12951.Solution().solution(s);

        System.out.println(answer);
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        String s_lower = s.toLowerCase();
        char[] word = s_lower.toCharArray();
        for (int i = 0; i < word.length; i++) {
            // 첫번째 문자를 대문자로
            if (i == 0) {
                if (word[0] >= 'a' && word[0] <= 'z') {
                    word[0] = (char)(word[0] - 32);
                }
            }
            // 단어의 첫번째 문자를 대문자로
            else {
                // 바로 앞에서 띄어쓰기를 사용했을 때
                if (word[i - 1] == ' ') {
                    // 소문자이면 대문자
                    if (word[i] >= 'a' && word[i] <= 'z') {
                        word[i] = (char)(word[i] - 32);
                    }
                }
            }
            answer += word[i];
        }
        return answer;
    }
}
