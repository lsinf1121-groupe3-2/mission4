package dialog;

import java.util.Iterator;
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
	private int maxOption = 3;
	
	public Dialog (Searcher s) {
		this.searcher = s;
	}
	
	/**
	 * Interagit avec l'utilisateur et lui permet de rechercher apr�s un dictionnaire
	 * @pre la variable dico est initialis�e
	 */
	public void start() {
		boolean finished = false;
		String searchQuery;
		int option = -1;
		Iterator<Journal> iterator = null;
		Scanner in = new Scanner(System.in);
		while (!finished) {
			iterator = null;
			System.out.println("Search by:");
			System.out.println("1. Title");
			System.out.println("2. Rank");
			System.out.println("3. ForName2");
			
			System.out.println("0. Exit");
			System.out.println("Enter the number that match the option search you want : ");
			option = in.nextInt();
			in.nextLine();
			if(option > 0 && option <= maxOption){
				System.out.println("Enter your search : ");
				searchQuery = in.nextLine();
				if (searchQuery.isEmpty()) {
					System.out.println("Retry and enter something");
				} else {
					switch (option) {
					case 1:
						iterator = searcher.searchByTitle(searchQuery);
						break;
					case 2:
						iterator = searcher.searchByRank(searchQuery);
						break;
					case 3:
						iterator = searcher.searchByForName2n(searchQuery);
						break;
					default:
						break;
					}
					if(iterator != null){
						while(iterator.hasNext()){
							System.out.println(iterator.next().toString());
						}
					}
				}
			}
			else if(option == 0){
				//Exit
				finished = true;
			}
			else{
				System.out.println("Incorrect option!");
			}
		}
		in.close();
	}
	
}
