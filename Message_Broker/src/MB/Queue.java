package MB;

public class Queue {

	private String arr[] = new String[5];
	private int head;
	private int tail;
	private int size;

	{

		this.head = 0;
		this.tail = 0;
		this.size = 0;

	}

	public void enqueue(String message) /* throws StackOverflowException */ {

		try {
			if (this.size >= this.arr.length) {

				throw new StackOverflowException();

			} else {
				if (this.arr[this.tail] == null && message != null) {
					this.arr[this.tail] = message;
					this.size++;

					if ((this.tail == this.arr.length - 1 && this.head > 0 && this.arr[this.tail] != null)) {
						this.tail = 0;

					} else if (this.tail < this.arr.length - 1) {
						this.tail++;

					}
				}
			}
		} catch (StackOverflowException e) {
			e.printStackTrace();

		}
	}

	public String dequeue() /* throws StackUnderflowException */ {

		try {
			if (size <= 0) {
				throw new StackUnderflowException();

			} else {

				String message = this.arr[this.head];
				if (this.arr[this.head] != null) {
					this.arr[this.head] = null;

					if (this.head == this.arr.length - 1) {
						this.head = 0;

					} else {
						this.head++;

					}
				}
				this.size--;

				if (this.head == this.tail && this.size == 0) {
					this.head = 0;
					this.tail = 0;

				} else if ((this.tail == this.arr.length - 1 && this.head > 0 && this.arr[this.tail] != null)) {
					this.tail = 0;

				}
				return message;
			}
		} catch (StackUnderflowException e) {
			e.printStackTrace();
			return "";

		}
	}

	public int getSize() {

		return this.size;

	}

	@Override
	public String toString() {

		String str = "[";
		int q = this.head;

		for (int i = 0; i < this.size; i++) {

			if (q > this.arr.length - 1) {
				q = 0;

			}

			str += this.arr[q];
			str += (i < this.size - 1) ? ", " : "";
			q++;

		}

		return str + "]";

	}

	public void Print() {

		for (int i = 0; i < this.arr.length; i++) {

			System.out.println("arr[" + i + "] = " + this.arr[i]);

		}

		System.out.println("Head: " + this.head);
		System.out.println("Tail: " + this.tail);
		System.out.println("Size: " + this.size);

	}

}
