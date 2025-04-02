package produit;

public class Poisson extends Produit {
	private String nom;
	private Unite unite;
	private String datePeche;

	public Poisson(String datePeche) {
		super("Poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public void decrireProduit() {
		System.out.println(this.nom + " peches " + this.datePeche);
	}
}
