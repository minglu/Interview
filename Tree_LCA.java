//FOR BST, root > both, go left, root < both, go right, otherwise return root

public static Node findLCA (Node root, int val1, int val2){
	while(!root=null){
		if(root.getValue()> val1 && root.getValue()>val2){
			root = root.getLeft();
		if(root.getValue() <val1 && root.getValue()<val2){
			root = root.getRight();
		else
			return root;
}
