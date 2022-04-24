<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <table>
     <tr><th>USER_ID</th><td>${USER_REGISTRATION.userId}</td></tr>
     <tr><th>NAME</th><td>${USER_REGISTRATION.name}</td></tr>
     <tr><th>PASSWORD</th><td>${USER_REGISTRATION.password}</td></tr>
     <tr><th>QUALIFICATION</th><td>${USER_REGISTRATION.qualification}</td></tr>
     <tr><th>EMAILID</th><td>${USER_REGISTRATION.emailId}</td></tr>
     <tr><th>CONTACT</th><td>${USER_REGISTRATION.contact}</td></tr>
     <tr><th>DATE_OF_BIRTH</th><td>${USER_REGISTRATION.dateOfBirth}</td></tr>
     <tr><th>APPLY_TYPE</th><td>${USER_REGISTRATION.applyType}</td></tr>
     <tr><th>CITIZENSHIP</th><td>${USER_REGISTRATION.citizenship}</td></tr>
     <tr><th>GENDER</th><td>${USER_REGISTRATION.gender}</td></tr>
     <tr><th>Hint_Question</th><td>${USER_REGISTRATION.hintQuestion}</td></tr>
     <tr><th>Hint_Answer</th><td>${USER_REGISTRATION.hintAnswer}</td></tr>
     </table>

</body>
</html>