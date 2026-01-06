import java.util.HashSet;

public class LongestConsecutiveCount {
    public static int LongestCount(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int id: arr) {
            set.add(id);
        }
        int largest = 0;
        for(int id: set) {
            if (set.contains(id-1)) {
                int currentId = id;
                int count = 1;
                while(set.contains(currentId+1)) {
                    currentId++;
                    count++;
                }
                largest = Math.max(largest, count);
            }
        }
        return largest + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10,101,12,13,11,100,25};
        System.out.println("Answer : " + LongestCount(arr, arr.length));
        return;
    }
}
