package dao;



import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl dao =new ProduitDaoImpl();
		Produit p1 =dao.save(new  Produit ("gad-16",100,222));
		Produit p2 =dao.save(new Produit ("djine-17",100,800));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("chercher des produits");
		List<Produit> prods=dao.produitsParMC("%g%");
        for(Produit p :prods) {
        	System.out.println(p.toString());
        }
	}

}
