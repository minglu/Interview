public static boolean findCircular (LinkedListNode head){
	LinkedListNode n1 = head;
	LinkedListNode n2 = head;
	
	while (!n2.next=null){
		n1=n1.next;
		n2=n2.next.next;
		if (n1==n2){
			return true;
		}
	}
	return false;
}
