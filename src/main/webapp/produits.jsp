<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Produits</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
   <jsp:include page="header.jsp" />
<div><p></p></div>

    <div class="container col-md-10 col-md-offset-1 ">
        <div class="panel panel-primary">
            <div class="panel-heading">Recherche des produits:</div>
            <div class="panel-body">
                <form action="chercher.php" method="get">
                    <label>Mot Clé:</label>
                    <input type="text" name="motCle" autocomplete="off" />
                    <button type="submit" class="btn btn-primary">Chercher</button>
                </form>
            </div>
        </div>

        <!-- Affichage du tableau des produits -->
        <table class="table table-bordered mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Désignation</th>
                    <th>Prix</th>
                    <th>Quantité</th>
                    <th>Action</th>
                    
                    
                </tr>
            </thead>
            <tbody>
                <!-- Vérifiez s'il y a des produits -->
                <c:choose>
                    <c:when test="${not empty model.produits}">
                        <!-- Boucle pour afficher chaque produit -->
                        <c:forEach var="produit" items="${model.produits}">
                            <tr>
                                <td>${produit.id}</td>
                                <td>${produit.designation}</td>
                                <td>${produit.prix}</td>
                                <td>${produit.quantite}</td>
                               <%--  <td>
                                  <a onclick="return confirm('Êtes-vous sûr d’avoir Supprimer le produit ?!!')" href="Supprime.php?id=${produit.id} ">Supprime</a>
                                 </td> --%>
                                <td>
                                   <a href="Edit.php?id=${produit.id}" class="btn btn-primary btn-sm">Editer</a>
                                   <a onclick="return confirm('Êtes-vous sûr d’avoir Supprimer le produit ?!!')" href="Supprime.php?id=${produit.id}" class="btn btn-danger btn-sm">Supprimer</a>
                                </td>
                                
                                 
<%--                                 <td><a href="Edit.php?id=${produit.id}">Edit</a></td>
 --%>                            </tr>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <!-- Message si aucun produit n'est trouvé -->
                        <tr>
                            <td colspan="4" class="text-center text-danger">Aucun produit trouvé.</td>
                        </tr>
                    </c:otherwise>
                </c:choose>
            </tbody>
        </table>
    </div>
</body>
</html>
