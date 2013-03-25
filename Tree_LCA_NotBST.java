//For not BST, we use cover to check, but big-O is huge, it visits nodes multiple times

public static boolean cover (TreeNode root, TreeNode node){ //is node a chid of root?
	if (root == null) return false;
	if (root == node) return true;
	return cover(root.left, node) || cover(root.right, node);
}


public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
	if (cover(root.left, p) && cover(root.left, q))
		findLCA(root.left, p, q);
	if (cover(root.right,p) && cover(root.right,q))
		findLCA(root.right,p, q);
	return root;
}

//better method, give points like two_nodes_found =2, one_node_found =1, no_nodes_found =0
public static int cover (TreeNode root, TreeNode p, TreeNode q){
	int result =0;
	if (root == null) return 0;
	if (root ==p || root ==q) result += 1;
	result + = cover(root.left, p ,q);
	if(result = 2)
		return result;
	return result + cover(root.right,p,q)
}

public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
	
	int nodesFromLeft = cover(root.left, p ,q);	
	
	if (nodesFromLeft ==2){
		if(root.left == p || root.left == q) return root.left;
		else return findLCA(root.left,p,q)
	} else if (nodesFromLeft ==0){
		if (root==p) return p;
		else if (root==q) return q;
	}
	
	int nodesFromRight= cover(root.right, p ,q);
	if (nodesFromRight ==2){
		if(root.Right == p || root.Right == q) return root.Right;
		else return findLCA(root.Right,p,q)
	} else if (nodesFromRight ==0){
		if (root==p) return p;
		else if (root==q) return q;
	}
	
	if (nodesFromLeft ==1 && nodesFromRight==1) return root;
	
	return null;
}