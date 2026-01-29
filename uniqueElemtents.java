import java.util.*;

public class uniqueElemtents {
    public static int[] uniqueElements(int[] arr, int k) {
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        int[] ans = new int[arr.length];
        int ind = 0;
        for(int i=0;i<arr.length;i++) {
            freqCount.put(arr[i], freqCount.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Integer i: freqCount.keySet()) {
            if (freqCount.get(i) != k) ans[ind++] = i; 
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
    
}
