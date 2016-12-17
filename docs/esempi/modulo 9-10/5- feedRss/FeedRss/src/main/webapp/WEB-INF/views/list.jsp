<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>News from db</title>
</head>
<body>
	
	
	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #66ff66;
		}
	</style>
	<h2>News from db</h2>
<table>
		<tr>
			<td>TITLE</td><td>SUBTITLE</td><td>PUBLISH DATE</td><td>CREATOR</td><td></td>
		</tr>
		<c:forEach items="${feedMessage}" var="news"> 
			<tr>
			<td>${news.title}"</td>
			<td>${news.subTitle}</td>
			<td>${news.pubDate}</td>
			<td>${news.creator}</td>
			
			
			</tr>
		</c:forEach>
	</table>
</body>
</html>