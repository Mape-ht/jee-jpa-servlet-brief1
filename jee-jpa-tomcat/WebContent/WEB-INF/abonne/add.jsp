<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Abonne | Home">
    <jsp:attribute name="body_area">
    <form method="post" action="Abonne">
    <br><br><br><br> 
 <div class="form-row">
    <div class="form-group col-md-6">
      <label for="adresse">Adresse</label>
      <input type="text" class="form-control" id="adresse" name="adresse" placeholder="adresse">
    </div>
    <br><br><br><br><br><br>
    <!--  <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>-->
  <div class="form-group col-md-6">
  <div class="form-group">
    <label for="nom">Nom</label>
    <input type="text" class="form-control" id="nom" name="nom" placeholder="nom">
  </div> 
  </div>
  <div class="form-group col-md-6">
  	<div class="form-row">
      <label for="telephone">Telephone</label>
      <input type="text" class="form-control" id="telephone" name="telephone" placeholder="telephone">
    </div>
   </div>
   <div class="form-group col-md-4">
      <label for="village_id">Village</label>
      <select id="village_id" name="village_id" class="form-control">
        <option value="">Choisir</option>
    <c:forEach items="${villages}" var="v">
    	<option value="${v.id}">
    	${v.id}
    	${v.nom}
    	
    	</option>
      
    
    </c:forEach>
      </select>
    </div>
      <button type="submit" class="btn btn-primary">Enregistrer</button>
  <br><br><br><br><br><br>
</form>
<table class="table table-dark">
  <thead>
    <tr>
      <!--<th scope="col">Id</th>-->
      <!--<th scope="col">User</th>-->
      <th scope="col">Id</th>
      <th scope="col">Adresse</th>
      <th scope="col">Nom</th>
      <th scope="col">Telephone</th>
      <th scope="col">Village</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${abonnes}" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.adresse}</td>
      <td>${p.nom}</td>
      <td>${p.telephone}</td>
      <td>${p.village_id}</td>
  	<td></td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>
    </jsp:attribute>
</t:layout>