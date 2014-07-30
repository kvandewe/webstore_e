<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>Insert title here</title>
</head>
<body>
	<div class="body">
		<g:form action="index">
			<label for="lastName">Last Name</label>
			<g:textField name="lastName" value="${person.lastName}" />
			<br />
			<label for="firstName">First Name</label>
			<g:textField name="firstName" value="${person.firstName}" />
			<br />
			<label for="age">Age</label>
			<g:textField name="age" value="${person.age}" />
			<br />
			<g:submitButton name="create" value="Save" />
		</g:form>
	</div>
</body>
</html>