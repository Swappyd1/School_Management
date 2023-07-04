
<%@page import="java.util.List"%>


<%@include file="ManagerPanel.jsp"%>

		<div class="breadcrumbs-area">
		<h3>Manager Panel</h3>
		<ul>
	
			<li>Tournament</li>
		</ul>
	</div>
	<div class="card height-auto">
		<div class="card-body">
			<div class="heading-layout1">
				<div class="item-title">
					<h3>Update Tournament</h3>
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
						<form action="ManagerUpdateTournament" method="post">
							<table class="table text-nowrap">
								<tbody>
									<input type="hidden" name="tournamentid" value="${list.tournamentid}">
									

									<tr align="center">
										<td>Tournament Name</td>
										<td class="font-medium text-dark-medium"><input
											type="text" name="tournamentname" value="${list.tournamentname}"></td>
									</tr>


									<tr align="center">
										<td>Start Date :</td>
										<td class="font-medium text-dark-medium"><input
											type="date" name="startdate" value="${list.startdate}"></td>
									</tr>
									
									<tr align="center">
										<td>Location :</td>
										<td class="font-medium text-dark-medium"><input
											type="text" name="location" value="${list.location}"></td>
									</tr>
									
									<tr align="center">
										<td>No of Student :</td>
										<td class="font-medium text-dark-medium"><input
											type="number" name="noofstudent" value="${list.noofstudent}"></td>
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