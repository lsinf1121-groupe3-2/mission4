package dialog;

import java.util.Scanner;

import business.Journal;
import business.Searcher;
import dictionary.JournalsDictionary;

/**
 * 
 * @author Mission 3 + Tanguy
 *
 */
public class Dialog {
	private Searcher searcher;
	
	public Dialog (Searcher s) {
		this.searcher = s;
	}
	
	/**
	 * Interagit avec l'utilisateur et lui permet de rechercher après un dictionnaire
	 * @pre la variable dico est initialisée
	 */
	public void start() {
		boolean finished = false;
		String s;
		Scanner in = new Scanner(System.in);
		while (!finished) {
			System.out.println("Enter name of journal. Press enter without writing anything to exit");
			s = in.nextLine();
			if (s.isEmpty()) {
				finished = true;
			} else {
				Journal j = search(s);
				if (j == null) {
					System.out.println("The title you entered doesn't match a Journal from this database");
				} else {
					System.out.println(j.toString());
				}
			}
		}
		in.close();
	}
	
}
