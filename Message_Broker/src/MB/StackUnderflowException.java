package MB;

public class StackUnderflowException extends Exception {

	public StackUnderflowException() {

		super("Stack Underflow Exception - n�o � poss�vel acessar um elemento de uma fila vazia");

	}

}
