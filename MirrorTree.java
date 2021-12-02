class Solution {
    // Function to convert a binary tree into its mirror tree.
    Node mirror(Node node) {
        // Your code here
        if(node== null){
            return null;
        }
        Node right= mirror(node.right);
        Node left= mirror(node.left);
        node.left= right;
        node.right= left;
        return node;
        
    }
    
}
