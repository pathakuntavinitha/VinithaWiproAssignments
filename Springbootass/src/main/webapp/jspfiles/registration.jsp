<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: white;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }
        h2 {
            text-align: center;
        }
        table {
            margin: 0 auto;
        }
        td {
            padding: 8px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Spring MVC Form Demo - Registration</h2>
    <form action="/SpringMvcFormExample/register" method="post">
        <table>
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td>Birthday (mm/dd/yyyy):</td>
                <td><input type="text" name="birthday"/></td>
            </tr>
            <tr>
                <td>Profession:</td>
                <td>
                    <select name="profession">
                        <option>Developer</option>
                        <option>Designer</option>
                        <option>Manager</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align:center;">
                    <input type="submit" value="Register"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
