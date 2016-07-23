<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GC Pics</title>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/semantic.min.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/styles.css"/>">
<script src="<c:url value="/semantic.min.js"/>"></script>
</head>
<body>
	<div class="ui container main">

		<h1 class="header">Hmm Images...</h1>

		<div class="ui divided items segment">
			<c:forEach items="${pics}" var="pic">
				<div class="item">
					<a class="ui small image" href="<c:out value="${pic.url}"/>"> <img
						src="<c:out value="${pic.url}"/>">
					</a>
					<div class="content">
						<div class="header">
							<span><c:out value="${pic.description}" /></span>
						</div>
						<div class="extra">
							<label>By: </label> <span class="user"><c:out
									value="${pic.userDisplay}" /></span>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>

		<form class="ui form segment" action="<c:url value="/pics/add.html"/>"
			method="post">
			<h4 class="header">Add Image</h4>
			<div class="two fields">
				<div class="field">
					<label>Image URL</label> <input name="url" />
				</div>
				<div class="field">
					<label>Brief Description</label> <input name="description" />
				</div>
			</div>
			<input class="ui button" type="submit" value="Add It!" />

			<c:if test="${empty user}">
				<div class="ui dimmer active">
					<div class="content">
						<div class="center">
							<h2 class="header">
								You need to <a href="<c:url value="/login.html"/>">log in</a> to
								add an image.
							</h2>
						</div>
					</div>
				</div>
			</c:if>
		</form>
	</div>
</body>
</html>
