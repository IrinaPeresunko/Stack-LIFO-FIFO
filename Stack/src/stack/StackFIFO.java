package stack;

import java.util.Arrays;

public class StackFIFO {
	private static int countOfElements;
	private Node first;
	private Node last;
	private class Node{
		private Object item;
		private Node next;
	}
	public StackFIFO(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void push(Object item){
		 Node x = new Node();
	     x.item = item;
	    
	     if (isEmpty()) {
	    	 first = x;
	    	 last = x; 
	    }
	     else {
	    	 last.next = x;
	    	 last = x;
	    }
		countOfElements++;
	}
	public Object pop(){
		if(isEmpty()) throw new RuntimeException("Stack underflow");
		Object item=first.item;
		first=first.next;
		countOfElements--;
		return item;
	}
	public int size(){
		return countOfElements;
	}
	public void displayStack(){
		int length=size();
		Integer[] tempStack=new Integer[length];
		int k=0;
		while(!isEmpty() && k<length){
			tempStack[k]=(Integer) pop();
			k++;
		}
		System.out.println(Arrays.toString(tempStack));
			
		k=0;
		while(k<length){
			push(tempStack[k]);
			k++;
		}
	}
}
