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
<link rel="stylesheet" href="Paneles_control/Admin/estilos_Admin.css">
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid">
				<a class="navbar-brand" href="/Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Paneles_control/Admin/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
			<a href="/Garbigune_reto/Login" class="btn btn-flex trash plus">Cerrar sesion <i class="bi bi-box-arrow-in-right"></i></a>
			</div>
		</nav>
	</header>
	<div class="contenedor">
		<div class="sidebar aside">
			<a href="/Garbigune_reto/home"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-decoration-none">
			</a>
			<hr>
			<ul class="nav nav-pills flex-column mb-auto">
				<li class="nav-item"><a href="/Garbigune_reto/VerProveedores"
					class="nav-link" aria-current="page"> PROVEEDORES <i
						class="bi bi-truck-flatbed"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerPlantas" class="nav-link">
						PLANTAS <i class="bi bi-house-gear-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerSuministros" class="nav-link">
						SUMINISTROS <i class="bi bi-diagram-3-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerMateriales"
					class="nav-link active"> MATERIALES <i class="bi bi-tree-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerProductos" class="nav-link">
						PRODUCTOS <i class="bi bi-box-seam-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerEmisiones" class="nav-link">
						EMISIONES DE PRODUCTOS <i class="bi bi-fire"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerClientes" class="nav-link ">
						USUARIOS <i class="bi bi-people-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerVentas" class="nav-link ">
						VENTAS <i class="bi bi-handbag-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerHistorico" class="nav-link">
						HISTORICO <i class="bi bi-graph-up"></i>
				</a></li>
			</ul>
			<hr>
		</div>

		<div class="d-flex flex-column flex-shrink-0 bg-body-tertiary"
			style="width: 4.5rem;">
			<a href="/"
				class="d-block p-3 link-body-emphasis text-decoration-none"
				data-bs-toggle="tooltip" data-bs-placement="right"
				data-bs-original-title="Icon-only"> <svg class="bi pe-none"
					width="40" height="32">
					<use xlink:href="#bootstrap"></use></svg> <span class="visually-hidden">Icon-only</span>
			</a>
			<ul class="nav nav-pills nav-flush flex-column mb-auto text-center">
				<li class="nav-item"><a href="/Garbigune_reto/VerProveedores"
					class="nav-link" aria-current="page"> <i
						class="bi bi-truck-flatbed"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerPlantas" class="nav-link">
						<i class="bi bi-house-gear-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerSuministros" class="nav-link">
						<i class="bi bi-diagram-3-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerMateriales"
					class="nav-link active"> <i class="bi bi-tree-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerProductos" class="nav-link">
						<i class="bi bi-box-seam-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerEmisiones" class="nav-link">
						<i class="bi bi-fire"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerClientes" class="nav-link ">
						<i class="bi bi-people-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerVentas" class="nav-link ">
						<i class="bi bi-handbag-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerHistorico" class="nav-link">
						<i class="bi bi-graph-up"></i>
				</a></li>
			</ul>
		</div>

		<main class="row mb-5">

			<div class="b-example-divider b-example-vr"></div>
			<div class="table-responsive">
				<c:choose>
					<c:when test="${msg=='deleted'}">
						<div class="alert alert-danger fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Material Borrado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='updated'}">
						<div class="alert alert-primary fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Material Actualizado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='created'}">
						<div class="alert alert-success fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Material Creado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='no_valid_data'}">
						<div class="alert alert-warning fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Tienes campos sin rellenar</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='integrity_error'}">
						<div class="alert alert-warning fade show test" role="alert">
							<p>No se puede eliminar este material porque hay suministros asociados.</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
				</c:choose>
				<table class="table table-design">
					<button type="button" class="btn btn-flex plus"
						data-bs-toggle="modal" data-bs-target="#exampleModal">
						Crear <i class="bi bi-plus-lg"></i>
					</button>
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Tipo</th>
							<th scope="col">Emision/KG</th>
							<th scope="col">Opciones</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<c:forEach items="${materiales}" var="material">
							<tr>
								<th scope="row">${material.id_material}</th>
								<td>${material.tipo}</td>
								<td>${material.emision_kg}</td>
								<td class="d-flex flex-wrap justify-content-evenly w-2">
									<div class="btn-group" role="group" aria-label="Basic example">
										<button type="button" class="btn btn-flex">
											<a
												href="/Garbigune_reto/editarMaterial?id_material=${material.id_material}">
												<i class="bi bi-pencil-square fs-5 text-light"></i>
											</a>
										</button>

										<a
											href="http://localhost:8080/Garbigune_reto/borrarMaterial?id=${material.id_material}"
											class="btn btn-flex trash"> <i
											class="bi bi-trash text-light fs-5 text-info"></i>
										</a>

									</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h1 class="modal-title fs-5" id="exampleModalLabel">Crear
									Material</h1>
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>
							<div class="modal-body">
								<form action="/Garbigune_reto/crearMaterial" method="post">
									<input type="text" class="form-control d-none" name="opcion"
										value="material">
									<div class="mb-3">
										<select class="form-select"
											aria-label="Default select example" name="material" required>
											<option selected>Tipo de material</option>
											<option value="plastico">Plastico</option>
											<option value="papel">Papel</option>
											<option value="vidrio">Vidrio</option>
											<option value="carton">Carton</option>
											<option value="metal">Metal</option>
											<option value="Madera">Madera</option>
										</select>
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Emison/kg</label>
										<input type="number" class="form-control" id="exampleInput"
											name="emision_kg" step="0.01" required>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Cancelar</button>
										<button type="submit" class="btn btn-primary"
											id="liveToastBtn">Crear</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>

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
	<script src="sidebars.js"></script>
</body>

</html>