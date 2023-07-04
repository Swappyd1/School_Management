<%@page import="DaoC.ErpDao"%>
<%@page import="com.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>

<%@include file="ManagerPanel.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		List<Sport> l = ErpDao.ViewAllSport();
		session.setAttribute("list", l);
	%>

	<div class="breadcrumbs-area">
		<h3>Manager Panel</h3>
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
					<h3>Details of Sport</h3>
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
							<th>Sport Id</th>
							<th>Sport Name</th>
							
							
							<th>Update</th>
							<th>Delete</th>
							

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="l">
							<tr>
								<td><div class="form-check">${l.sportid}</div></td>

								<td>${l.sportname}</td>
																
								<td><a href="ManagerUpdateSport?sportid=${l.sportid}">
										Update</a></td>
								<td><a href="ManagerDeleteSport?sportid=${l.sportid}">
										Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>