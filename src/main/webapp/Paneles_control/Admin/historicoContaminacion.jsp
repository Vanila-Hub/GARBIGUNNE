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
				<li><a href="/Garbigune_reto/VerMateriales" class="nav-link ">
						MATERIALES <i class="bi bi-tree-fill"></i>
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
				<li><a href="/Garbigune_reto/VerVentas" class="nav-link">
						VENTAS <i class="bi bi-handbag-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerHistorico "
					class="nav-link active"> HISTORICO <i class="bi bi-graph-up"></i>
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
				<li><a href="/Garbigune_reto/VerMateriales" class="nav-link ">
						<i class="bi bi-tree-fill"></i>
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
				<li><a href="/Garbigune_reto/VerHistorico"
					class="nav-link active"> <i class="bi bi-graph-up"></i>
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
							<p>Historico Borrado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='updated'}">
						<div class="alert alert-primary fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Historico Actualizado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
					<c:when test="${msg=='created'}">
						<div class="alert alert-success fade show test" role="alert">
							<i class="bi bi-check-circle"></i>
							<p>Historico Creado</p>
							<button type="button" class="btn-close" data-bs-dismiss="alert"
								aria-label="Close"></button>
						</div>
					</c:when>
				</c:choose>
				<a href="/Garbigune_reto/VerHistorico" class="btn btn-flex plus">
					Actualizar <i class="bi bi-arrow-clockwise"></i>
				</a>
				<button type="button" class="btn btn-flex plus"
					data-bs-toggle="modal" data-bs-target="#exampleModal">
					Crear <i class="bi bi-plus-lg"></i>
				</button>
				<div class="d-none">
					<canvas id="myChart"></canvas>
				</div>
				<table class="table table-design">

					<thead>
						<tr>
							<th scope="col">ID Historico</th>
							<th scope="col">Mes</th>
							<th scope="col">Planta</th>
							<th scope="col">Material</th>
							<th scope="col">Porcentaje de Contaminacion</th>
							<th scope="col">Opciones</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<c:forEach items="${historicoEmisiones}" var="historicoEmision">
							<tr>
								<th scope="row">${historicoEmision.id_Historico}</th>
								<td>${historicoEmision.fecha}</td>
								<td><a
									href="/Garbigune_reto/editarPlanta?id=${historicoEmision.id_Planta}">${historicoEmision.getPlanta().nombre}</a></td>
								<td><a
									href="/Garbigune_reto/editarMaterial?id_material=${historicoEmision.id_Material}">${historicoEmision.getMaterial().tipo}</a></td>
								<td>${historicoEmision.porcentajeContaminacion}</td>
								<td><a
									href="/Garbigune_reto/borrarHistorico?id=${historicoEmision.id_Historico}"
									class="btn btn-flex trash"> <i
										class="bi bi-trash text-light fs-5 text-info"></i>
								</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
	</div>
	</main>


	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">GARBIGUNNE
						SA</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<form action="/Garbigune_reto/crearHistorico" method="post">
						<div class="mb-3">
							<label for="month" class="form-label">Mes</label> <input
								type="month" id="month" name="mes" class="form-control">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary" id="liveToastBtn">Crear</button>
						</div>
					</form>
				</div>
			</div>
		</div>
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
								<i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>N� DE
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
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
	</script>
	<!--         <script>
            const xValues = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
            const tipos_values = document.querySelectorAll('.tipo');
            console.log(tipos_values[1].defaultValue)
            new Chart("myChart", {
                type: "line",
                data: {
                    labels: xValues,
                    datasets: [{ 
                        data: [
                        	10, 20, 10, 20,23
                        ],
                        borderColor: "red",
                        fill: false
                    }, { 
                        data: [10, 20, 10, 20,2],
                        borderColor: "green",
                        fill: false
                    }]
                },
                options: {
                    legend: { display: false }
                }
            });
        </script> -->
</body>

</html>