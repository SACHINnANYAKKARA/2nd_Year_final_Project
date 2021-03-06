<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>New/Edit Contact</title>
</head>
<body>
      <div class="container">
     <h2>Form control Patient Medicine List: input</h2>
  
 <form:form action="savePatientMedicine" method="post" modelAttribute="patientMedicine">
   <form:hidden path="dignosis_no"/>

    <div class="form-group">
      <label for="usr">	medicine_no:</label>
      <form:input type="text"  path="medicine_no" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">	medicine_name:</label>
      <form:input type="text" path="medicine_name" class="form-control" id="pwd" />
    </div>

     <div class="form-group">
      <label for="usr">precaution:</label>
      <form:input type="text" path="precaution" class="form-control" id="usr" />
    </div>

     <div class="form-group">
      <label for="usr">no_of_doses:</label>
      <form:input type="text" path="no_of_doses" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	injection_date:</label>
      <form:input type="text" path="injection_date" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">status:</label>
      <form:input type="text" path="status" class="form-control" id="usr" />
    </div>
    
        <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>