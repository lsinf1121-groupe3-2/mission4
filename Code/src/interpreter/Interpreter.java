package interpreter;

import interpreter.exception.IncorrectLineException;
import business.Journal;

public class Interpreter {

	/**
	 * 
	 * @param commandLigne
	 * @return le journal ou null si la ligne n'a pas pu etre interprétée
	 * @throws IncorrectLineException 
	 */
	public Journal interprete(String commandLigne) throws IncorrectLineException {
		Journal journal = null;
		if(commandLigne != null && !commandLigne.isEmpty()) {
			String args[] = commandLigne.split(",", -1);
			int extraFields = args.length - 8;
			if(extraFields > 0) {
				//Il y a une ',' à l'intérieur d'un champ.
				//On suppose que cette virgule se trouve dans le champ du titre
				//donc on va fusionner ces champs
				for(int i = 2; i < 2 + extraFields ; i++) {
					args[1] += args[i];
				}
				for(int i = 2; i < 8 ; i++) {
					args[i]=args[i+extraFields];
				}
			}
			if (extraFields < 0) {
				throw new IncorrectLineException();
			}
			else {
				journal = new Journal();
				journal.setRank(args[0]);
				journal.setTitle(args[1]);
				journal.setFoR1(args[2]);
				journal.setFoR1Name(args[3]);
				journal.setFoR2(args[4]);
				journal.setFoR2Name(args[5]);
				journal.setFoR3(args[6]);
				journal.setFoR3Name(args[7]);
				return journal;
			}
		}
		return null;
	}
}
