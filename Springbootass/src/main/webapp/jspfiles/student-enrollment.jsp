<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Enrollment Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
    <form:form modelAttribute="student" method="post" action="save.do">
        <h2>Enrollment Form</h2>

        <label>First Name</label>
        <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>

        <label>Last Name</label>
        <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>

        <label>Sex</label>
        <form:radiobutton path="sex" value="Male"/> Male
        <form:radiobutton path="sex" value="Female"/> Female
        <form:errors path="sex" cssClass="error"/>

        <label>Date of birth</label>
        <form:input path="dob"/>
        <form:errors path="dob" cssClass="error"/>

        <label>Email</label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>

        <label>Section</label>
        <form:radiobutton path="section" value="Graduate"/> Graduate
        <form:radiobutton path="section" value="Post Graduate"/> Post Graduate
        <form:radiobutton path="section" value="Research"/> Research
        <form:errors path="section" cssClass="error"/>

        <label>Country</label>
        <form:select path="country">
            <form:option value="" label="--Select--" />
            <form:option value="USA" />
            <form:option value="CANADA" />
            <form:option value="INDIA" />
        </form:select>
        <form:errors path="country" cssClass="error"/>

        <label>First Attempt?</label>
        <form:checkbox path="firstAttempt"/>
        <form:errors path="firstAttempt" cssClass="error"/>

        <label>Subjects</label>
        <form:select path="subjects" items="${subjectList}" multiple="true"/>
        <form:errors path="subjects" cssClass="error"/>

        <button type="submit">Register</button>
    </form:form>
</body>
</html>
