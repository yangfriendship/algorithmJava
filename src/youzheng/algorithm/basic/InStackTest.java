package youzheng.algorithm.basic;
//import DataStructure.InStack;

public class InStackTest {

	public static void main(String[] args) {
		
		InStack stack = new InStack(10);

		stack.push(1);
		stack.dump();
		stack.push(3);
		stack.push(4);
		stack.dump();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.dump();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.dump();

		
	}
	
}
