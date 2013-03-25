//with additional memory, we just use HashTable to track the duplicates.

public static void removeDups (LinkedListNode n) {
	HashTable table = new HashTable();
	LinkedListNode Previous;
	
	while(!n=null){
		if(table.contains(n.data))
			previous.next = n.next;
		else{
			table.put(n.data, true);
			previous = n;
		}		
		n = n.next;		
	}
}

//without additional memory, we use two pointers current and runner to compare all prior node with current.

public static void removeDups (LinkedListNode head) {
	LinkedListNode current = head.next;
	LinkedListNode previous = head;
	
	while (current!=null){
		LinkedListNode runner = head;
		while (runner!= current){
			if (runner.data == current.data){
				LinkedListNode temp = current.next;//remove current
				previous.next = temp;
				current = temp;
				break;//multi-duplicates were removed
			}
			runner = runner.next
		}
	
		if(current==runner){
			previous = current;
			current = current.next;
		}
	}
}