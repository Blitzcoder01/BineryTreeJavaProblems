
/*Complete The Function Below*/
class Tree
{
	public static int getSize(Node root)
	{
//add Code here.
        if(root== null){
            return 0;
        }
        int c= getSize(root.left) + getSize(root.right)+1;
        return c;
    }
}
