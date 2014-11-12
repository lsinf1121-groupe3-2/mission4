package interpreter.exception;

public class IncorrectLineException extends Exception {
	
    /**
     * Crée une nouvelle instance de <code>ParentExpectedException</code> sans message détaillé.
     */
	public IncorrectLineException() {
	
	}
	
    /**
     * Construit une instance de <code>IncorrectLineException</code> avec un
     * message détaillé spécifique.
     *
     * @param msg le message détaillé.
     */
    public IncorrectLineException(String msg) {
        super(msg);
    }
}