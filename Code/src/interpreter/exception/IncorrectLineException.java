package interpreter.exception;

public class IncorrectLineException extends Exception {
	
    /**
     * Cr�e une nouvelle instance de <code>ParentExpectedException</code> sans message d�taill�.
     */
	public IncorrectLineException() {
	
	}
	
    /**
     * Construit une instance de <code>IncorrectLineException</code> avec un
     * message d�taill� sp�cifique.
     *
     * @param msg le message d�taill�.
     */
    public IncorrectLineException(String msg) {
        super(msg);
    }
}