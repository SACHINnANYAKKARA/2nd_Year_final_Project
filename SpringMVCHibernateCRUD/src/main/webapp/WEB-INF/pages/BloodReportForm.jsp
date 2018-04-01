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
     <h2>Form control BloodReport List: input</h2>
  
   <form:form action="saveBloodReport" method="post" modelAttribute="bloodReport">
   <form:hidden path="registration_no"/>

    <div class="form-group">
      <label for="usr">Date:</label>
      <form:input type="text"  path="date" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">	haemoglobin:</label>
      <form:input type="text" path="haemoglobin" class="form-control" id="pwd" />
    </div>

     <div class="form-group">
      <label for="usr">	tlc:</label>
      <form:input type="text" path="tlc" class="form-control" id="usr" />
    </div>

     <div class="form-group">
      <label for="usr">	neutrophils:</label>
      <form:input type="text" path="neutrophils" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	eosinophils:</label>
      <form:input type="text" path="eosinophils" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	monocytes:</label>
      <form:input type="text" path="monocytes" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	basophils:</label>
      <form:input type="text" path="basophils" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">	other:</label>
      <form:input type="text"  path="other" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	erythrocyte_sedimentation:</label>
      <form:input type="text"  path="erythrocyte_sedimentation" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	peripheral_blood_film:</label>
      <form:input type="text"  path="peripheral_blood_film" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	haematocrit_pcv:</label>
      <form:input type="text"  path="haematocrit_pcv" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	total_rbc_count:</label>
      <form:input type="text"  path="total_rbc_count" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	platelets:</label>
      <form:input type="text"  path="platelets" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	blood_group:</label>
      <form:input type="text"  path="blood_group" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	rhesus:</label>
      <form:input type="text"  path="rhesus" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	hiv:</label>
      <form:input type="text"  path="hiv" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	hepatitis:</label>
      <form:input type="text"  path="hepatitis" class="form-control" id="usr" />
    </div>
    
    
   
    
    <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>