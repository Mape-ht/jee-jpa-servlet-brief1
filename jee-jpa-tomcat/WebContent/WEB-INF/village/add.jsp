<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout title="Village | Home">
    <jsp:attribute name="body_area">
    <form method="post" action="Village">
    <br><br><br><br> 
 <!-- <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nom Village</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress2">Address 2</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div> 
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>-->
  <div class="form-group col-md-8">
    <label for="nomVillage">Village</label>
    <input type="text" class="form-control" id="nomVillage" name="nomVillage" placeholder="Nom village">
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
      <th scope="col">Nom-Village</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${villages}" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.nom}</td>
      <td></td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>
    </jsp:attribute>
</t:layout>