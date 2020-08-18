package MB;

public class Node {
	
	private Consumer data;
	private Node next;
	
	public void setData(Consumer data) {
		
		this.data = data;
		
	}
	
	protected Consumer getData() {
		
		return this.data;
		
	}
	
	protected void setNext(Node next) {
		
		this.next = next;
		
	}
	
	protected Node getNext() {
		
		return this.next;
		
	}
	
	@Override
	public String toString() {
		
		String str = "";
		String[] aux = this.data.getCode();
		
		for(int i = 0; i < aux.length; i++) {
			str += (i < aux.length-1) ? (aux[i] + ", ") : aux[i];
			
		}
		return "<" + str + ">";
		
	}

}
