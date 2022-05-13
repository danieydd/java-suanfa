package com.suanfa.demo.temp.leetcode.leetcodebook.primary.tree;

import java.util.Stack;

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
 *      3
 *     / \
 *     1  20
 *       /  \
 *      5   21
 */
public class Test05 {
    public static void preOrder(TreeNode tree) {
        if (tree == null)
            return;
        Stack<TreeNode> q1 = new Stack<>();
        q1.push(tree);//压栈
        while (!q1.empty()) {
            TreeNode t1 = q1.pop();//出栈
            System.out.print(t1.val+" ");
            if (t1.right != null) {
                q1.push(t1.right);
            }
            if (t1.left != null) {
                q1.push(t1.left);
            }
        }
    }
        public static void postOrder (TreeNode tree){
            if (tree == null)
                return;
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(tree);
            while (!s1.isEmpty()) {
                tree = s1.pop();
                s2.push(tree);
                if (tree.left != null) {
                    s1.push(tree.left);
                }
                if (tree.right != null) {
                    s1.push(tree.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().val + " ");
            }
        }
            //1 3 15 20 21
            public static void inOrder (TreeNode tree){
                Stack<TreeNode> stack = new Stack<>();
                while (tree != null || !stack.isEmpty()) {
                    while (tree != null) {
                        stack.push(tree);
                        tree = tree.left;
                    }
                    if (!stack.isEmpty()) {
                        tree = stack.pop();
                        System.out.print(tree.val + " ");
                        tree = tree.right;
                    }
                }
            }

            public static void main (String[]args){
                TreeNode node = new TreeNode(15);
                TreeNode node2 = new TreeNode(21);
                TreeNode node3 = new TreeNode(20, node, node2);
                TreeNode node4 = new TreeNode(1);
                TreeNode node5 = new TreeNode(3, node4, node3);
                preOrder(node5);
                System.out.println();
                inOrder(node5);
                System.out.println();
                postOrder(node5);
            }
        }
