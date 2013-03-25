public static Node findNode (Node root, int value){
	if(root.getValue()==value)
		return root;
	if(root.getValue() > value)
		return findNode(root.getLeft(),value);
	if(root.getValue() < value)
		return findNode(root.getRight(),value);
}
