<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pavan.bean.Employee" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<% 
List<Employee> emp = (List<Employee>)request.getAttribute("emp"); 
if(emp !=null){
for(Employee em: emp){
%>
<tr>
    <td><%=em.getEmpNo()%></td>
    <td><%=em.geteName()%></td>
    <td><%=em.getJob()%></td>
 
   </tr>
<%}} %>
</table>
Employee details!!
</body>
</html>