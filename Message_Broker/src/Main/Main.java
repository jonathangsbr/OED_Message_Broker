package Main;

import MB.Consumer;
import MB.ConsumerList;
import MB.Publisher;

public class Main {
	public static void main(String[] args) {
		
		Publisher p = new Publisher();
		Consumer c1 = new Consumer("mensagem");
		Consumer c2 = new Consumer("mensagem", "propaganda");
		Consumer c3 = new Consumer("propaganda");
		ConsumerList cl = new ConsumerList();
		cl.cadastrar(c1);
		cl.cadastrar(c2);
		cl.cadastrar(c3);
		
		p.sendMessage("teste", "propaganda");
		p.sendMessage("teste1", "all");
		p.sendMessage("teste2", "mensagem");
		
		c1.showMessage();
		c2.showMessage();
		c3.showMessage();
		
		
	}
	
}
