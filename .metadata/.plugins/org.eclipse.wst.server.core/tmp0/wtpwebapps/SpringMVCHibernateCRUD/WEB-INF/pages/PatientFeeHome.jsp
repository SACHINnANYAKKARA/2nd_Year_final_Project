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
<title>Patient Fee Management</title>
</head>
<body>
	<div class="container">
		<h1>Patient Fee Management</h1>
		
		 <table class="table table-condensed">
    <thead>
          <tr> 
			
			<th>RegistrationNo</th>
			<th>Date</th>
			<th>Total Fee</th>
			<th>xray_charge</th>
			<th>Action</th>
           </tr>
          </thead>   

           <tbody>
			<c:forEach var="patientFee" items="${listPatientFee}">
				<tr>

					
					<td>${patientFee.registration_no}</td>
					<td>${patientFee.date}</td>
					<td>${patientFee.total_fee}</td>
					<td>${patientFee.xray_charge}</td>
					 <td><a href="editPatientFee?recipt_no=${patientFee.recipt_no}">Edit</a>
						 <a
						href="deletePatientFee?recipt_no=${patientFee.recipt_no}">Delete</a></td>
					
			</c:forEach>
             </tbody>
		</table>
		<h4>
			New Patient Registration <a href="newPatientFee">here</a>
			</br>
			
		</h4>
	</div>
</body>
</html>