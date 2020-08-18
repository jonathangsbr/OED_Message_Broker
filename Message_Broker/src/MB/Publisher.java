package MB;

public class Publisher {
	
	Exchange e = new Exchange();
	
	public void sendMessage(String message, String code) {
		
		e.setMessage(message, code);
		
	}

}
