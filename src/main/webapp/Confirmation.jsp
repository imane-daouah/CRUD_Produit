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
            <div class="panel-heading">Confirmation</div>
            <div class="panel-body">
                <div class="form-group">
                    <label>ID:</label>
                    <label>${produitSave.id}</label> <!-- Utilisez simplement l'attribut id -->
                </div>
                <div><p></p></div>
                
                <div class="form-group">
                    <label>Désignation:</label>
                    <label>${produitSave.designation}</label>
                </div>
                <div><p></p></div>
                
                <div class="form-group">
                    <label>Prix:</label>
                    <label>${produitSave.prix}</label><br>
                </div>
                <div><p></p></div>
                
                <div class="form-group">
                    <label>Quantité :</label>
                    <label>${produitSave.quantite}</label>
                </div>
                <button><a  href="chercher.php?motCle="><strong>OK</strong></a></button><a  href="chercher.php?motCle="></a>
                
                
            </div>
        </div>
    </div>
</body>
</html>

 