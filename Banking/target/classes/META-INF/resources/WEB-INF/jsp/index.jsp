<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en" xmlns="https://www.thyleaf.org/">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
<title>Hello, world!</title>
</head>
<body>

	<div class="container">
		<h1>User Registration form</h1>
		<form class="col-5" th:action="@{/registerUser}" th:object="${account}" method="post">
			<div class="mb-3">
				<label for="exampleFormControlInput1">Name</label> <input
					type="text" class="form-control" placeholder="Enter Name">
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1">UserName</label> <input
					type="text" class="form-control" placeholder="Enter UserName">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Email</label> <input
					type="email" class="form-control" placeholder="Enter Email">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Phone</label> <input
					type="number" class="form-control" placeholder="Enter PhoneNumber">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Password</label> <input
					type="password" class="form-control" placeholder="Enter Password">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">Confirm Password</label> <input
					type="password" class="form-control" placeholder="Confirm Password">
			</div>
			<label for="exampleFormControlInput1">Gender</label>
			
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio1" value="option1">
				<label class="form-check-label" for="inlineRadio1">Male</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio"
					name="inlineRadioOptions" id="inlineRadio2" value="option2">
				<label class="form-check-label" for="inlineRadio2">Female</label>
			</div>


			<button type="submit" class="btn btn-success">Register</button>
		</form>

	</div>






















</body>
</html>