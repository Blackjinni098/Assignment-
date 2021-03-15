import java.util.Iterator;
 
public   class StackDynamicArray<T> implements Stack<T> {
     
    private T[] arr;
    private int counter;
    private final int intialSize = 1; 
    private final int increasefactor = 2; 
    private final int decreasefactor = 4; 
     
    @SuppressWarnings("unchecked")
	public StackDynamicArray() {
        this.arr = (T[])new Object[intialSize];
    }
     
    // push
    public void push(T t) {
        if(counter == (this.arr.length*3)/4){
            reducedArray(increasefactor*this.arr.length);
        }
        arr[counter++] = t;
    }
     
   //  pop
    public T pop() {
        if(counter == 0){
            System.out.println("Stack is empty");
        }else{
            if(counter < this.arr.length/decreasefactor && this.arr.length > intialSize){
                reducedArray(this.arr.length/increasefactor);
            }
            T temp = arr[--counter];
            arr[counter] = null;
            return temp;
        }
        return null;
    }
     
         
    private void reducedArray(int size){
        @SuppressWarnings("unchecked")
		T[] newArray = (T[])new Object[size];
        for(int i=0;i<counter;i++){
            newArray[i] = this.arr[i];
        }
        this.arr = newArray;
    }
 
    // is empty
    public boolean isEmpty() {
        return counter == 0;
    }
 
    
    public int size() {
        return counter;
    }
 
    // iterator for pop and push order
    public Iterator<T> iterator() {
        return new StackIterator<T>(counter,arr);
    }
     
    @SuppressWarnings("hiding")
	private class StackIterator<T> implements Iterator<T>{
 
        private int counter;
        private T[] arr;
         
        public StackIterator(int counter,T[] arr) {
            super();
            this.counter = counter;
            this.arr = arr;
        }
 
        
        public boolean hasNext() {
            return counter > 0;
        }
 
       
        public T next() {
            if(counter == 0){
                System.out.println("Stack is empty");
            }else{
                return arr[--counter];
            }
            return null;
        }       
    }
    public void printStack()
	{
		for (T x : arr )
			System.out.println(x);
	}

}