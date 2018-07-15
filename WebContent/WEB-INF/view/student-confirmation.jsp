<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Student confirmation</title>
</head>
<body>
	Student is confirmed: ${student.firstName} ${student.lastName} Country:
	${student.country }
	<br> Favorite language response: ${student.favoriteLanguage }
	<br>
	<br> Os experience:
	<ul>
		<c:forEach var="temp" items="${student.opereatingSystems }">
			<li>${temp }</li>
		</c:forEach>
	</ul>

</body>
</html>