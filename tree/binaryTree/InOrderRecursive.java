package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class InOrderRecursive {
    private void inorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, answer);   // traverse left subtree
        answer.add(root.val);                  // visit the root
        inorderTraversal(root.right, answer);  // traverse right subtree
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorderTraversal(root, answer);
        return answer;
    }
}
