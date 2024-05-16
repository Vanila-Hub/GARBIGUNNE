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
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="Paneles_control/clienteProducto/estilos.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid ">
				<a class="navbar-brand d-flex flex-row justify-between"
					href="/Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Paneles_control/clienteProducto/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
				<div class="peca d-flex flex-row gap-2 text-white">

					<button class="btn btn-flex dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false">
						<strong class="align-self-center">${nombre}</strong>
					</button>
					<ul class="dropdown-menu dropdown-menu-dark">
						<li><a class="dropdown-item"
							href="/Garbigune_reto/EditarPerfil?id_cliente=${id_cliente}">Editar
								Perfil</a></li>
						<li><a class="dropdown-item" href="/Garbigune_reto/home">Cerrar
								Sesion</a></li>
					</ul>
				</div>
			</div>
			<button type="button" class="btn btn-flex plus me-3"
				data-bs-toggle="modal" data-bs-target="#exampleModal">
				<i class="bi bi-bag-check-fill fs-4 position-relative"><span
					class="position-absolute top-4 start-100 translate-end badge rounded-pill bg-danger plus">
					${productosCliente.get(0).getComprasTotal()}
					</span></i>
			</button>
			<button class="btn btn-flex plus me-4" type="button"
				data-bs-toggle="offcanvas" data-bs-target="#demo">

				<i class="bi bi-cart4 fs-4 position-relative"><span
					class="position-absolute top-4 start-100 translate-end badge rounded-pill bg-danger plus">4</span></i>
			</button>

		</nav>
	</header>
	<main>
		<div class="offcanvas offcanvas-end" id="demo">
			<div class="offcanvas-header">
				<h1 class="offcanvas-title">Carrito de Compra</h1>
				<button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
			</div>
			<hr></hr>
			<div class="offcanvas-body">
				<!-- Modal -->

			</div>
		</div>
		<c:choose>
			<c:when test="${msg=='compra_realizada'}">
				<div class="alert alert-success fade show test" role="alert">
					<i class="bi bi-check-circle"></i>
					<p>Compra Realizada</p>
					<button type="button" class="btn-close" data-bs-dismiss="alert"
						aria-label="Close"></button>
				</div>
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
									<strong class="text">${producto.descripcion}</strong>
									<h5>${producto.precio}$</h5>
									<hr>
									<div class="btn-group shadow-lg bg-body-tertiary rounded" role="group" aria-label="Basic example">
										<a
											href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
											class="btn btn-flex"> Comprar <i class="bi bi-credit-card"></i></a>
										<a
											href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
											class="btn bg-warning text-white"> Añadir <i class="bi bi-cart-plus"></i></a>
									</div>

								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>

	</main>
	
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog  modal-dialog-scrollable modal-xl">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">Historial de Compras</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body row">
				<c:forEach items="${productosCliente}" var="producto">
						<div class="col-sm-12 col-md-6 col-lg-3">
							<div class="card" id="card">
								<img src="${producto.ruta_imagen}" class="card-img-top"
									alt="{producto.ruta_imagen}">
								<div class="card-body">
									<h5 class="card-title">${producto.nombre}</h5>
									<strong class="text">${producto.descripcion}</strong>
									<h5>${producto.precio}$</h5>
									<hr>
									<div class="btn-group shadow-lg bg-body-tertiary rounded" role="group" aria-label="Basic example">
										<a
											href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
											class="btn btn-flex">Volver a Comprar <i class="bi bi-credit-card"></i></a>
									</div>

								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Cerrar</button>
				</div>
			</div>
		</div>
	</div>
</body>

</html>