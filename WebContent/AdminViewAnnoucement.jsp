<%@page import="DaoC.ErpDao"%>
<%@page import="com.model.Announcement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="AdminHeader.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Announcement> list = ErpDao.ViewAllAnnouncement();
	session.setAttribute("list", list);

	%>

	<div class="breadcrumbs-area">
		<h3>Admin Panel</h3>
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
					<h3>Details of Announcement</h3>
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
							<th>Announcement Id</th>
							<th>Announcement Name</th>
							<th>Announcement Date</th>
							
							
							
							<th>Delete</th>
							

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="l">
							<tr>
								<td><div class="form-check">${l.anid}</div></td>

								<td>${l.annname}</td>
								<td>${l.dateofan}</td>
																
								
								<td><a href="AdminDeleteAnnouncement?anid=${l.anid}">
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