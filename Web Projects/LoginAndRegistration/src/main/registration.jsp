<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Registration Form </title>

<!-- Font Icon -->
<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>"/>
	<div class="main">
		<!-- Registration form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Register</h2>			
						<form method="post" action="register" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="employee_firstname" id="employee_firstname" placeholder="Your First Name" required/>
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="employee_lastname" id="employee_lastname" placeholder="Your Last Name" required/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="employee_id" id="employee_id" placeholder="Your Employee ID" required/>
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="employee_username" id="employee_username" placeholder="Your Username" required/>
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="employee_email" id="employee_email" placeholder="Your Email" required/>
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="employee_password" id="employee_password" placeholder="Password" required/>
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="employee_re_password" id="employee_re_password"
									placeholder="Repeat your password" required/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-phone"></i></label>
								<input type="text" name="employee_contact" id="employee_contact"
									placeholder="Contact no" required/>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
						<a href="login.jsp" class="signup-image-link">I already have an account</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if(status=="success") {
			alert("Account Created Successfully");
		} else if(status == "Invalid First Name") {
			alert("Please enter your first name");
		} else if(status == "Invalid Employee ID") {
			alert("Please enter employee ID");
		} else if(status == "Invalid Username") {
			alert("Please enter your username");
		} else if(status == "Invalid Password") {
			alert("Password should be minimum 8 characters");
		} else if(status == "Password Not Matching") {
			alert("Password Not Matching. Enter again.");
		} else if(status == "Invalid Email") {
			alert("Please enter email");
		} else if(status == "Invalid Phone") {
			alert("Phone number should be of 10 characters");
		} else if(status == "User exists") {
			alert("User with same employee ID already exists");
		} 
	</script>



</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>