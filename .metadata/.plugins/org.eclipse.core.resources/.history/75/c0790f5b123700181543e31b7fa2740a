<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Employee Management Screen</title>
</head>
<body>
	<div class="container">
		<h1>Patient List</h1>
		
		 <table class="table table-condensed">
    <thead>
          <tr> 
			
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>
           </tr>
          </thead>   

           <tbody>
			<c:forEach var="patient" items="${listPatientDiet}">
				<tr>

					
					<td>${patient.diagnosis_no}</td>
					<td>${patient.diat_advice}</td>
					<td>${patient.recipt_no}</td>
					 <td><a href="editPatientDiet?diagnosis_no=${patient.diagnosis_no}">Edit</a>
						 <a
						href="deletePatientDiet?diagnosis_no=${patient.diagnosis_no}">Delete</a></td>
					
			</c:forEach>
             </tbody>
		</table>
		<h4>
			New Patient Registration <a href="newPatientDiet">here</a>
			</br>
			
			
			
		</h4>
	</div>
</body>
</html>