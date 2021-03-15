public interface Stack<S> extends Iterable<S> {
 
    public void push(S s);
     
    public S pop();
     
    public boolean isEmpty();
     
    public int size();
     
}