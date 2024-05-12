<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="controlador.clientes.CrearClientes"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="./img/logo_garbigunne.png"
	type="image/x-icon">
<link rel="stylesheet" href="Registrar/estilos.css">
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
						<img src="Registrar/img/logo_garbigunne.png" alt="logo"
							class="logo">
					</div>
				</a>
			</div>
		</nav>
	</header>
	<main>
		<div class="contenedor">
			<form action="/Garbigune_reto/registrarse" method="post">
				<div class="mb-3">
					<label for="exampleInput" class="form-label">Nombre</label> <input
						type="text" class="form-control" id="exampleInput" name="nombre">
				</div>
				<div class="mb-3">
					<label for="exampleInput" class="form-label">Apellido</label> <input
						type="text" class="form-control" id="exampleInput" name="apellido">
				</div>
				<div class="mb-3">
					<label for="exampleInput" class="form-label">Usuario</label> <input
						type="email" class="form-control" id="exampleInput" name="usuario">
				</div>
				<div class="mb-3">
					<label for="exampleInput" class="form-label">Contraseña</label> <input
						type="password" class="form-control" id="exampleInput"
						name="contrasena">
				</div>
				<button type="submit" class="btn btn-secondary">Crear
					Usuario</button>
				<button type="button" class="btn btn-primary">
					<a href="http://localhost:8080/Garbigune_reto/Login">Ya tengo Cuenta</a>
				</button>
			</form>
		</div>
	</main>
	<footer
		class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
		<div class="container">
			<footer class="py-3 my-4 d-flex justify-content-around row">
				<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
					<h5 class="text-uppercase mb-4">CONTACTO</h5>
					<ul class="list-unstyled">
						<li><p>
								<i class="fas fa-map-marker-alt pe-6 col-md-6 col-lg-6"></i>DIRECCION:
								Berio Kalea, Guipuzcoa
							</p></li>
						<li><p>
								<i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>Nº DE
								TELEFONO: 943 04 33 12
							</p></li>
						<li><p>
								<i class="fas fa-envelope pe-6 mb-0 col-md-6 col-lg-6"></i>CORREO:
								garbigunne@gmail.com
							</p></li>
					</ul>

				</div>
				<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
					<h5 class="text-uppercase mb-4">REDES SOCIALES</h5>
					<ul class="list-unstyled">
						<li><p>
								<i class="fas fa-map-marker-alt pe-6 col-md-6 col-lg-6"></i>INSTAGRAM:
								@garbigunneSL
							</p></li>
						<li><p>
								<i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>YOUTUBE:
								@garbigunneSL
							</p></li>
						<li><p>
								<i class="fas fa-envelope pe-6 mb-0 col-md-6 col-lg-6"></i>TIKTOK:
								@garbigunneSL
							</p></li>
					</ul>
				</div>

			</footer>
		</div>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>

</html>