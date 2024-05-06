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
				<a class="navbar-brand d-flex flex-row justify-between" href="#">
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
		<c:choose>
			<c:when test="${msg=='compra_realizada'}">
				<div class="alert alert-success" role="alert">Compra Realizada
					Exitosamente</div>
			</c:when>
		</c:choose>
		<div class="contenedor">
			<div class="b-example-divider b-example-vr"></div>
			<div class="b-example-divider b-example-vr"></div>
			<div class="container">
				<div class="row">
					<c:forEach items="${productos}" var="producto">
						<div class="col-sm-12 col-md-6 col-lg-3">
							<div class="card" id="card">
								<img src="${producto.ruta_imagen}" class="card-img-top"
									alt="{producto.ruta_imagen}">
								<div class="card-body">
									<h5 class="card-title">${producto.nombre}</h5>
									<p class="card-text">${producto.descripcion}</p>
									<h5>${producto.precio}$</h5>
									<hr>
									<a
										href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
										class="btn btn-flex">COMPRAR</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</main>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script src="sidebars.js"></script>
</body>

</html>