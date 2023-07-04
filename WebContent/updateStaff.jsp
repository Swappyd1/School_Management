
<%@page import="java.util.List"%>


<%@include file="ManagerPanel.jsp"%>

		<div class="breadcrumbs-area">
		<h3>Manager Panel</h3>
		<ul>
	
			<li>Staff</li>
		</ul>
	</div>
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Update Staff</h3>
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
			<div class="single-info-details">

				<div class="item-content">
					<div class="header-inline item-header">
						<h3 class="text-dark-medium font-medium"></h3>
						<div class="header-elements">
							<ul>
								<li><a href="#"><i class="far fa-edit"></i></a></li>
								<li><a href="#"><i class="fas fa-print"></i></a></li>
								<li><a href="#"><i class="fas fa-download"></i></a></li>
							</ul>
						</div>
					</div>

					<div class="info-table table-responsive">
						<form action="ManagerUpdateStaff" method="post">
							<table class="table text-nowrap">
								<tbody>
									<input type="hidden" name="sid" value="${list.sid}">
									

									<tr align="center">
										<td>Staff Name</td>
										<td class="font-medium text-dark-medium"><input
											type="text" name="name" value="${list.name}"></td>
									</tr>


									<tr align="center">
										<td>Position :</td>
										<td class="font-medium text-dark-medium"><input
											type="text" name="position" value="${list.position}"></td>
									</tr>
									
									<tr align="center">
										<td>Phone No :</td>
										<td class="font-medium text-dark-medium"><input
											type="number" name="phone" value="${list.phone}"></td>
									</tr>
									
									<tr align="center">
										<td>Address :</td>
										<td class="font-medium text-dark-medium"><input
											type="text" name="address" value="${list.address}"></td>
									</tr>
									
									<tr align="center">
										<td>Gender:</td>
										<td class="font-medium text-dark-medium">
										<select name="gender">
												<option>${list.gender}</option>
												<option>Male</option>
												<option>Female</option>
										</select></td>
									</tr>
									
									<tr align="center">
										<td>Age :</td>
										<td class="font-medium text-dark-medium"><input
											type="number" name="age" value="${list.age}"></td>
									</tr>
									
									<tr align="center">
										<td>Joindate :</td>
										<td class="font-medium text-dark-medium"><input
											type="date" name="joindate" value="${list.joindate}"></td>
									</tr>
									
									<tr align="center">
										<td>Logname :</td>
										<td class="font-medium text-dark-medium">
										<input	type="text" name="logname" value="${list.logname}"></td>
										
									</tr>
									
									
									
									
									<tr align="center">
										<td>Logpass :</td>
										<td class="font-medium text-dark-medium">
										<input	type="password" name="logpass" value="${list.logpass}"></td>
										
									
									</tr>
									<tr align="center">
										<td>Date of Birth :</td>
										<td class="font-medium text-dark-medium">
										<input	type="date" name="dob" value="${list.dob}"></td>
										
									</tr>
									
									
									
									
									<tr>
										<td colspan="2"><input type="submit" value="Update">
									</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	</div>
	</div>


</body>
</html>