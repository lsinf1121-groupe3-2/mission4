package Controller;

/**
 * Le point d'entr�e du programme est ici 
 * @author Tanguy
 *
 */
public class Main {
	/**
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Controller applicationController = new Controller();
        applicationController.start(args);
    }
}
