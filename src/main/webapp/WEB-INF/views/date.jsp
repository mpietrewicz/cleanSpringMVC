<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Actual Date</title>
	</head>
	<body>
		<h2>Current time is <%= LocalDateTime.now() %></h2>
	</body>
</html>