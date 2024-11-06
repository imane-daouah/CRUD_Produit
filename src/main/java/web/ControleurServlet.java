package web;

import java.io.IOException;
import java.util.List;

import dao.IProduitDao;
import dao.ProduitDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.entities.Produit;

@WebServlet(name="cs",urlPatterns= {"*.php"})
public class ControleurServlet extends HttpServlet{

	private IProduitDao metier;

	@Override
	public void init() throws ServletException {
		metier = new ProduitDaoImp();
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String path = request.getServletPath();
		if(path.equals("/index.php")) {
			request.getRequestDispatcher("produits.jsp").forward(request, response);

		}
		else if(path.equals("/chercher.php")) {
			String motCle = request.getParameter("motCle");
			ProduitModel model = new ProduitModel();
			model.setMotCle(motCle);
			List<Produit> produits = metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);
			request.setAttribute("model", model);

			request.getRequestDispatcher("produits.jsp").forward(request, response);
		}
		else if(path.equals("/Saisie.php")){
            Produit produit = new Produit();
            request.setAttribute("produit",produit);
            request.getRequestDispatcher("SaisieProduit.jsp").forward(request,response);
        }
		/*
		 * else
		 * if(path.equals("/SaveProduit.php")&&(request.getMethod().equals("POST"))){
		 * String designation = request.getParameter("designation"); double prix =
		 * Double.parseDouble(request.getParameter("prix")); int quantite =
		 * Integer.parseInt(request.getParameter("quantite")); Produit p =
		 * metier.save(new Produit(designation,prix,quantite));
		 * request.setAttribute("produitSave",p);
		 * request.getRequestDispatcher("Confirmation.jsp").forward(request,response); }
		 */
		 else if(path.equals("/Supprime.php")){
	            Long id = Long.parseLong(request.getParameter("id"));
	            metier.deleteProduit(id);
	            response.sendRedirect("chercher.php?motCle=");
	        }
		 else if(path.equals("/Edit.php")){
	            Long id = Long.parseLong(request.getParameter("id"));
	            Produit p= metier.getProduit(id);
	            request.setAttribute("produit", p);
	      	    request.getRequestDispatcher("EditProduit.jsp").forward(request,response);

	        }
		 
		else {
			response.sendError(HttpServletResponse.SC_NOT_FOUND);

	}
	

	}
	
	  @Override protected void doPost(HttpServletRequest request,
	  HttpServletResponse response) throws ServletException, IOException { String
	  path =request.getServletPath();
	  if(path.equals("/SaveProduit.php")){ String
	  designation = request.getParameter("designation");
	  double prix = Double.parseDouble(request.getParameter("prix"));
	  int quantite = Integer.parseInt(request.getParameter("quantite")); Produit produitSave =
	  metier.save(new Produit(designation,prix,quantite));
	  request.setAttribute("produitSave",produitSave);
	  request.getRequestDispatcher("Confirmation.jsp").forward(request,response);
	  }
	  
	  else if(path.equals("/EditProduit.php")){ 
		  Long id = Long.parseLong(request.getParameter("id"));
		  String designation = request.getParameter("designation");
	      double prix = Double.parseDouble(request.getParameter("prix"));
	      int quantite = Integer.parseInt(request.getParameter("quantite"));
	      
	      Produit p = new Produit(designation,prix,quantite);
	      p.setId(id);
	      metier.EditProduit(p);
	      request.setAttribute("produit", p);  
	      request.getRequestDispatcher("ConfirmationEdit.jsp").forward(request,response);
	     
	 }
	  
	  
	  } }
	 















