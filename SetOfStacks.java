import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	
	private int size_per_stack;
	private ArrayList<Stack<Integer>> stacks;
	
	public SetOfStacks(int size){
		size_per_stack = size;
		stacks = new ArrayList<Stack<Integer>>();
	}
	
	public Stack<Integer> getLastStack() {
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int value) {
		Stack<Integer> s = getLastStack();
		if(s==null || s.size()>=size_per_stack) {
			// Create a new stack and add to the array list
			Stack<Integer> abc = new Stack<Integer>();
			abc.push(value);
			stacks.add(abc);
		}
		else {
			s.push(value);
		}
	}
	
	public int pop() {
		Stack<Integer> s = getLastStack();
		int val= Integer.MAX_VALUE;
		if(s!=null) {
			val = s.pop();
			if(s.isEmpty()) {
				stacks.remove(s);
			}
		}
		// if the stack is empty remove it from the list of stacks
		return val;
	}
	
	public int peek(){
		if(getLastStack()==null)
			return Integer.MAX_VALUE;
		return getLastStack().peek();
	}
	
	public boolean isEmpty(){
		if(stacks.size()>0)
			return false;
		return true;
	}
	
	

	public static void main(String[] args) {
		SetOfStacks s1 = new SetOfStacks(2);
		s1.push(5);
		s1.push(10);
		s1.push(3);
		s1.push(5);
		s1.push(8);
		s1.push(1);
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
		System.out.println(s1.isEmpty());
	
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
		

	}

}
