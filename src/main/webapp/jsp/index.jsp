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
	  		<p class="lead">Favor indique adonde desea ir</p>
	  		<hr class="my-4">
		</div>
		<div class="text-center">
			<a href="/servicioturismo">Servicio Turismo</a>	|
			<a href="/serviciopremium">Servicio Premium</a>
				<form action="/logout" method="post">
					<input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }">
					<hr class="my-4">

					<button>Cerrar Sesion</button>
				</form>
		</div>

	</div>
</body>
</html>