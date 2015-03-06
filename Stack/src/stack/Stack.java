package stack;

public class Stack {

	public static void main(String[] args) {
		
		StackLIFO sl=new StackLIFO();
		sl.push(new Integer(1));
		sl.push(new Integer(2));
		sl.push(new Integer(3));
		
		sl.displayStack();
		sl.pop();
		sl.displayStack();

		StackFIFO sf=new StackFIFO();
		sf.push(new Integer(4));
		sf.push(new Integer(5));
		sf.push(new Integer(6));
		
		sf.displayStack();
		sf.pop();
		sf.displayStack();
		
	}

}
