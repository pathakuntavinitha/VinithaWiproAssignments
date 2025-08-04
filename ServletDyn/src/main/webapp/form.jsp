<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Marks Form</title>
</head>
<body>
    <form action="processmarks.jsp" method="post">
        <h2>Student Marks Form</h2>
        <label for="name">Student Name:</label>
        <input type="text" id="name" name="name" required>
        
        <label for="marks">Marks Obtained:</label>
        <input type="number" id="marks" name="marks" min="0" max="100" required>
        
        <button type="submit">Submit</button>
    </form>
    
    <jsp:include page="footer.jsp" />
</body>
</html>