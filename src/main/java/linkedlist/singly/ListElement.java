package linkedlist.singly;

public class ListElement<T> {
	private T data;
	private ListElement<T> next;
	
	public ListElement(T value) {
		this.data = value;
	}
	
	public ListElement<T> next() {
		return this.next;
	}
	
	public T value() {
		return this.data;
	}
	
	public void setValue(T value) {
		this.data = value;
	}
	
	public void setNext(ListElement<T> elem) {
		this.next = elem;
	}
	
	
}
