package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

/**
 * @ClassName Test03
 * @Description 验证二叉搜索树
 * @Author danie
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 有效 二叉搜索树定义如下：
 * <p>
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 输入：root = [2,1,3]
 * 输出：true
 * 3
 * / \
 * 1  20
 * /  \
 * 15   21
 */
public class Test03 {

    public static boolean isValidBST(TreeNode root) {
     return    isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValidBST(TreeNode root, long minValue,long maxValue) {
        if (root == null) return true;
        if (root.val >= maxValue || root.val <= minValue)
            return false;
        return isValidBST(root.left,minValue,root.val) && isValidBST(root.right,root.val,maxValue);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(15);
        TreeNode node2 = new TreeNode(23);
        TreeNode node3 = new TreeNode(20, node, node2);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3, node4, node3);
        boolean isValidBST = isValidBST(node5);
        System.out.println("isValidBST=" + isValidBST);
    }
}
