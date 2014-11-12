package Controller;

import interpreter.Interpreter;
import interpreter.exception.IncorrectLineException;

import java.io.*;

import dialog.Dialog;
import dictionary.JournalsDictionary;
import business.Journal;

/**
 *
 * @author Tanguy
 */
public class Controller {

    Interpreter csvInterpereter;
    String commandFile = "Journals.csv";
    BufferedReader br;
    JournalsDictionary catalog;

    /**
     * @pre --
     * @post l'objet est dans un �tat coh�rent et pr�t � �tre utilis�
     */
    public Controller() {
        this.csvInterpereter = new Interpreter();
    }
    
    /**
     * @pre la variable commandFile est initialis�e
     * @post le fichier renseign� dans la variable commandFile est ouvert et pr�t � �tre lu; la variable br est initialis�e.
     * Si le fichier n'existe pas, le programme se termine avec le code d'erreur -2.
     */
    private void initializeReader() {
		try {
			InputStream ips = new FileInputStream(commandFile);
			InputStreamReader ipsr = new InputStreamReader(ips);
			this.br = new BufferedReader(ipsr);
		} catch (FileNotFoundException e1) {
			System.out.println("Commands file not found. please check the path.");
			System.exit(-2);
		}
    }
    
    /**
     * @pre les variables bw et br sont initialis�es.
     * @post Les fichiers ouverts par le programme sont ferm�s.
     * Le programme se termine avec le code d'erreur -4 si il ne parvient pas � fermer correctement les fichiers.
     */
    private void closeFiles() {
    	try {
			br.close();
		} catch (IOException e) {
			System.out.println("Error while closing files.");
			System.exit(-4);
		}
    }
    
    /**
     * @pre Les variables bw et br sont initialis�es.
     * @post Le fichier d'entr�e � �t� enti�rement lu et interpr�t�.
     * Les journaux ont �t� ajout�s au dictionnaire
     */
    private void interpreteFile() {
    	String commandLigne;
		try {
			commandLigne = br.readLine(); //lit la premi�re ligne puis passe � la suivante
			while ((commandLigne = br.readLine())!=null) {
				if (!commandLigne.equalsIgnoreCase(""))
				{
					 Journal result = csvInterpereter.interprete(commandLigne); 
					 if (result!=null)
					 {
						 catalog.put(result.getTitle(), result);
					 }
				}
			}
		} catch (IOException e) {
			System.err.println("Error while I/O operations");
			System.exit(-5);
		} catch (IncorrectLineException e) {
			System.err.println("Incorrect Line");
		}
    }

    /**
     * @pre --
     * @post La logique m�tier permettant de lire le fichier d'entr�e contenant les commandes PostScript a �t� ex�cut�e.
     * Le r�sultat a �t� �crit dans le fichier de sortie.
     * Les fichiers ont �t� ferm�s correctement.
     */
    public void start(String[] args) {
    	catalog = new JournalsDictionary();
    	this.initializeReader();
		this.interpreteFile();
		Dialog userDialog = new Dialog (catalog);
		userDialog.start();
		this.closeFiles();
    }

    /**
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Controller applicationController = new Controller();
        applicationController.start(args);
    }

}
