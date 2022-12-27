package binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Binary Tree Preorder Traversal
 *
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 * Example 2:
 *
 * Input: root = []
 * Output: []
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 */
public class PreOrderTraversal {
    private List<Integer> answer = new ArrayList<>();

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        // Visit the root first, then the left subtree, then the right subtree.
        answer.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return answer;
    }
}
