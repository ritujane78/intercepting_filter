<%--
  Created by IntelliJ IDEA.
  User: rituj
  Date: 22-09-2026
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Student Details</title>
</head>
<body>
<jsp:useBean id="studentDetails" type="com.jane.servletdemo.frontcontroller.StudentVO" scope="request" />
  Student ID: <jsp:getProperty name="studentDetails" property="id" />
  Student Name: <jsp:getProperty name="studentDetails" property="name"/>
</body>
</html>
