package MB;

public class StackOverflowException extends Exception {

	public StackOverflowException() {

		super("Stack Overflow Exception - n�o � poss�vel inserir um novo elemento em uma fila cheia");

	}

}