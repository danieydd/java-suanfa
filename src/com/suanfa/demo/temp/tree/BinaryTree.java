package com.suanfa.demo.temp.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName BinaryTree
 * @Description 二叉树遍历
 * 递归实现 基于链表
 * 前序遍历:根左右
 * 中序遍历:左根右
 * 后序遍历:左右根
 * 层序遍历
 * @Author danie
 * @Date 2021-11-07 16:38
 */
public class BinaryTree {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    /***
     * @description: 创建二叉树
     * @author danie
     * @date 2021-11-07 16:45
     * @version 1.0
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode treeNode = null;
        if (inputList == null || inputList.isEmpty()) {
            return treeNode;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.left = createBinaryTree(inputList);
            treeNode.right = createBinaryTree(inputList);
        }
        return treeNode;
    }

    /***
     * @description: 前序遍历
     * @author danie
     * @date 2021-11-07 17:04
     * @version 1.0
     */
    public static void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    /***
     * @description: 中序遍历
     * @author danie
     * @date 2021-11-07 17:04
     * @version 1.0
     */
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    /***
     * @description: 后序遍历
     * @author danie
     * @date 2021-11-07 17:04
     * @version 1.0
     */
    public static void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    /***
     * @description: 层序遍历
     * @author danie
     * @date 2021-11-07 20:26
     * @version 1.0
     */
    public static void levelOrderTranversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        //增加元素
        queue.offer(root);
        while (!queue.isEmpty()) {
            //获取并且移除首元素
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}));
        TreeNode binaryTree = createBinaryTree(linkedList);
     //   System.out.println(new Gson().toJson(binaryTree));
        System.out.println("前序遍历");
        preOrderTraversal(binaryTree);
        System.out.println("中序遍历");
        inOrderTraversal(binaryTree);
        System.out.println("后序遍历");
        postOrderTraversal(binaryTree);
        System.out.println("层序遍历");
        levelOrderTranversal(binaryTree);
    }
}
