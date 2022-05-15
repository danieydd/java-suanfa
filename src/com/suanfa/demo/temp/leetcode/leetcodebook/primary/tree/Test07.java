package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName Test07
 * @Description 二叉树的层序遍历
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[9,20],[15,7]]
 * @Author danie
 * @Date 2022-05-15 14:31
 */
public class Test07 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        //边界条件判断
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> path = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = deque.removeFirst();
                path.add(curr.val);
                if (curr.left != null) {
                    deque.add(curr.left);
                }
                if (curr.right != null) {
                    deque.add(curr.right);
                }
            }
            res.add(path);
        }
        return res;

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(21, node1, node2);

        TreeNode node11 = new TreeNode(14);
        TreeNode node22 = new TreeNode(10);
        TreeNode node33 = new TreeNode(20, node11, node22);

        TreeNode node333 = new TreeNode(3, node3, node33);
        System.out.println("levelOrder=" +levelOrder(node333));
    }

}
