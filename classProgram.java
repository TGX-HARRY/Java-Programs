

public class classProgram {
    public static void main(String[] args) {
        int[] arr = {1,3,7,2,17,2,6,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if (max<arr[i]) max=arr[i];
        }

        for(int i=0;i<arr.length/2;i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for(int el: arr) {
            System.out.println(el);
        }
    }
}
