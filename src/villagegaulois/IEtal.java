package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal<T extends Produit> {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	T getProduit();

}