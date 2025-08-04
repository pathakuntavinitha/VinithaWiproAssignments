<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Customer Save Page</title>
</head>
<body>
<h2>Customer Save Page</h2>
<form:form modelAttribute="customer" method="post">
    Name: <form:input path="name"/> <form:errors path="name" cssClass="error"/><br/>
    Email: <form:input path="email"/> <form:errors path="email" cssClass="error"/><br/>
    Age: <form:input path="age"/> <form:errors path="age" cssClass="error"/><br/>
    Gender: 
    <form:select path="gender">
        <form:option value="">Select Gender</form:option>
        <form:option value="Male">Male</form:option>
        <form:option value="Female">Female</form:option>
    </form:select>
    <form:errors path="gender" cssClass="error"/><br/>
    Birthday: <form:input path="birthday"/> <form:errors path="birthday" cssClass="error"/><br/>
    Phone: <form:input path="phone"/> <form:errors path="phone" cssClass="error"/><br/>
    <input type="submit" value="Save Customer"/>
</form:form>

<style>
    .error {
        color: red;
    }
</style>
</body>
</html>
