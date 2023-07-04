
<%@page import="java.util.*"%>
<%@page import="com.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Comp	atible" content="ie=edge">
<title>School ERP</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/style1.css">
</head>
<body>
	<div class="main">
		<!-- Sing in  Form -->
		<section class="sign-in">
		<div class="container">
			<div class="signin-content">
				<div class="signin-image">
					<figure> <img src="images/signin-image.jpg"	alt="sing up image"> </figure>
				</div>

				<div class="signin-form">
					<h2 class="form-title">Sign In</h2>
					<form method="post" class="register-form" id="login-form" action="LoginServlet">
						<div class="form-group">
							<label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label> 
							<select name="post">
								<option>Select Any one</option>
								<option>Admin</option>
								<option>Manager</option>
								<option>Staff</option>
							</select>
						</div>
						<div class="form-group">
							<label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label> 
							<input type="text" name="logname" id="you_name" placeholder="Your Name" />
						</div>
						<div class="form-group">
							<label for="your_pass"><i class="zmdi zmdi-lock"></i></label> 
							<input type="password" name="logpass" id="your_pass" placeholder="Password" />
						</div>
						<div class="form-group">
							<input type="checkbox" name="remember-me" id="remember-me" class="agree-term" /> 
								<label for="remember-me" class="label-agree-term"><span><span></span></span>Remember me</label>
						</div>
						<div class="form-group form-button">
							<input type="submit" id="signin" class="form-submit" value="Log in" />
						</div>
					</form>
				</div>
			</div>
		</div>
		</section>
	</div>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>