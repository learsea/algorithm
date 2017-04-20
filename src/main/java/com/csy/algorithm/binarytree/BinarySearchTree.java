package com.csy.algorithm.binarytree;

/**
 * Created by csy on 2017/4/20.
 * 二叉排序树
 */
public class BinarySearchTree {
    private Node tree;

    private class Node {
        private int key;
        private Node lChild;
        private Node rChild;
    }

    private Node insertNode(int key, Node node) {
        if (node == null) {
            node = new Node();
            node.key = key;
        } else {
            if (key <= node.key) {
                node.lChild = insertNode(key, node.lChild);
            } else {
                node.rChild = insertNode(key, node.rChild);
            }
        }
        return node;
    }

    public void build(int[] src) {
        for (int i : src) {
            tree = insertNode(i, tree);
        }
    }

    private void preOrderView(Node node) {
        if (node != null) {
            System.out.printf("%d,", node.key);
            preOrderView(node.lChild);
            preOrderView(node.rChild);
        }
    }

    private void miOrderView(Node node) {
        if (node != null) {
            miOrderView(node.lChild);
            System.out.printf("%d,", node.key);
            miOrderView(node.rChild);
        }
    }

    private void afOrderView(Node node) {
        if (node != null) {
            afOrderView(node.lChild);
            afOrderView(node.rChild);
            System.out.printf("%d,", node.key);
        }
    }

    public void view() {
        preOrderView(tree);
        System.out.println();
        miOrderView(tree);
        System.out.println();
        afOrderView(tree);
    }

    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();
        bs.build(new int[]{1, 3, 8, 10, 14, 6, 4, 7, 13});
        bs.view();
    }
}
