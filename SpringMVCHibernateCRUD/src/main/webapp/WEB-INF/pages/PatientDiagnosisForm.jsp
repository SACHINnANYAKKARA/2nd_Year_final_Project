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
     <h2>Form control Diagonsis List: input</h2>
  
   <form:form action="savePatientDiagnosis" method="post" modelAttribute="patientDiagnosis">
   <form:hidden path="diagnisys_no"/>

    <div class="form-group">
      <label for="usr">Registration_no:</label>
      <form:input type="text"  path="registration_no" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">	diagnisys_date:</label>
      <form:input type="text" path="diagnisys_date" class="form-control" id="pwd" />
    </div>

     <div class="form-group">
      <label for="usr">	provisional_dignosis:</label>
      <form:input type="text" path="provisional_dignosis" class="form-control" id="usr" />
    </div>

     <div class="form-group">
      <label for="usr">	remark:</label>
      <form:input type="text" path="remark" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	biochemistry:</label>
      <form:input type="text" path="biochemistry" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	stool:</label>
      <form:input type="text" path="stool" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	blood:</label>
      <form:input type="text" path="blood" class="form-control" id="usr" />
    </div>
    
     <div class="form-group">
      <label for="usr">	gastroscopy:</label>
      <form:input type="text"  path="gastroscopy" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	urine:</label>
      <form:input type="text"  path="urine" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	xray:</label>
      <form:input type="text"  path="xray" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	sonography:</label>
      <form:input type="text"  path="sonography" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	others:</label>
      <form:input type="text"  path="others" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	reconsultation_advice_week:</label>
      <form:input type="text"  path="reconsultation_advice_week" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	reconsultation_advice_date:</label>
      <form:input type="text"  path="reconsultation_advice_date" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	final_diagnosis:</label>
      <form:input type="text"  path="final_diagnosis" class="form-control" id="usr" />
    </div>
    
    <div class="form-group">
      <label for="usr">	ECG:</label>
      <form:input type="text"  path="ECG" class="form-control" id="usr" />
    </div>
   
   
    
    <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>