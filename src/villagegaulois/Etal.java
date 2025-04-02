package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<T extends Produit> implements IEtal<T> {
	private Gaulois vendeur;
	private T produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

	@Override
	public T getProduit() {
		return this.produit;
	}

}
