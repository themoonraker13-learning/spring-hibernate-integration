<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring-Hibernate Integration</title>
</head>
<body>
 
<form:form method="post" action="add" commandName="employee">
 
 	<h2>Spring-Hibernate Demo</h2>
 	
    <table>
    <tr>
        <td><form:label path="firstname">First Name</form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname">Last name</form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="telephone">Telephone</form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Employee"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Employee Record (from Read-only Database)</h3>
<c:if  test="${!empty employeeList}">
<table class="data" border="1">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Telephone</th>
</tr>
<c:forEach items="${employeeList}" var="emp">
    <tr>
        <td>${emp.lastname}, ${emp.firstname} </td>
        <td>${emp.email}</td>
        <td>${emp.telephone}</td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>