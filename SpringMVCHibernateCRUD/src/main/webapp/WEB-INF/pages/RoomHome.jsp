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
<title>BloodReport Management Screen</title>
</head>
<body>
	<div class="container">
		<h1>BloodReport List</h1>
		
		 <table class="table table-condensed">
    <thead>
          <tr> 
			
			<th>Date</th>
			<th>Haemoglobin</th>
			<th>Tlc</th>
			
			<th>Action</th>
           </tr>
          </thead>   

           <tbody>
			<c:forEach var="room" items="${listRoom}">
				<tr>

					
					
					
					<td>${room.no}</td>
					<td>${room.no_of_beds}</td>	
					<td>${room.	availability}</td>	
					 <td><a href="editRoom?no=${room.no}">Edit</a>
						 <a
						href="deleteRoom?no=${room.no}">Delete</a></td>
					
					
	
				</tr>
			</c:forEach>
             </tbody>
		</table>
		<h4>
			New BloodReport Registration <a href="newRoom">here</a>
			</br>
			
			
			
		</h4>
	</div>
</body>
</html>