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
     <h2>Form control Registration Urine: input</h2>
  
   <form:form action="saveUrine" method="post" modelAttribute="urine">
   <form:hidden path="registration_no"/>

    <div class="form-group">
      <label for="usr">Date:</label>
      <form:input type="text"  path="date" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">Appearance:</label>
      <form:input type="text" path="appearance" class="form-control" id="pwd" />
    </div>

     <div class="form-group">
      <label for="usr">Specific Gravity:</label>
      <form:input type="text" path="specific_gravity" class="form-control" id="usr" />
    </div>

     <div class="form-group">
      <label for="usr">Albumin:</label>
      <form:input type="text" path="albumin" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">Suger:</label>
      <form:input type="text" path="suger" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">Rbcs_Hope:</label>
      <form:input type="text" path="rbcs_hpe" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">Wbcs:</label>
      <form:input type="text" path="wbcs" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">Biile Salts:</label>
      <form:input type="text" path="bile_salts" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">acetone:</label>
      <form:input type="text" path="acetone" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">Total_value:</label>
      <form:input type="text" path="total_value" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">Pregnancy :</label>
      <form:input type="text" path="pregnancy" class="form-control" id="usr" />
    </div>
    
    <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>