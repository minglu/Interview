public static boolean containTree(TreeNode t1, TreeNode t2){
	if (t2==null) return true;
	else return subTree(t1,t2); 
}

public static boolean subTree(TreeNode t1,TreeNode t2){
	if(t1.data == t2.data)
		if(matchTree(t1,t2)) true;
	if (t1==null)
			return false;
	return (subTree(t1.left, t2) || subTree(t1.right,t2))
}

public static boolean matchTree(TreeNode t1, TreeNode t2){
	if(t1.data!=t2.data)
		return false;
	if(t1==null || t2==null)
		return false;
	if(t1==null && t2==null)
		return true;
	 return matchTree(t1.left, t2.left) && matchTree(t1.right,t2.right)
}