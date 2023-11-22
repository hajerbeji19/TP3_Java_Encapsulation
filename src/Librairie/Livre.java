package Librairie;

public class Livre {
	private String titre,auteur;
	private int nbPages;
	public static int nbLivres = 0;
	//Constructeur
	public Livre() {
		titre="";
		auteur="";
		nbPages=0;
		nbLivres++;
	}
	public Livre(String unAuteur,String unTitre) {
		titre = unTitre;
		auteur = unAuteur;
		nbLivres++;
	}
	public Livre(String unAuteur,String unTitre,int nbrPages) {
		titre = unTitre;
		auteur = unAuteur;
		nbPages=nbrPages;
		nbLivres++;
	}
	
	//Accesseur
	public String getAuteur() {
		return auteur;
	}
	public String getTitre() {
		return titre;
	}
	public int getNbPages() {
		return nbPages;
	}
	public int getNbLivres() {
		return nbLivres;
	}
	
	//Modificateur
	public void setNbPages(int nbPages) {
		if(nbPages>0) {
			this.nbPages = nbPages;
		}
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur; 
	}
	public void setTitre(String titre) {
		this.titre = titre; 
	}
	//Méthode toString()
	@Override
	public String toString() {
		return "Description de Livre : Titre-"+titre+"; auteur-"+auteur+"; nbpages-"+nbPages;
	}
	//Méthode Afficher()
	public void afficher(String auteur, String titre, int nbPages) {
		System.out.println(toString());
	}
	//Méthode equals()
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null ||getClass()!=obj.getClass()) {
			return false;
		}
		Livre other = (Livre) obj;
		return this.titre==other.titre && this.auteur==other.auteur && this.nbPages==other.nbPages;
	}
}

