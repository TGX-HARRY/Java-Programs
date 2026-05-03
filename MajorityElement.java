public class MajorityElement {
    public static int getMajorityElement(int[] arr) {
        int ans = -1;
        int count = 0;
        int candidate = -1;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if (count==0) candidate = arr[i];
            if(arr[i] == candidate) count++;
            else count--;
        }
        count = 0;
        for(int i=0;i<n;i++) {
            if (arr[i] == candidate) count++;
        }
        if (count > n/2) ans = candidate;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println("Majority Element: " + getMajorityElement(arr));
        return;
    }
}
