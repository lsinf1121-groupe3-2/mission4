package business;


public class Journal {
	private String rank;
	private String title;
	private String foR1;
	private String foR1Name;
	private String foR2;
	private String foR2Name;
	private String foR3;
	private String foR3Name;
	/**
	 * @return le rang
	 */
	public String getRank() {
		return rank;
	}
	
	public String toString() {
		return title+": "+rank+", "+foR1Name+"("+foR1+")"+", "+foR2Name +"("+foR2+")"+", "+foR3Name +"("+foR3+")";
	}
	
	
	/**
	 * @param rank le rang à mettre
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * @return le titre
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title le titre à mettre
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return le foR1
	 */
	public String getFoR1() {
		return foR1;
	}
	/**
	 * @param foR1 le foR1 à mettre
	 */
	public void setFoR1(String foR1) {
		this.foR1 = foR1;
	}
	/**
	 * @return le foR1Name
	 */
	public String getFoR1Name() {
		return foR1Name;
	}
	/**
	 * @param foR1Name le foR1Name to set
	 */
	public void setFoR1Name(String foR1Name) {
		this.foR1Name = foR1Name;
	}
	/**
	 * @return le foR2
	 */
	public String getFoR2() {
		return foR2;
	}
	/**
	 * @param foR2 le foR2 à mettre
	 */
	public void setFoR2(String foR2) {
		this.foR2 = foR2;
	}
	/**
	 * @return le foR2name
	 */
	public String getFoR2Name() {
		return foR2Name;
	}
	/**
	 * @param foR2name le foR2name à mettre
	 */
	public void setFoR2Name(String foR2name) {
		this.foR2Name = foR2name;
	}
	/**
	 * @return le foR3
	 */
	public String getFoR3() {
		return foR3;
	}
	/**
	 * @param foR3 le foR3 à mettre
	 */
	public void setFoR3(String foR3) {
		this.foR3 = foR3;
	}
	/**
	 * @return le foR3Name
	 */
	public String getFoR3Name() {
		return foR3Name;
	}
	/**
	 * @param foR3Name le foR3Name à mettre
	 */
	public void setFoR3Name(String foR3Name) {
		this.foR3Name = foR3Name;
	}
	
}

