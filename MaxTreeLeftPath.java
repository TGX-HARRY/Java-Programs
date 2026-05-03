public class MaxTreeLeftPath {
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int helper(TreeNode root, int sum, int ans) {
        if (root.left == null && root.right == null) {
            sum += root.data;
            if (ans < sum) ans = sum;
            return sum;
        }
        sum += root.data;
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        if (root.left != null) leftMax = helper(root.left, sum, ans);
        if (root.right != null) rightMax = helper(root.right, sum, ans);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(-10);
        root.left = new TreeNode(2);
        // root.right = new TreeNode(6);
        // root.left = new TreeNode(2);
        // root.left.left = new TreeNode(3);
        // root.left.right = new TreeNode(5);
        System.out.println("Answer: " + helper(root, 0, Integer.MIN_VALUE));
    }
}