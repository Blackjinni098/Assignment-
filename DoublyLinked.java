public class DoublyLinked {

	private DLLNode head; // head node

	private DLLNode tail; // tail node

	public DoublyLinked() {

		this.head = null;

		this.tail = null;

	}

	// add to head

	public void addToHead(int el) {

		
		DLLNode y = new DLLNode(el, this.head, head);

		this.head = y;

		if (this.tail == null)
			this.tail = this.head;
		this.head.previous=null;
		
	}

	// add to tail

	public void addToTail(int el) {

		
		if(!isEmpty()){ 


			this.tail.next = new DLLNode(el,null, tail);


			this.tail = this.tail.next;


			}


			else this.head=this.tail= new DLLNode(el,null, tail);

	}

	// remove from head

	public int removeFromHead() {

		int info = this.head.info;

		if (this.head == this.tail)
			this.head = this.tail = null;

		else
			this.head=this.head.next;
		this.head.previous=null;

		return info;

	}

	// remove from tail

	public int removeFromTail() {

		DLLNode tmp= this.head;


		for(;tmp.next!=this.tail;tmp=tmp.next);


		this.tail = tmp;


		this.tail.next = null;


		return 0;

	}

	// remove from anywhere

	public int remove(int info) {

		if (!this.isEmpty()) {

			if (this.head == this.tail && info == this.head.info)
				this.head = this.tail = null;

			else if (info == this.head.info)
				this.head = this.head.next;

			else {

				DLLNode pred = this.head;


				DLLNode tmp = this.head.next;


				for(;tmp!=null&&tmp.info!=info;pred=pred.next,tmp=tmp.next);


				if(tmp!=null){


				pred.next = tmp.next;


				if(tmp==this.tail) this.tail=pred;


				}


				}


				
		

			}
		return info;

			

	}

	// search node

	public boolean search(int info) {

		DLLNode tmp = this.head;

		for (; tmp != null && tmp.info != info; tmp = tmp.next)
			;

		return tmp != null;

	}

	// print list

	public void printList() {

		for (DLLNode temp = this.head; temp != null; temp = temp.next)

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
