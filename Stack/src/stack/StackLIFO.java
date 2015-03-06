package stack;

import java.util.Arrays;

public class StackLIFO {

	private static int countOfElements;
	private Node first;
	private class Node{
		private Object item;
		private Node next;
	}
	public StackLIFO(){
		first=null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void push(Object item){
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		first.next=oldFirst;
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
		
		k=length-1;
		while(k>=0){
			push(tempStack[k]);
			k--;
		}
	}
}
