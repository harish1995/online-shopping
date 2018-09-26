<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping- ${title}</title>

<script>
	window.menu = '${title}';
	window.contextRoot ='${contextRoot}'
</script>

<!-- Bootstrap core CSS -->
<link href="${css1}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap cerulean them CSS -->
 <link href="${css}/bootstrap-cerulean-them.css" rel="stylesheet">


<!-- Bootstrap dataTable theme -->
<link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">


		<!--Here Comes Navigation bar -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- home content comes here -->
		<div class="content">
			<!-- loading the home content -->

			<c:if test="${userClickHome==true}">
				<%@include file="home.jsp"%>
			</c:if>


			<!-- load only when user clicks product -->
			<c:if test="${userClickProducts==true}">
				<%@include file="product.jsp"%>
			</c:if>


			<!-- load only when user clicks repairing -->
			<c:if test="${userClickRepairing==true}">
				<%@include file="repairing.jsp"%>
			</c:if>

			<!-- load only when user clicks repairing -->
			<c:if test="${userClickContact==true}">
				<%@include file="contact.jsp"%>
			</c:if>


			<!-- load only when user clicks about -->
			<c:if test="${userClickAbout==true}">
				<%@include file="about.jsp"%>
			</c:if>



			<!-- load only when user clicks about -->
			<c:if
				test="${userClickAllProducts==true or userClickCategoryProducts ==true}">
				<%@include file="listProducts.jsp"%>
			</c:if>


		</div>

		<!-- footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		<!-- JQuery -->
		<script src="${js}/jquery.js"></script>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>

		<!-- DataTable  Plugin-->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- DataTable  bootstrap script-->
		<script src="${js}/dataTables.bootstrap4.js"></script>

		<!-- self coded java script -->
		<script src="${js}/myapp.js"></script>

	</div>

</body>

</html>
