
public class DSTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String a[]){
StackDynamicArray stack = new StackDynamicArray();
       stack.printStack();
		stack.push(5);
		stack.push(37);
		stack.push(1);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.push(4);
		stack.push(8);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.push(35);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.printStack();
		
		System.out.println(stack.isEmpty());
		}

}
