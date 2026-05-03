public class NextSmallerElement {
    public static int[] nextSmallerElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nextSmallerElements(arr);
        System.out.print("Next smaller elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        return;
    }
}
