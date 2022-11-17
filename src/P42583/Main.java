package P42583;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        int answer = solution.solution(bridge_length, weight, truck_weights);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int index = 0;
        while(true) {
            int sum = 0;
            // 다리길이가 2이면 해당 요소는 2회동안 리스트에 들어가있음
            if (bridge_length == al.size()) al.remove(0);

            // 다리에 있는 트럭의 무게
            for (int j : al) sum += j;
            // 트럭의 무게가 크면 0을 추가
            if (sum + truck_weights[index] <= weight) {
                al.add(truck_weights[index]);
                index++;
            }
            else al.add(0);
            time++;
            // 모든 트럭이 다리를 들어가면 +다리길이
            if (index == truck_weights.length) {
                time += bridge_length;
                break;
            }
        }
        return time;
    }
}