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
     <h2>Form control Registration List: input</h2>
  
 <form:form action="saveNurse" method="post" modelAttribute="nurse">
   <form:hidden path="NUID"/>

    <div class="form-group">
      <label for="usr">Name:</label>
      <form:input type="text"  path="name" class="form-control" id="usr" />
    </div>

    <div class="form-group">
      <label for="pwd">level:</label>
      <form:input type="text" path="level" class="form-control" id="pwd" />
    </div>
    
      <div class="form-group">
      <label for="pwd">Start date:</label>
      <form:input type="text" path="start_date" class="form-control" id="pwd" />
    </div>
    
    

    <input type="submit" value="Save">

   </form:form>
   
</div>
    
      
</body>
</html>