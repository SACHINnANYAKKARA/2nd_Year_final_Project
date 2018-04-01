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
<title>Patient Diagnosis Screen</title>
</head>
<body>
	<div class="container">
		<h1>Patient Diagnosis</h1>
		
		 <table class="table table-condensed">
    <thead>
          <tr> 
			
			<th>registration_no</th>
			<th>diagnisys_date</th>
			<th>provisional_dignosis</th>
			<th>Remark</th>
			<th>Action</th>
           </tr>
          </thead>   

           <tbody>
			<c:forEach var="PatientDiagnosis" items="${listPatientDiagnosis}">
				<tr>

					
					<td>${PatientDiagnosis.registration_no}</td>
					<td>${PatientDiagnosis.diagnisys_date}</td>
					<td>${PatientDiagnosis.provisional_dignosis}</td>
					<td>${PatientDiagnosis.remark}</td>
					<td><a href="editPatientDiagnosis?diagnisys_no=${PatientDiagnosis.diagnisys_no}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deletePatientDiagnosis?diagnisys_no=${PatientDiagnosis.diagnisys_no}">Delete</a></td>
	
				</tr>
			</c:forEach>
             </tbody>
		</table>
		<h4>
			New Patient Registration <a href="newPatient">here</a>
			</br>
			
			
			
		</h4>
	</div>
</body>
</html>