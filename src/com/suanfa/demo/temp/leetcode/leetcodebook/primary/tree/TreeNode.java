package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author danie
 * @Date 2022-05-12 19:42
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
