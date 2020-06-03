package com.basic.practice;

public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item){
            this.key = item;
            this.left = this.right = null;
        }
    }

    Node root;

    BinarySearchTree(){
        this.root = null;
    }

    void searchBST(int key){
        root = search(root, key);
        System.out.println(root.key);
        System.out.println(root.left.key);
        System.out.println(root.right.key);
    }

    void insertBST(int key){
        root = insert(root, key);
    }

    void traversalBST(){
        traversal(root);
    }

    void deleteKeyBST(int key){
        root = delete(root, key);
    }

    // Search utility function
    Node search(Node root, int key){

        if (root == null || root.key == key)
            return root;

        if (key < root.key)
            return search(root.left, key);

        return search(root.right, key);
    }

    // Get the level of a Node
    int findLevelOfNode(Node root, int key, int level){
        if (root == null) return 0;
        if (root.key == key) return level;

        int returnVal = findLevelOfNode(root.left, key, level +1);
        if (returnVal != 0) return returnVal;

        returnVal = findLevelOfNode(root.right, key, level +1);
        return returnVal;
    }

    // Get the level of a Node
    int findHeightOfTree(Node root){
        if (root == null) return 0;
         int leftHeight = findHeightOfTree(root.left);
         int rightHeight = findHeightOfTree(root.right);
         return Math.max(leftHeight, rightHeight) + 1;
    }

    void findHeightOfTreeBST(){
        int treeHeight = findHeightOfTree(root);
        System.out.println("Height:"+ treeHeight);
    }

    void findLevelOfNodeBST(int key){
        int level = findLevelOfNode(root, key, 1);
        System.out.println("Level:"+ level);
    }

    // Insert utility function
    Node insert(Node root, int key){

        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder Traversal utility function
    void traversal(Node root){
        if (root != null){
            traversal(root.left);
            System.out.println(root.key);
            traversal(root.right);
        }
    }

    Node delete(Node root, int key){

        // Base case - check if tree is empty
        if (root == null) return root;

        // Traverse the tree
        if(key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);

        else { // if keys are equal
            // Case1 and 2: Node with only one child or no child's
            if (root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            // Case3: Node with left and right child's - find smallest in the subtree
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root){
        int minVal = root.key;

        while (root.left != null){
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }

    // Find the node with max value in BST
    int findMaxNode(Node root){
       if (root == null) return 0;
       int maxVal = root.key;
       while (root.right != null){
           maxVal = root.right.key;
           root = root.right;
       }
        return maxVal;
    }


    void findMinNodeBST(){
        int minVal = minValue(root);
        System.out.println(minVal);
    }

    void findMaxNodeBST(){
        int maxVal = findMaxNode(root);
        System.out.println(maxVal);
    }

    //Sum of all the nodes at given depth
    int sumOfAllNodesAtGivenDepth(Node node, int depthOfTree){
        if (node == null) return 0;
        if (depthOfTree == 1)
            return node.key;
        return sumOfAllNodesAtGivenDepth(node.left, depthOfTree-1)
                + sumOfAllNodesAtGivenDepth(node.right, depthOfTree-1);
    }

    void sumOfAllNodesAtGivenDepthBST(){
        int sum = sumOfAllNodesAtGivenDepth(root, findHeightOfTree(root));
        System.out.println("Sum:"+ sum);
    }

    //calculate the minimum depth of the tree
    int calcMinimumDepth(Node node){
        if (node == null) return 0;
        if(node.left == null && node.right == null)
            return 1;
        if (node.left == null)
            return calcMinimumDepth(node.right) + 1;
        else if (node.right == null)
            return calcMinimumDepth(node.left) + 1;

        return Math.min(calcMinimumDepth(node.left), calcMinimumDepth(node.right)) +1;
    }

    void calcMinimumDepthBST(){
        int minDepth = calcMinimumDepth(root);
        System.out.println("Min Depth:"+ minDepth);
    }

    public static void main(String []a){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertBST(50);
        binarySearchTree.insertBST(90);
       // binarySearchTree.insertBST(100);
        binarySearchTree.insertBST(30);
        binarySearchTree.insertBST(40);

        binarySearchTree.insertBST(20);
        binarySearchTree.insertBST(10);
        binarySearchTree.insertBST(5);
        /*binarySearchTree.insertBST(40);
        binarySearchTree.insertBST(70);
        binarySearchTree.insertBST(60);
        binarySearchTree.insertBST(80);
        */
        binarySearchTree.traversalBST();
        System.out.println("=============");
        //binarySearchTree.findLevelOfNodeBST(30);
        //binarySearchTree.findHeightOfTreeBST();
        //binarySearchTree.sumOfAllNodesAtGivenDepthBST();
        binarySearchTree.calcMinimumDepthBST();
        //binarySearchTree.findMaxNodeBST();
        //binarySearchTree.findMinNodeBST();
        //binarySearchTree.searchBST(70);
        //binarySearchTree.deleteKeyBST(70);
        //binarySearchTree.traversalBST();

    }
}
