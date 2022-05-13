package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

/**
 * @ClassName Test01
 * @Description 二叉树的最大深度
 * [3,9,20,null,null,15,7]
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 * @Author danie
 * @Date 2022-05-12 18:59
 */
public class Test01 {
    public static int maxDepth(TreeNode root) {
       return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(15);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(20, node, node2);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(3, node4, node3);
        int depth = maxDepth(node5);
        System.out.println("depth=" + depth);
    }
}
