package DailyChallenge;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() { }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.left = left;
        this.right = right;
    }
}

public class LC_2415_24_12_21 {
    public TreeNode reverseOddLevels(TreeNode root) {
        // TreeNode itrate = root;
        if(root == null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root); // if que is full this will throw and error "IllegalStateException" so need to be handled that case
        queue.offer(root); // if que is full this will return false... better approach
        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int levelSize = queue.size();
            ArrayList<TreeNode> rev = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();


                if (node.left != null) {
                    queue.offer(node.left);
                    rev.add(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    rev.add(node.right);
                }
            }
            
            if(level%2 != 0){
                int end = rev.size() -1;
                int start = 0;
                while(start<end){
                    int temp = rev.get(start).val;
                    rev.get(start).val = rev.get(end).val;
                    rev.get(end).val = temp;
                    start++;
                    end--;
                }
            }
            
        }
        return root;

    }

    public static void main(String[] args) {
        // Create the test input tree
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

        // Call the reverseOddLevels method
        System.out.println("Original Tree:");
        LC_2415_24_12_21 solution = new LC_2415_24_12_21();
        solution.printTreeLevelOrder(root);

        TreeNode reversedRoot = solution.reverseOddLevels(root);

        // Print the reversed tree (optional)
        // Print the reversed tree
        System.out.println("\nReversed Tree:");
        solution.printTreeLevelOrder(reversedRoot);

    }

        // Helper function to print the tree in level order
    private void printTreeLevelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            System.out.println(); // Move to the next line after each level
        }
    }
}
