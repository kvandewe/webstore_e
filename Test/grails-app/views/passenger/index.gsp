
<%@ page import="com.sbif.tut.domain.Passenger" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'passenger.label', default: 'Passenger')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-passenger" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-passenger" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="age" title="${message(code: 'passenger.age.label', default: 'Age')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'passenger.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="firstName" title="${message(code: 'passenger.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'passenger.lastName.label', default: 'Last Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${passengerInstanceList}" status="i" var="passengerInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${passengerInstance.id}">${fieldValue(bean: passengerInstance, field: "age")}</g:link></td>
					
						<td>${fieldValue(bean: passengerInstance, field: "email")}</td>
					
						<td>${fieldValue(bean: passengerInstance, field: "firstName")}</td>
					
						<td>${fieldValue(bean: passengerInstance, field: "lastName")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${passengerInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
