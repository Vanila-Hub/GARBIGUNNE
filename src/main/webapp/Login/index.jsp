<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="Login/img/logo_garbigunne.png"
	type="image/x-icon">
<link rel="stylesheet" href="Login/estilos.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid">
				<a class="navbar-brand"
					href="http://localhost:8080/Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Login/img/logo_garbigunne.png" alt="logo" class="logo">
					</div>
				</a>
			</div>
		</nav>
	</header>
	<main>
		<div class="contenedor">
		<c:choose>
		<c:when test="${msg == 'no_data_found'}">
		<div class="alert alert-danger" role="alert">El usuario no existe</div>
		</c:when>
		<c:when test="${msg == 'wrong_passwd'}">
		<div class="alert alert-danger" role="alert">Contraseña o correo incorrectos</div>
		</c:when>
		</c:choose>
			<form action="/Garbigune_reto/acces" method="post">
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Correo</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="correo">
				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Contraseña</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1" name="contrasena">
				</div>
				<button type="submit" class="btn btn-primary">Iniciar
					Sesion</button>
				<button type="button" class="btn btn-secondary">
					<a href="/Garbigune_reto/registrarse"> Registrarse</a>
				</button>
			</form>
		</div>
	</main>
	<footer
		class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
		<div class="col-md-4 d-flex align-items-center">
			<a href="/"
				class="mb-3 me-2 mb-md-0 text-body-secondary text-decoration-none lh-1">
				<svg class="bi" width="30" height="24">
					<use xlink:href="#bootstrap"></use></svg>
			</a> <span class="mb-3 mb-md-0 text-body-secondary">© 2024 vanila</span>
		</div>

		<ul class="nav col-md-4 justify-content-end list-unstyled d-flex">
			<li class="ms-3"><a class="text-body-secondary" href="#"><i
					class="bi bi-threads-fill"></i></li>
			<li class="ms-3"><a class="text-body-secondary" href="#"><i
					class="bi bi-instagram"></i></a></li>
			<li class="ms-3"><a class="text-body-secondary" href="#"><i
					class="bi bi-whatsapp"></i></li>
		</ul>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>

</html>