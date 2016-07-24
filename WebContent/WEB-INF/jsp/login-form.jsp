<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GC Pics</title>

<link rel="stylesheet" type="text/css"
	href="//cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.2/semantic.min.css">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/styles.css"/>">
<script src="//cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.2/semantic.min.js"></script>



<style type="text/css">
	body {
		background-color: #DADADA;
	}
	
	body > .grid {
		height: 100%;
	}
	
	.image {
		margin-top: -100px;
	}
	
	.column {
		max-width: 450px;
	}
</style>

</head>
<body>
	<div class="ui middle aligned center aligned grid">
		<div class="column">
			<h2 class="ui blue image header">
				<div class="content">Log-in to your account</div>
			</h2>
			<form class="ui large form <c:if test="${not empty errorMessage}">error</c:if>" method="post">
				<div class="ui stacked segment">
					<div class="field">
						<div class="ui left icon input">
							<i class="user icon"></i> <input type="text" name="login"
								placeholder="Login ID" value="<c:out value="${login}"/>">
						</div>
					</div>
					<div class="field">
						<div class="ui left icon input">
							<i class="lock icon"></i> <input type="password" name="password"
								placeholder="Password">
						</div>
					</div>
					<input type="submit" class="ui fluid large blue submit button"
						value="Login" />
				</div>

				<div class="ui error message"><c:out value="${errorMessage}"/></div>
			</form>

			<div class="ui message">
				New to us? <a href="#">Sign Up</a>
			</div>
		</div>
	</div>
</body>
</html>
