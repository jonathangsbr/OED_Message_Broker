package MB;

public class Exchange {	
	
	protected void setMessage(String msg, String cod) {
		
		String message = msg;
		String code = cod.toUpperCase();
		Node n = ConsumerList.l.getHead();
		
		do {
			
			String[] codeConsumer = n.getData().getCode();
			
			for(int i = 0; i < codeConsumer.length; i++) {			
				if(codeConsumer[i] == null) {}
				else if(code.equals(codeConsumer[i])) {
					n.getData().cq.enqueue(message);
							
				}			
			}
			
			if(code.equals(new String("ALL"))) {
				n.getData().cq.enqueue(message);
				
			}
			n = n.getNext();
			
		}while(n != null);
		
	}

}
