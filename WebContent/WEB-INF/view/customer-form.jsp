<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
First name:
<form:input path="firstName" />
		<br>
Last name(*):
<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br>
		Maximum free passes:
		<form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		
		Postal code:
		<form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<input type="submit" value="Add customer details">
	</form:form>
</body>
</html>