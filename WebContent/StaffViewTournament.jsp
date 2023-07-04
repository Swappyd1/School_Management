<%@page import="DaoC.ErpDao"%>
<%@page import="com.model.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>

<%@include file="StaffPanel.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Tournament> l = ErpDao.ViewAllTournament();
		session.setAttribute("list", l);
	%>

	<div class="breadcrumbs-area">
		<h3>Staff Panel</h3>
		<ul>
			<li><a href="Index.jsp">Home</a></li>
			<li></li>
		</ul>
	</div>
	<!-- Breadcubs Area End Here -->
	<!-- Teacher Table Area Start Here -->
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Details of Tournament</h3>
				</div>
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button"
						data-toggle="dropdown" aria-expanded="false">...</a>

					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="#"><i
							class="fas fa-times text-orange-red"></i>Close</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-cogs text-dark-pastel-green"></i>Edit</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
					</div>
				</div>
			</div>

			<div class="table-responsive">
				<table class="table display data-table text-nowrap">
					<thead>
						<tr>
							<th>Tournament Id</th>
							<th>Tournament Name</th>
							<th>Start Date</th>
							<th>Location</th>
							<th>No of Student</th>
							
							
							

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="l">
							<tr>
								<td><div class="form-check">${l.tournamentid}</div></td>

								<td>${l.tournamentname}</td>
								<td>${l.startdate}</td>
								<td>${l.location}</td>
								<td>${l.noofstudent}</td>
								
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


</body>


<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/all-book.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 12 Jul 2019 09:23:35 GMT -->
</html>