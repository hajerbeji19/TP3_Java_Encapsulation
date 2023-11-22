package TestLivres;
import java.util.Scanner;

import Librairie.Livre;

public class TestLivres {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//--------------------------création des instances --------------------------
		Livre livre1 = new Livre("Bruce Eckel","Thinking in Java");
		Livre livre2 = new Livre("Claude Delannoy","Programmer en Java");
		//--------------------------fin instances --------------------------
		
		//--------------------------Affichage des auteurs des livres--------------------------
		System.out.println("L'auteur de livre1 est "+livre1.getAuteur());
		System.out.println("L'auteur de livre2 est "+livre2.getAuteur());
		//--------------------------Fin Affichage des auteurs des livres--------------------------

		//----------Entrer les nombres des pages des livres et faire la somme ---
		System.out.print("Donner le nombre des pages de livre1 : ");
		int nbpageslivre1= sc.nextInt();
		livre1.setNbPages(nbpageslivre1);
		System.out.print("Donner le nombre des pages de livre2 : ");
		int nbpageslivre2= sc.nextInt();
		livre2.setNbPages(nbpageslivre2);
		int somme = livre1.getNbPages()+livre2.getNbPages();
		System.out.println("La somme des pages de ces 2 livres est égale à "+somme);
		//--------------------------Fin somme--------------------------
		
		//--------------------------Appel de méthode afficher()--------------------------
		livre1.afficher(livre1.getTitre(),livre1.getAuteur(),livre1.getNbPages());
		livre2.afficher(livre2.getTitre(),livre2.getAuteur(),livre2.getNbPages());
		//--------------------------Fin afficher()--------------------------
				
		System.out.println(livre1); //question 9
		/** Question 12 + 13: 
		 * Lorsqu'on commente le constructeur et on créer un nouveau livre: Livre livre2=new Livre()
		 * une erreur se produite .Alors on déduit que le constructeur est nécessaire pour créer un 
		 * nouveau livre .
		 */
		
		Livre livre3=new Livre();
		livre3.setAuteur("The Blah Story de Nigel Tomm");
		livre3.setTitre("Nigel Tomm");
		livre3.setNbPages(3248);
		Livre livre4=new Livre("Albert Camus","L'Étranger",123);
		Livre livre5=new Livre("Antoine de Saint-Exupéry","Le Petit Prince",96);
		Livre livre6=new Livre("Antoine de Saint-Exupéry","Le Petit Prince",96);
		System.out.println(livre5==livre6); //cette ligne m'affiche false alors on remarque que l'opération == compare l'espace mémoire
		System.out.println(livre5.equals(livre6));
		//question 17: utiliser méthode equals
		Livre livre7=new Livre("Antoine de Saint-Exupéry","Le Petit Prince",96);
		System.out.println("livre1=livre2?? "+livre1.equals(livre2));
		System.out.println("livre1=livre2?? "+livre4.equals(livre5));
		System.out.println("livre1=livre2?? "+livre5.equals(livre7));
		
		//Obtenir nombre de livre
		int nbLivres=livre1.getNbLivres();
		System.out.println("Le nombre de livres crées est "+nbLivres);
		sc.close();//fermer le scanner
	}
}
