//two pointers, p2 move n-1 first, then p1,p2 move together

public static void nthToLast (LinkedListNode head, int n){
	LinkedListNode p1 = head;
	LinkedListNode p2 = head;
	
	for(int i =0; i< n-1;i++){
		if (p1 == null)
			return null;
		p1 = p1.next;	
	}
	
	while(!p1=null){
		p1=p1.next;
		p2=p2.next;
	}
	
	return p2;
}
