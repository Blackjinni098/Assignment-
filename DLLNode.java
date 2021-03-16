public class DLLNode {

	public int info;

	public DLLNode next;
	public DLLNode previous;

	public DLLNode(int info) {

		this.info = info;

		this.next = null;
		this.previous = null;

	}

	//

	public DLLNode(int info, DLLNode next, DLLNode previous) {

		this.info = info;

		this.next = next;
		this.previous = previous;

	}

}
