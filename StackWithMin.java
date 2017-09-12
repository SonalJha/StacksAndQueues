import java.util.Stack;

public class StackWithMin extends Stack<Integer>{
	/**
	 * 
	 */
	// recommended by eclipse, not serving any purpose for me
	private static final long serialVersionUID = 1L;
	private Stack<Integer> s2;
	
	public StackWithMin(){
		s2 = new Stack<Integer>();
	}
	
	public void push(int value) {
		if(s2.isEmpty()||value<s2.peek()) {
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop() {
		int value = super.pop();
		if(value==s2.peek()) {
			s2.pop();
		}
		return value;
	}
	
	public int min() {
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		return s2.peek();
	}
	
	
	

	public static void main(String[] args) {
		StackWithMin s1 = new StackWithMin();
		s1.push(5);
		s1.push(10);
		s1.push(3);
		s1.push(5);
		s1.push(8);
		s1.push(1);
		
		System.out.println(s1.peek());
		System.out.println(s1.min());
		System.out.println(s1.pop());
		System.out.println(s1.min());
		

	}

}
