package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

public class ProduitModel {
	private String motcle;
	private List<Produit> produits=new ArrayList<Produit>();
	public String getMotcle() {
		return motcle;
	}
	public void setMotcle(String motcle) {
		this.motcle = motcle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	 

}
