package interpreter.exception;

public class IncorrectLineException extends Exception{
	
    /**
     * Creates a new instance of <code>ParentExpectedException</code> without detail
     * message.
     */
	public IncorrectLineException() {
	}

    /**
     * Constructs an instance of <code>IncorrectLineException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IncorrectLineException(String msg) {
        super(msg);
    }
}