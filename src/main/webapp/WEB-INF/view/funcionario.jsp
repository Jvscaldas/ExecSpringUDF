<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href='<c:url value="./resources/css/styles.css" />'>
<title>Funcionários</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp" />
	</div>
	<br />
	<br />
	<div align="center">
		<form action="funcionario" method="post">
			<table>
				<tr>
					<td>
						<input type="submit" id="botao" name="botao" value="Funcionario">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<br />
	<br />
	<div align="center">
		<c:if test="${not empty erro }">
			<H2><c:out value="${erro }" /></H2>>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty funcionarios }">
			<table class="table_round">
				<thead>
					<tr>
						<th>Nome Func</th>
						<th>Nome Dep</th>
						<th>Salario Func</th>
						<th>Salario Dep</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="f" items="${funcionarios }">
						<tr>
							<td><c:out value="${f.nome_funcionario }" /></td>
							<td><c:out value="${f.nome_dependente }" /></td>
							<td><c:out value="${f.salario_funcionario }" /></td>
							<td><c:out value="${al.salario_dependente }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</html>