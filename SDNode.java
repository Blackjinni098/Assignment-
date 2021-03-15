public class SDNode {

	public int info;

	public SDNode next;
	public SDNode previous;

	public SDNode(int info) {

		this.info = info;

		this.next = null;
		this.previous = null;

	}

	//

	public SDNode(int info, SDNode next, SDNode previous) {

		this.info = info;

		this.next = next;
		this.previous = previous;

	}

}
