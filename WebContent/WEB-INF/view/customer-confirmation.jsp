<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer confirmation</title>
</head>
<body>
	Customer
	<br> first name: ${customer.firstName }, Last name:
	${customer.lastName}
	<br>Free passes: ${customer.freePasses }
	<br>Postal code: ${customer.postalCode }
</body>
</html>