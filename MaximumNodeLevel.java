class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code 
        int max= Integer.MIN_VALUE;
        int l=0; 
        int l2=0;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum= size;
            for(int i=0; i<size; i++){
               Node temp= q.poll();
               if(temp.left!=null){
                   q.add(temp.left);
               }
               if(temp.right!= null){
                   q.add(temp.right);
               }
            }
            if(max<sum){
                max= sum;
                l2= l;
                
            }
           l++; 
        }
        return l2;
    }
}
