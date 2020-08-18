package MB;

public class StackOverflowException extends Exception {

	public StackOverflowException() {

		super("Stack Overflow Exception - não é possível inserir um novo elemento em uma fila cheia");

	}

}