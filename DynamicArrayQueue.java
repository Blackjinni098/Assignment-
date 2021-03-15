import java.util.Iterator;
 
public class DynamicArrayQueue<T> implements Queue<T> {
 
   public  T[] arr;
    private int head;
    private int tail;
     
    private final int intialSize = 3; 
    private final int increasefactor = 2; 
    private final int decreasefactor = 4; 
     
    @SuppressWarnings("unchecked")
	public DynamicArrayQueue() {
        this.arr = (T[])new Object[intialSize];
        this.head = -1;
        this.tail = -1;
    }
     
   
    public void enqueue(T t) {
        if(tail == arr.length-1){
            if(size() >= (this.arr.length*3)/4){
               System.out.println("adding :");reducedArray(increasefactor*this.arr.length);
            }else{
                resetQueueOnFull();
            }
        }
        arr[++tail] = t;
    }
     
    public T dequeue() {
        if((tail-head) < 1){
            resetQueueOnEmpty();
        }else{
            T t = arr[++head];
            arr[head] = null;
            if(size() < this.arr.length/decreasefactor && this.arr.length > intialSize){
               reducedArray(this.arr.length/increasefactor);
            }
            return t;
        }
        return null;
    }
     

    public T peek() {
        if((tail-head) < 1){
            resetQueueOnEmpty();
        }else{
            return arr[head+1];
        }
        return null;
    }
     
   
    public boolean isEmpty() {
        return tail-head<1;
    }
 
    
    public int size() {
        return tail-head;
    }
     
    
    public Iterator<T> iterator() {
        return new QueueIterator<T>(arr,head,tail);
    }
     
    private void resetQueueOnFull(){
        if(!(head == -1 && tail == arr.length-1)){
            int i = 0;
            for(i=head+1; i<=tail;i++){
                arr[i-(head+1)] = arr[i];
            }
            tail = tail-(head+1);
            head = -1;
        }
    }
     
    private void resetQueueOnEmpty(){
        this.head = -1;
        this.tail = -1;
    }
     
    private void reducedArray(int size){
        @SuppressWarnings("unchecked")
		T[] newArray = (T[])new Object[size];
        int count = head + 1;
        int i = 0;
        while(count <= tail){
            newArray[i] = this.arr[count];
            i++;
            count++;
        }
        this.arr = newArray;
        tail = tail-(head+1);
        head = -1;
    }
     
    @SuppressWarnings("hiding")
	private class QueueIterator<T> implements Iterator<T>{
 
        private T[] arr;
        private int head;
        private int tail;
         
        public QueueIterator(T[] arr, int head, int tail) {
            super();
            this.head = head;
            this.tail = tail;
            this.arr = arr;
        }
 
        
        public boolean hasNext() {
            return tail-head>=1;
        }
 
      
        public T next() {
            if((tail-head) < 1){
                System.out.println("Queue is empty");
            }else{
                return arr[++head];
            }
            return null;
        }       
        
    }

	public void printQueue()
	{
		for (T x : arr )
			System.out.println(x);
		
	}
}