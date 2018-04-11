<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			
			<th>Registration Date</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Address</th>
			<th>Action</th>
           </tr>
          </thead>   

           <tbody>
			<c:forEach var="patient" items="${listPatient}">
				<tr>

					
					<td>${patient.registration_date}</td>
					<td>${patient.first_name}</td>
					<td>${patient.last_name}</td>
					<td>${patient.address}</td>
					<td><a href="editPatient?registration_no=${patient.registration_no}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deletePatient?registration_no=${patient.registration_no}">Delete</a></td>
	
				</tr>
			</c:forEach>
             </tbody>
		</table>
		<h4>
			New Patient Registration <a href="newPatient">here</a>
			<br>
			
			
			
		</h4>
	</div>
</body>
</html>