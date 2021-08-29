<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Laser Airlines</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
<body class="login-body">
	<div class="container ">
		<div class="jumbotron">
	  		<h1 class="display-4">Bienvenido al sistema de servicio de LaserAirlines</h1>
	  		<p class="lead">Ya tienes accesos a servicios premiun. ¡Gracias por su preferencia</p>
	  		<hr class="my-4">
		</div>
		<div class="text-center">
			<a href="/">Volver</a>	
							<form action="/logout" method="post">
					<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
					<hr class="my-4">

					<button>Cerrar Sesion</button>
				</form>
		</div>

	</div>
</body>
</html>