public class BinaryTree {
    public static class TreeNode {
        private int data;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {
            this.left = null;
            this.right = null;
        }
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return this.data;
        }
    }

    public static class Helper {
        public void addNode(TreeNode root, int data) {
            if (data < root.getData()   ) {
                // go left
                if (root.left != null) {
                    addNode(root.left, data);
                }
                else {
                    root.left = new TreeNode(data);
                    System.out.println(data + " Node append left to " + root.getData());
                }
            }
            else {
                // go right 
                if (root.right != null) {
                    addNode(root.right, data);
                }
                else {
                    root.right = new TreeNode(data);
                    System.out.println(data + " Node append right to " + root.getData());
                }
            }
        }

        public void inorderTraversal(TreeNode root) {
            if (root.left != null) inorderTraversal(root.left);
            System.out.print(root.getData() + " -> ");
            if (root.right != null) inorderTraversal(root.right);
        }

        public void postorderTraversal(TreeNode root) {
            if (root.left != null) postorderTraversal(root.left);
            if (root.right != null) postorderTraversal(root.right);
            System.out.print(root.getData() + " -> ");
        }

        public boolean searchTree(TreeNode root, int target) {
            if (root == null) {
                return false;
            }
            if (root.getData() == target) {
                return true;
            }
            if (target < root.getData()) {
                // go left
                searchTree(root.left, target);
            }
            else {
                // go right
                searchTree(root.right, target);
            }
            return false;
        }

        public int getHeight(TreeNode root) {
            if (root == null) return -1;
            int x = getHeight(root.left) + 1;
            int y = getHeight(root.right) + 1;
            return Math.max(x,y);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        Helper helper = new Helper();
        int elementsToAdd[] = {7, 15, 3, 8, 14, 19, 18};
        for(int i=0;i<elementsToAdd.length;i++) {
            helper.addNode(root, elementsToAdd[i]);
        }
        //------------------------------------------------
        helper.inorderTraversal(root);
        System.out.println();
        //-------------------------------------------------
        boolean found = helper.searchTree(root, 140);
        if (found) System.out.println("Found");
        else System.out.println("Not found");
        //--------------------------------------------------
        int height = helper.getHeight(root);
        System.out.println("Height of tree = " + height);
        // -------------------------------------------------
        return;
    }
}