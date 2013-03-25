//minimal Height: left and right are almost equal.

public static TreeNode CreateMinHeightTree (int array[]){
	returnn addtoTree(array, 0, array.length-1);
}

public static TreeNode addtoTree (int array[], int start, int end){
	int middle = (start+end)/2;
	
	TreeNode n = new TreeNode (array[middle]);
	n.left = addtoTree(array, start, middle -1);
	n.right = addtoTree(array, middle +1 , end);
	return n;
}