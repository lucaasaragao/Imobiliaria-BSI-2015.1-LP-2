<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro</title>
</head>
<body>


<strong>${erro}</strong>

<form action="CadUsuario.bee" method="POST">
Nome: <input type="text" name="nome"/><br>
Login: <input type="text" name="login"/><br>
Senha: <input type="password" name="senha"/><br>

<input type="submit" value="VAI!">

</form>

Usuários cadastrados:

<table border="1">
	<tr>
	<td>Nome</td><td>Login</td>
	<c:forEach items="${usuarios}" var="usuario">
	<tr><td> ${usuario.nome}</td><td>${usuario.login } </td>
	<td><a href="EditarUsuario.bee?login=${usuario.login }">Editar</a>
	<td> del </td>
	</c:forEach></tr>

</table>

</body>
</html>