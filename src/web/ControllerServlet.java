package web;

import javax.accessibility.*;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IProduitDao;
import dao.ProduitDaoImpl;
import metier.entities.Produit;

//@WebServlet(name = "controller", urlPatterns = "/produits")
public class ControllerServlet extends HttpServlet{
       private IProduitDao metier;
       
       @Override
    public void init() throws ServletException {
    	metier=new ProduitDaoImpl();
    } 
       
      @Override
    protected void doGet(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	String path=request.getServletPath();
    	if(path.equals("/index.do")) {
    		request.getRequestDispatcher("produits.jsp").forward(request, response);
    	}
    	else if(path.equals("/produit.do")) {
    		String motcle=request.getParameter("motcle");
    		ProduitModel model=new ProduitModel();
    		model.setMotcle(motcle);
    		List<Produit> produits= metier.produitsParMC("%"+motcle+"%");
    		model.setProduits(produits);
    		request.setAttribute("model", model);
    		request.getRequestDispatcher("produits.jsp").forward(request, response);
    	}  
    } 
}
