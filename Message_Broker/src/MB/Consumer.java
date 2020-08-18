package MB;

public class Consumer {

	protected Queue cq = new Queue();
	private String[] code = new String[2];
	
	public Consumer(String code1) {
		
		this.code[0] = code1.toUpperCase();
		
	}
	
	public Consumer(String code1, String code2) {
		
		this.code[0] = code1.toUpperCase();
		this.code[1] = code2.toUpperCase();
		
	}
	
	
	public void receptMessage() {
		
		System.out.println(cq.dequeue());
		
	}
	
	public void showMessage() {
		
		System.out.println(cq.toString());
		
	}
	
	protected String[] getCode() {
		
		return code;
		
	}
	
	protected int getSizeCode() {
		
		return this.code.length;
		
	}
	
}
