package MB;

public class List {
	
	private Node head;
	private Node tail;
	private int size;
	
	public List() {
		
		this.head = null;
		this.tail = null;
		this.size = 0;
		
	}
	
	protected void addBeginning(Consumer c) {
		
		Node tmp = new Node();
		tmp.setData(c);
		
		if(this.head == null) {
			this.head = tmp;
			this.tail = tmp;
			
		}else {
			tmp.setNext(this.head);
			this.head = tmp;
			
		}
		this.size++;
		
	}
	
	protected void addFinal(Consumer c) {
		
		Node tmp = new Node();
		tmp.setData(c);
		
		if(this.head == null) {
			this.head = tmp;
			this.tail = tmp;
			
		}else {
			this.tail.setNext(tmp);
			this.tail = tmp;
			
		}
		this.size++;
		
	}
	
	protected void add(Consumer c, int idx) {
		
		if(idx >= this.size) {
			this.addFinal(c);
			
		}else {
			Node tmp = new Node();
			tmp.setData(c);
			
			if(idx == 0) {
				tmp.setNext(this.head.getNext());
				this.head = tmp;
				
			}else {
				Node aux = this.head;
				for(int i = 1; i < (idx - 1); i++) {
					aux = aux.getNext();
					
				}
				tmp.setNext(aux.getNext().getNext());
				aux.setNext(tmp);
				
			}
			
		}
		
	}
	
	protected int getSize() {
		
		return this.size;
		
	}
	
	protected Node getHead() {
		
		return this.head;
		
	}
	
	protected Consumer getData() {
		
		Node aux = this.head;
		return aux.getData();
		
	}
	
	@Override
	public String toString() {
		
		if(this.head == null)	return "[empty]";
		
		String str = "[";
		Node aux = this.head;
		do {
			str += aux.toString();
			aux = aux.getNext();
			str += (aux != null ? ", " : "");
			
		}while(aux != null);
		
		return str + "]";
		
	}
	
}

