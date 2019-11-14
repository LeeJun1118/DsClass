package Test1_1;

import java.util.LinkedList;

public class Test
{
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int n[] = {50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
        //System.out.println(Test1_1.BinarySearchTree.inorder(tree.root));

    }
}

class BinarySearchTree {
    class BinaryTree {
        int key;
        BinaryTree left, right;

        public BinaryTree(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return Integer.toString(key);
        }
    }

    BinaryTree root;

    public void add(int key) {
        root = add(root, key);
    }

    private BinaryTree add(BinaryTree tree, int key) {
        if (tree == null) return new BinaryTree(key);
        if (tree.key < key) tree.right = add(tree.right, key);
        else if (tree.key > key) tree.left = add(tree.left, key);
        else ; // value 삽입 시 else tree.value=value;
        return tree;
    }

    public BinaryTree search(int key) {
/*
        BinaryTree node = root;
        while (node != null) {
            if (node.key == key) return node;
            if (node.key < key) node = node.right;
            else node = node.left;
            }
            return node;
*/
            return searchRecur(root, key);
    }
    private BinaryTree searchRecur(BinaryTree node, int key) {
        if(node == null) return node;
        if (node.key == key) return node;
        else
        return (node.key < key) ? (searchRecur(node.right, key)) : (searchRecur(node.left, key));
    }
    @Override
    public String toString() {
        return levelOrder().toString();
    }

    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list = new LinkedList<>();
        LinkedList<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.removeFirst();
            list.add(node);
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
        }
        return list;
    }
}
