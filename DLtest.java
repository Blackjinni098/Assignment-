public class DLtest {

	public static void main(String[] args) {

		DoublyLinked linkedList = new DoublyLinked();

		System.out.println(linkedList.isEmpty());

		linkedList.addToTail(1);

		linkedList.printList();

		System.out.println(linkedList.isEmpty());

		linkedList.printList();

		linkedList.addToTail(3);

		linkedList.addToHead(5);

		System.out.println("Before deleting ");

		linkedList.printList();

		System.out.println("Deleted node contains info of "+ linkedList.removeFromHead());

		System.out.println("After deleting the head");

		linkedList.printList();

		System.out.println("Deleted node contains info of "+ linkedList.remove(3));

		System.out.println("After deleting the tail");

		linkedList.printList();

		System.out.println(linkedList.search(5));

		System.out.println(linkedList.search(3));
		linkedList.printList();

	}

}
