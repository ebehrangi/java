package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        // Note that we add currNode's right child to the stack first.
        while (!stack.isEmpty()) {
            TreeNode currNode = stack.peek();
            stack.pop();
            if (currNode != null) {
                answer.add(currNode.val);
                stack.add(currNode.right);
                stack.add(currNode.left);
            }
        }

        return answer;
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
    System.out.println(preorderTraversal(root));
    }
}
