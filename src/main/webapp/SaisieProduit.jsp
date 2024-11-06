<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Produits</title>
    <link rel="stylesheet" type="text/css" href="css/styleConfi.css"/>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
   <jsp:include page="header.jsp" />
   <div><p></p></div>
   


    <div class="container col-md-10 col-md-offset-1 ">
        <div class="panel panel-primary">
            <div class="panel-heading">Saisie d'un Produit</div>
            <div class="panel-body">
                <form action="SaveProduit.php" method="post">
                    <label class="form-label">Designation</label>
                    <input class="form-control" type="text" name="designation" value="${produit.getDesignation()}">
                   
                    <label class="form-label">Prix</label>
                    <input class="form-control" type="text"  name="prix" value="${produit.getPrix()}" >
                    

                    <label class="form-label">Quantite</label>
                    <input class="form-control" type="text" name="quantite" value="${produit.getQuantite()}" >
                    
                    <button type="submit" class="btn btn-primary mt-2 mb-0">Enregister</button>
                </form>
                
            </div>
        </div>
         
     
    </div>
</body>
</html>
