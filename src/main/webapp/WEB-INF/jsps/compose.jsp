<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
    <h2>Compose Email</h2>
    <form action="triggerEmailSending" method="post">
    <pre>
     To:<input type="text" name="email" value="${email}">
     Subjects:<input type="text" name="subjects"/>
     Compose:
     <textarea name="message" rows="10" cols="50"></textarea>
     
     <input type="Submit" value="Send Email"/>
     </pre>
    </form>
    ${msg}
</body>
</html>