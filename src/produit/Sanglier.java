package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom;
	private Unite unite;
	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public void decrireProduit() {
		System.out.println(this.nom + " de " + this.poids + " " + this.unite + " chasse par " + this.unite.toString());
	}
}
