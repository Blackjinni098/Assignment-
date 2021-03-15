
public class DQTest {
	public static void main(String a[]){
		DynamicArrayQueue<Integer> queue = new DynamicArrayQueue<Integer>();
		 queue.printQueue();
			queue.enqueue(5);
			queue.enqueue(37);
			queue.enqueue(1);
			queue.printQueue();
			queue.dequeue();
			queue.printQueue();
			queue.enqueue(4);
			queue.enqueue(8);
			queue.printQueue();
			queue.dequeue();
			queue.dequeue();
			queue.enqueue(35);
			queue.printQueue();
			queue.dequeue();
			queue.printQueue();
			System.out.println(queue.isEmpty());
			}


}
