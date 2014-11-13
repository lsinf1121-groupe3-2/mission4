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
	BinaryTreeSearch<String, Journal> journalsByRank;
	BinaryTreeSearch<String, Journal> journalsByFor1;
	BinaryTreeSearch<String, Journal> journalsByForName1;
	BinaryTreeSearch<String, Journal> journalsByFor2;
	BinaryTreeSearch<String, Journal> journalsByForName2;
	BinaryTreeSearch<String, Journal> journalsByFor3;
	BinaryTreeSearch<String, Journal> journalsByForName3;
	
	Comparator<String> comparator;
	
	public Searcher(){
		comparator = new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		};
		allJournals = new BinaryTreeSearch<>(comparator);
		journalsByRank = new BinaryTreeSearch<>(comparator);
		journalsByFor1  = new BinaryTreeSearch<>(comparator);
		journalsByForName1 = new BinaryTreeSearch<>(comparator);
		journalsByFor2  = new BinaryTreeSearch<>(comparator);
		journalsByForName2 = new BinaryTreeSearch<>(comparator);
		journalsByFor3  = new BinaryTreeSearch<>(comparator);
		journalsByForName3 = new BinaryTreeSearch<>(comparator);
	}
	
	public void insert(Journal journal){
		//TODO :insert in the 3 trees
		allJournals.put(journal.getTitle(), journal);
		journalsByRank.put(journal.getRank(), journal);
		journalsByFor1.put(journal.getFoR1(), journal);
		journalsByForName1.put(journal.getFoR1Name(), journal);
		journalsByFor2.put(journal.getFoR2(), journal);
		journalsByForName2.put(journal.getFoR2Name(), journal);
		journalsByFor3.put(journal.getFoR3(), journal);
		journalsByForName3.put(journal.getFoR3Name(), journal);
	}
	
	public Iterator<Journal> searchByTitle(String title){
		return allJournals.get(title);
	}

	public Iterator<Journal> searchByForName1(String forName1){
		return journalsByForName1.get(forName1);
	}
	
	public Iterator<Journal> searchByForName2(String forName2){
		return journalsByForName2.get(forName2);
	}

	public Iterator<Journal> searchByForName3(String forName3){
		return journalsByForName3.get(forName3);
	}

	public Iterator<Journal> searchByFor1(String arg){
		return journalsByFor1.get(arg);
	}

	public Iterator<Journal> searchByFor2(String arg){
		return journalsByFor2.get(arg);
	}

	public Iterator<Journal> searchByFor3(String arg){
		return journalsByFor3.get(arg);
	}
	
	public Iterator<Journal> searchByRank(String rank){
		return journalsByRank.get(rank);
	}
	
}
