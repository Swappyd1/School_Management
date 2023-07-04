<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="ManagerPanel.jsp"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="breadcrumbs-area">
		<h3>Manager Panel</h3>
		<ul>
			<li><a href="Dashboard.html">Home</a></li>
			<li>Save Sport</li>
		</ul>
	</div>
	<!-- Breadcubs Area End Here -->
	<!-- Add New Book Area Start Here -->
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Add Sport</h3>
				</div>
				<div class="dropdown">
					<a class="dropdown-toggle" href="#" role="button"
						data-toggle="dropdown" aria-expanded="false">...</a>

					<div class="dropdown-menu dropdown-menu-right">
						<a class="dropdown-item" href="#"><i
							class="fas fa-times text-orange-red"></i>Close</a> <a
							class="dropdown-item" href="#"><i
							class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
					</div>
				</div>
			</div>
			<form action="ManagerSaveSportServlet" method="post" class="new-added-form">


				<div class="row">
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Sport Name *</label> <input type="text" placeholder=""
							class="form-control" name="sportname" required>
					</div>
					
					
					
					
					
					
					
					
					
					
</div>
					<div class="row">
						<div class="col-12 form-group mg-t-8">
							<button type="submit"
								class="btn-fill-lg btn-gradient-yellow btn-hover-bluedark">Save</button>
							<button type="reset"
								class="btn-fill-lg bg-blue-dark btn-hover-yellow">Reset</button>
						</div>
					</div>
			</form>
		</div>
	</div>

	</div>
	</div>

</body>
</html>