
class Solution
{
     ArrayList<Integer> a= new ArrayList<>();
    public void inOrder(Node root){
         if(root==null){
              return ;
          }
          
          inOrder(root.left);
          a.add(root.data);
         inOrder(root.right);
         
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
         int t= x.data;
          //add code here.
         inOrder(root);
         int ans= 0;
          for(int i=0 ;i<a.size(); i++){
             if(a.get(i)==t && i!= a.size()-1){
                 ans= a.get(i+1);
                 break;
             }
             else if(a.get(i)==t && i== a.size()-1){
                 ans= -1;
                 break;
             }
           // System.out.print(a.get(i) +" ");
          }
         Node n= new Node(ans);
        return n;
         }
}
