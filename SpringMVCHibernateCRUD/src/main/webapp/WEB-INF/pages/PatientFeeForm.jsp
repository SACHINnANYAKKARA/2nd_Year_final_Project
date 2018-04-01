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
     <h2>Form control Pateint Fee Registration List: input</h2>
  
   <form:form action="savePatientFee" method="post" modelAttribute="patientFee">
   <form:hidden path="recipt_no"/>

    <div class="form-group">
      <label for="usr">Registration_no:</label>
      <form:input type="text"  path="registration_no" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">	Date:</label>
      <form:input type="text" path="date" class="form-control" id="pwd" />
    </div>

     <div class="form-group">
      <label for="usr">	total_fee:</label>
      <form:input type="text" path="total_fee" class="form-control" id="usr" />
    </div>

     <div class="form-group">
      <label for="usr">recipy_name:</label>
      <form:input type="text" path="recipy_name" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	dgnosios_charge:</label>
      <form:input type="text" path="dgnosios_charge" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	xray_charge:</label>
      <form:input type="text" path="xray_charge" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">ecg_charge:</label>
      <form:input type="text" path="ecg_charge" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">	labtest_charge:</label>
      <form:input type="text"  path="labtest_charge" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	injection_charge:</label>
      <form:input type="text"  path="injection_charge" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	colonoscopy_charge:</label>
      <form:input type="text"  path="colonoscopy_charge" class="form-control" id="usr" />
    </div>
   
    
    <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>