<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->

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
<link rel="stylesheet" href="Paneles_control/Admin/estilos_Admin.css">
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid">
				<a class="navbar-brand" href="Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Paneles_control/Admin/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
			</div>
		</nav>
	</header>
	<div class="contenedor">
		<main class="row">
			<div class="b-example-divider b-example-vr"></div>
			<div class="col w-50 mt-5">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<h1 class="modal-title fs-5" id="exampleModalLabel">Editar
								venta</h1>
						</div>
						<div class="modal-body">
							<form action="/Garbigune_reto/updateVenta" method="post">
								<input type="text" class="form-control d-none" name="id_venta"
									value="${id_venta}">

								<div class="mb-3">
									<label for="exampleInput" class="form-label"> cliente</label> <select
										class="form-select" aria-label="Default select example"
										name="id_cliente">
										<option selected>Clientes</option>
										<c:forEach items="${clientes}" var="cliente">
											<c:choose>
												<c:when test="${cliente.id_cliente== id_Cliente}">
													<option value="${cliente.id_cliente}" selected>
														${cliente.nombre}</option>
												</c:when>
												<c:otherwise>
													<option value="${cliente.id_cliente}">
														${cliente.nombre}</option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</select>
								</div>

								<div class="mb-3">
									<label for="exampleInput" class="form-label"> Producto</label>
									<select class="form-select" aria-label="Default select example"
										name="id_producto">
										<option selected>Productos</option>
										<c:forEach items="${productos}" var="producto">
											<c:choose>
												<c:when test="${producto.id_producto==id_producto}">
													<option value="${producto.id_producto}" selected>
														${cliente.nombre}</option>
												</c:when>
												<c:otherwise>
													<option value="${producto.id_producto}">
														${producto.nombre}</option>
												</c:otherwise>
											</c:choose>

										</c:forEach>
									</select>
								</div>
								<div class="mb-3">
									<label for="exampleInput" class="form-label">Cantidad</label> <input
										type="text" class="form-control" name="cantidad"
										value="${Cantidad}">
								</div>
								<div class="mb-3">
									<label for="exampleInput" class="form-label">Fecha</label> <input
										type="text" class="form-control" name="fecha" value="${fecha}">
								</div>
								<div class="flex-row flex-wrap align-items-start">
									<button type="button" class="btn btn-secondary"
										data-bs-dismiss="modal">
										<a href="/Garbigune_reto/VerVentas" class="">Cancelar</a>
									</button>
									<button type="submit" class="btn btn-primary" id="liveToastBtn">Actualizar</button>
							</form>
						</div>
					</div>
				</div>
			</div>
	</div>
	</main>
	<div class="b-example-divider b-example-vr"></div>
	</div>

	<footer
		class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
		<div class="container">
			<footer class="py-3 my-4">
				<ul class="nav justify-content-center border-bottom pb-3 mb-3">
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-body-secondary">Home</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-body-secondary">Features</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-body-secondary">Pricing</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-body-secondary">FAQs</a></li>
					<li class="nav-item"><a href="#"
						class="nav-link px-2 text-body-secondary">About</a></li>
				</ul>
				<p class="text-center text-body-secondary">2024 Company, Inc</p>
			</footer>
		</div>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script src="sidebars.js"></script>
</body>

</html>