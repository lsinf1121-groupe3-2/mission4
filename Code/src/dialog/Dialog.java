package dialog;

import java.util.Scanner;

import business.Journal;
import dictionary.JournalsDictionary;

public class Dialog {
	private JournalsDictionary dico;
	
	public Dialog (JournalsDictionary dico) {
		this.dico = dico;
	}
	
	public Journal search(String title) {
		return dico.get(title);
	}
	
	/**
	 * Interagit avec l'utilisateur et lui permet de rechercher apr�s un dictionnaire
	 * @pre la variable dico est initialis�e
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
