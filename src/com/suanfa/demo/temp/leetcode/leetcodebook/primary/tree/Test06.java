package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

/**
 * @ClassName Test06
 * @Description 对称二叉树
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * 3
 * /    \
 * 20    20
 * / \   / \
 * 10 15 15 10
 * @Author danie
 * @Date 2022-05-13 16:39
 */
public class Test06 {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        //叶子节点
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        isSymmetric(left.left, right.right);
        isSymmetric(left.right, right.left);
        return true;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(21, node1, node2);

        TreeNode node11 = new TreeNode(14);
        TreeNode node22 = new TreeNode(10);
        TreeNode node33 = new TreeNode(20, node11, node22);

        TreeNode node333 = new TreeNode(3, node3, node33);
        System.out.println("isSymmetric=" + isSymmetric(node333));
    }
}
