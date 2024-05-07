<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon"
	href="Paneles_control/Admin/img/logo_garbigunne.png"
	type="image/x-icon">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sidebars/">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link rel="stylesheet"
	href="Paneles_control/clienteProducto/estilos.css">
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid ">
				<a class="navbar-brand d-flex flex-row justify-between" href="/Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Paneles_control/clienteProducto/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
				<div class="peca">
					<a href="/Garbigune_reto/EditarPerfil?id_cliente=${id_cliente}"><i class="bi bi-person-circle"></i></a>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="contenedor">
			<div class="b-example-divider b-example-vr"></div>
			<div class="b-example-divider b-example-vr"></div>
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="divIMG">
							<img src="${producto.ruta_imagen}" class="card-img-top"
								alt="{producto.ruta_imagen}">
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-6">
						<div class="card-body">
							<h5 class="card-title">${producto.nombre}</h5>
							<p class="card-text">${producto.descripcion}</p>
							<h5>${producto.precio}$</h5>
							<hr>
							<button type="button" class="btn btn-flex" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Pagar</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</main>
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-content rounded-3 shadow">
					<div class="modal-body p-4 text-center">
						<h5 class="mb-0">Desea Realizar el Pago?</h5>
						<p class="mb-0">El dinero no es es reembolsable</p>
					</div>
					<div class="modal-footer flex-nowrap p-0">
						<button type="button"
							class="btn btn-lg btn-link fs-6 text-decoration-none col-6 py-3 m-0 rounded-0 border-end">
							<a href="/Garbigune_reto/Pagar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"><h6>Si, deseo Realizar el pago</h6></a>
						</button>
						<button type="button"
							class="btn btn-lg btn-link fs-6 text-decoration-none col-6 py-3 m-0 rounded-0"
							data-bs-dismiss="modal">
							<a href="/Garbigune_reto/VerPaginaProductos?id_cliente=${id_cliente}">Cancelar Pago</a>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script src="sidebars.js"></script>
</body>

</html>