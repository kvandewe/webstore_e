<%@ page import="com.sbif.tut.domain.Passenger" %>



<div class="fieldcontain ${hasErrors(bean: passengerInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="passenger.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" value="${passengerInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: passengerInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="passenger.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" required="" value="${passengerInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: passengerInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="passenger.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${passengerInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: passengerInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="passenger.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${passengerInstance?.lastName}"/>

</div>

