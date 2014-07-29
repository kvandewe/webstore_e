<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="test" />
<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"
	type="text/css">
<title>Welcome to hello - hello/index</title>
</head>

<body>
	<div class="body">Hello Welcome back - hello/index</div>
	<div>
		<table>
			<tr>
				<th>Nr</th>
				<th>Last Name</th>
				<th>First Name</th>
				<th>Age</th>
			</tr>
			<g:each in="${list}" var="passenger" status="nr">
				<tr>

					<td>
						${nr}
					</td>
					<td>
						${passenger.lastName}
					</td>
					<td>
						${passenger.firstName}
					</td>
					<td>
						${passenger.age}
					</td>
					<td>
						${passenger.mainEmail}
					</td>

				</tr>
			</g:each>
		</table>
	</div>
	<div>

		<g:each in="${(1..1)}" var="number">
			<p>
				This is the
				${number}th paragraph of text. This is the first paragraph of text.
				This is the first paragraph of text. This is the first paragraph of
				text.
			</p>
		</g:each>
	</div>
</body>
</html>
