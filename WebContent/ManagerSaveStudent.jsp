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
			<li>Save Student</li>
		</ul>
	</div>
	<!-- Breadcubs Area End Here -->
	<!-- Add New Book Area Start Here -->
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Add Student</h3>
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
			<form action="ManagerSaveStudentServlet" method="post" class="new-added-form">


				<div class="row">
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Student name *</label> <input type="text" placeholder=""
							class="form-control" name="name" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Logname *</label> <input type="text" placeholder=""
							class="form-control" name="logname" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Logpass *</label> <input type="password" placeholder=""
							class="form-control" name="logpass" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Standard *</label> <input type="number" placeholder=""
							class="form-control" name="standard" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Division *</label> <input type="text" placeholder=""
							class="form-control" name="division" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Address *</label> <input type="text" placeholder=""
							class="form-control" name="address" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Age *</label> <input type="number" placeholder=""
							class="form-control" name="age" required>
					</div>
					
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Date Of Birth *</label> <input type="date" placeholder=""
							class="form-control" name="dob" required>
					</div>
					
					
				<div class="col-xl-3 col-lg-6 col-12 form-group">
					<label>Gender *</label> <select name="gender">
						<option>Select Gender</option>
						<option>Male</option>
						<option>Female</option>
					</select>
				</div>
				
					<div class="col-xl-3 col-lg-6 col-12 form-group">
						<label>Email *</label> <input type="email" placeholder=""
							class="form-control" name="email" required>
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