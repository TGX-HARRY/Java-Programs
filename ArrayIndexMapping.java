import java.util.HashMap;

public class ArrayIndexMapping {
    // Question is that you are provided with an array(arr) containing unique IDs
    // and an array(targets) of elements of whose index you need to find and return their sum
    // and targets may contain element which would not be present in given array
    // thinking: map index of each element using hashmaps(unordered) for O(1) lookup
    // complexity: time - O(n+m), memory - O(2n) taking n as length of given array and m as length of targets array
    public static int totalSearchTime(int[] arr, int[] targets) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            mp.put(arr[i], i);
        }
        for(int i: targets) {
            if (mp.containsKey(i)) sum += mp.get(i);
        }
        return sum;
    } 
    public static void main(String[] args) {
        int[] test_arr = {6,4,9,5,1,8,25,10,23,56,74};
        int[] test_targets = {4,1,6,56,74};
        System.out.println("Total search time: " + totalSearchTime(test_arr, test_targets));
        return;
    }
}
