import java.util.HashMap;

public class ForestResearch {
    // question: find the 2 elements with odd frequency and print them in ascending order
    // example: {4, 2, 2, 3, 1, 1, 4, 4 ,1, 1}
    // output: 3 4
    // thinking: use map to store frequencies and filter out odd ones
    // complexity: time->O(n) memory->O(2n)
    public static void forestResearch(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i: arr) {
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i: mp.keySet()) {
            if (mp.get(i) %2 != 0) {
                if (i<first) {
                    second = first;
                    first = i;
                }
                else second = i;
            }
        }
        if (first<second) {
            System.out.println(first + " " + second);
        }
        else {
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        int[] test_arr = {4, 2, 2, 3, 1, 1, 4, 4 ,1, 1};
        forestResearch(test_arr);
        return;
    }
}