class Solution

{
    ArrayList<Integer> a= new ArrayList<>();
    public void Traverse(Node root){
        if(root==null){
            return ;
        }
        Traverse(root.left);
        a.add(root.data);
        Traverse(root.right);
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        int ans=0;
        Traverse(root);
        for(int i=0; i<a.size(); i++){
            ans= a.get(a.size()-K);
            //System.out.print(a.get(i)+" ");
        }
        return ans;
    }
}
