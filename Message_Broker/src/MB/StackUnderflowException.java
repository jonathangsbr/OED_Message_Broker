package MB;

public class StackUnderflowException extends Exception {

	public StackUnderflowException() {

		super("Stack Underflow Exception - não é possível acessar um elemento de uma fila vazia");

	}

}
