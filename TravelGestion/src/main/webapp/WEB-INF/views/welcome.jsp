<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listes des articles</title>
</head>
<body>
	<h1>Liste des articles</h1>
	<c:forEach items="${ voyages }" var="voyage">
		<div title="${voyage.idVoyage }">
			<h2>${voyage.typeVoyage }</h2>
			<p>${voyage.description }</p>
		</div>
	</c:forEach>
</body>
</html>	


<!-- 	private Integer idVoyage; -->
<!-- 	private String typeVoyage; -->
<!-- 	private Integer budget; -->
<!-- 	private String description; -->
<!-- 	private String dateDepart; -->
<!-- 	private String dateRetour; -->