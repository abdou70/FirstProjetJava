<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="public/css/bootstrap.min.css"/>
</head>
<body>
<div class="container col-md-10 col-md-offset-1">
  <div class="panel panel-primary">
    <div class="panel-heading">Recherche des Produits</div>
    <div class="panel-body">
   <form action="produit.do" method="get">
   <label>Mots-cle</label>
   <input type="text" name="motcle" value="${model.motcle}">
   <button type="submit" class="btn btn-primary">Rechercher</button>
   </form>
   <table class="table table-stiped">
    <tr>
      <th>ID</th><th>designation</th><th>prix</th><th>quantite</th>
    </tr>
    <c:forEach items="${model.produits}" var="p" >
    <tr>
      <td>${p.id}</td>
      <td>${p.description}</td>
      <td>${p.prix}</td>
      <td>${p.quantite}</td>
    </tr>
    </c:forEach>
   </table>
    </div>
  </div>
</div> 
</body>
</html>