import java.util.Stack;

public class QueueUsingStack {
	
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	public QueueUsingStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	
	public void enqueue(int value) {
		s1.push(value);
	}
	
	public int dequeue() {
		if(s2.isEmpty()) {
			// shift elements from s1 to s2
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public boolean isEmpty() {
		if(s2.size()==0 && s1.size()==0)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		
		QueueUsingStack q1 = new QueueUsingStack();
		q1.enqueue(5);
		q1.enqueue(4);
		q1.enqueue(63);
		q1.enqueue(1);
		q1.enqueue(3);
		q1.enqueue(9);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		
		q1.enqueue(1);
		q1.enqueue(3);
		q1.enqueue(9);
		
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());

	}

}
