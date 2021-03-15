public class DoublyLinked {

	private SDNode head; // head node

	private SDNode tail; // tail node

	public DoublyLinked() {

		this.head = null;

		this.tail = null;

	}

	// add to head

	public void addToHead(int el) {

		// write your implementation here

		SDNode node = new SDNode(el, this.head, head);

		this.head = node;

		if (this.tail == null)
			this.tail = this.head;
		
	}

	// add to tail

	public void addToTail(int el) {

		// write your implementation here

		if (!isEmpty()) {

			this.tail.next = new SDNode(el, null, tail);

			this.tail = this.tail.next;
			

		}

		else
			this.head = this.tail = new SDNode(el, null, tail);

	}

	// remove from head

	public int removeFromHead() {

		int info = this.head.info;

		if (this.head == this.tail)
			this.head = this.tail = null;

		else
			this.head = this.head.next;

		return info;

	}

	// remove from tail

	public int removeFromTail() {

		int info = this.tail.info;

		if (this.head == this.tail)
			this.head = this.tail = null;

		else {

			this.tail.previous=null;
		}

		return info;

	}

	// remove from anywhere

	public int remove(int info) {

		if (!this.isEmpty()) {

			if (this.head == this.tail && info == this.head.info)
				this.head = this.tail = null;

			else if (info == this.head.info)
				this.head = this.head.next;

			else {

				SDNode pred = this.head;

				SDNode temp = this.head.next;

				for (; temp != null && temp.info != info; pred = pred.next, temp = temp.next)
					;

				if (temp != null) {

					pred.next = temp.next;

					if (temp == this.tail)
						this.tail = pred;
					
				}

			}

			return info;

		}

		return -1;

	}

	// search node

	public boolean search(int info) {

		SDNode tmp = this.head;

		for (; tmp != null && tmp.info != info; tmp = tmp.next)
			;

		return tmp != null;

	}

	// print list

	public void printList() {

		for (SDNode temp = this.head; temp != null; temp = temp.next)

			System.out.println(temp.info);

	}

	//

	public boolean isEmpty() {

		return this.head == null;

	}

	public int getHead() {

		return this.head.info;

	}

	public int getTail() {

		return this.tail.info;

	}

}
