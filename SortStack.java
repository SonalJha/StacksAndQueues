import java.util.Stack;

public class SortStack {

	public static <Ineteger> void main(String[] args) {
		Stack<Integer> abc = new Stack<Integer>();
		abc.push(4);
		abc.push(2);
		abc.push(524);
		abc.push(5);
		abc.push(1);
		abc.push(9);
		Stack<Integer> r = sort(abc);
		
		while(!r.isEmpty())
		System.out.println(r.pop());
	}
	
	//Complexity is O(n^2)

	private static Stack<Integer> sort(Stack<Integer> s) {
		// it is like insertion sort
		// we identify the position we want to put the new element and then put it there
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()) {
			int temp = s.pop();
			// if r.peek has value greater to temp, then it is a perfect place to insert temp
			// as we want biggest element on top
			// r will always be sorted for us
			while(!r.isEmpty() && r.peek()>temp) {
				s.push(r.pop());
			}
			r.push(temp);
		}
		
		return r;
	}

}
