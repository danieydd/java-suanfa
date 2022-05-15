package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

import java.util.List;

/**
 * @ClassName Test08
 * @Description 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * <p>
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * 输入：nums = [-10,-3,0,5,9]
 * 输出：[0,-3,9,-10,null,5]
 * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
 * @Author danie
 * @Date 2022-05-15 15:27
 */
public class Test08 {
    public static TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0)
            return null;
        return sortedArrayToBST(num, 0, num.length - 1);

    }

    public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBST(num, start, mid - 1);
        root.right = sortedArrayToBST(num, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-10,-3,0,5,9};
        TreeNode treeNode = sortedArrayToBST(array);
        System.out.println("sortedArrayToBST=" + treeNode);
    }
}
