package business;

import java.util.Comparator;
import java.util.Iterator;

import dictionary.BinaryTreeSearch;

/**
 * Fourni les méthodes de recherches 
 * @author Tanguy
 *
 */
public class Searcher {
	BinaryTreeSearch<String, Journal> allJournals;
	BinaryTreeSearch<String, Journal> journalsByForName2;
	BinaryTreeSearch<String, Journal> journalsByRank;
	Comparator<String> comparator;
	
	public Searcher(){
		comparator = new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		};
		allJournals = new BinaryTreeSearch<>(comparator);
		journalsByForName2 = new BinaryTreeSearch<>(comparator);
		journalsByRank = new BinaryTreeSearch<>(comparator);
	}
	
	public void insert(Journal journal){
		//TODO :insert in the 3 trees
		allJournals.put(journal.getTitle(), journal);
		journalsByForName2.put(journal.getFoR2Name(), journal);
		journalsByRank.put(journal.getRank(), journal);
	}
	
	public Iterator<Journal> searchByTitle(String title){
		return allJournals.get(title);
	}
	
	public Iterator<Journal> searchByForName2n(String forName2){
		return journalsByForName2.get(forName2);
	}
	
	public Iterator<Journal> searchByRank(String rank){
		return journalsByRank.get(rank);
	}
	
}
