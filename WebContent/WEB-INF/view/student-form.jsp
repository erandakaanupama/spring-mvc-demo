<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="process-form" modelAttribute="student">
	First name: <form:input path="firstName" />
		<br>
		
	Last name: 
	<form:input path="lastName" />
		<br>
	
	Country:	
	<form:select path="country">
			<form:options items="${student.countryOption}" />
		</form:select>
		<br>
		<br>
		
		Favorite programming language:
	Java <form:radiobutton path="favoriteLanguage" value="Java" />
	C <form:radiobutton path="favoriteLanguage" value="C" />
	C++ <form:radiobutton path="favoriteLanguage" value="C++" />
	Python <form:radiobutton path="favoriteLanguage" value="Python" />

		<%-- <form:radiobuttons path="favoriteLanguage" items="${student.radioOption }"/> --%>
		<br>
		<br>

OS system experience: 
Linux<form:checkbox path="opereatingSystems" value="Linux" />
Windows <form:checkbox path="opereatingSystems" value="Windows" />
MacOS <form:checkbox path="opereatingSystems" value="MacOS" />

		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>