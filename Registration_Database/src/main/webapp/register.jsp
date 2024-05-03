<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
 <style>
	 body{
		background-image: url("css/11771.jpg"); 
	 } 
	 
  </style>
 <link rel="stylesheet" href="css/register.css" />
 
 <script>
 function checking(){
	 
	 let pass = document.getElementById("password");
	 let cPass = document.getElementById("confirmPassword");
	 if(pass.value === cPass.value){
		 return true;
	 }else{
		alert("Password not matched refreshing the page!!");
		 location.reload();
		 return false;
	 }
	 
 }
 
 </script>
 
</head>
<body>
<div class="container">
      <h1>Registration Form</h1>
      <form action="RegisterController" method="get" onsubmit="return checking()">
     
        <label for="name">Name: </label>
        <input type="text" id="name" name="name" placeholder="Enter Your Name" required /><br />
        
         <label for="mobile_no">Mobile No: </label>
        <input type="text" id="mobile_no" name="mobile" placeholder="Enter Your Mobile number" required/><br />

        <label for="email">Email: </label>
        <input type="email" id="email" name="email" placeholder="Enter Your Email" required /><br />
        
         <label for="city">City: </label>
        <input type="text" id="city" name="city" placeholder="Enter Your City" required /><br />

        <label for="gender">Gender: </label>
        <select id="gender" name="gender"  required>
          <option value=" "  > -select your gender- </option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="Lesbian">Lesbian</option>
          <option value="Gay">Gay</option>
          <option value="Other">Other</option>
          </select><br />

      
        <label for="password">Password: </label>
        <input type="password" id="password" name="password" placeholder="Enter Your Password" required/><br />

        <label for="re_password" id="confirmPassword">Confirm Password: </label>
        <input
          type="password" id="re_password" name="re_password" placeholder="Confirm Your Password" required/><br />

        <div class ="backpage"><input type="submit" value="Submit" />
        <a href="login.jsp">back</a>
      </div></form>
    </div>

</body>
</html>