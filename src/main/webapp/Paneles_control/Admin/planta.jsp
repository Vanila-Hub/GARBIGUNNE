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
				<li><a href="/Garbigune_reto/VerPlantas"
					class="nav-link active"> PLANTAS <i
						class="bi bi-house-gear-fill"></i>
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
				<li><a href="/Garbigune_reto/VerVentas" class="nav-link ">
						VENTAS <i class="bi bi-handbag-fill"></i>
				</a></li>
				<li><a href="/Garbigune_reto/VerHistorico" class="nav-link">
						HISTORICO <i class="bi bi-graph-up"></i>
				</a></li>
			</ul>
			<hr>

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
				<li><a href="/Garbigune_reto/VerPlantas"
					class="nav-link active"> <i class="bi bi-house-gear-fill"></i>
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
				<li><a href="/Garbigune_reto/VerHistorico" class="nav-link">
						<i class="bi bi-graph-up"></i>
				</a></li>
			</ul>
		</div>

		<main class="row mb-5">


			<div class="b-example-divider b-example-vr"></div>
			<div class="table-responsive">
				<table class="table table-design">
					<c:choose>
						<c:when test="${msg=='deleted'}">
							<div class="alert alert-danger fade show test" role="alert">
								<i class="bi bi-check-circle"></i>
								<p>Planta Borrada</p>
								<button type="button" class="btn-close" data-bs-dismiss="alert"
									aria-label="Close"></button>
							</div>
						</c:when>
						<c:when test="${msg=='updated'}">
							<div class="alert alert-primary fade show test" role="alert">
								<i class="bi bi-check-circle"></i>
								<p>Planta Actualizada</p>
								<button type="button" class="btn-close" data-bs-dismiss="alert"
									aria-label="Close"></button>
							</div>
						</c:when>
						<c:when test="${msg=='created'}">
							<div class="alert alert-success fade show test" role="alert">
								<i class="bi bi-check-circle"></i>
								<p>Planta Creada</p>
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
					</c:choose>
					<button type="button" class="btn btn-flex plus"
						data-bs-toggle="modal" data-bs-target="#exampleModal1">
						Crear <i class="bi bi-plus-lg"></i>
					</button>
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Nombre</th>
							<th scope="col">Direccion</th>
							<th scope="col">Telefono</th>
							<th scope="col">Opciones</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<c:forEach items="${plantas}" var="planta">
							<tr>
								<th scope="row">${planta.id}</th>
								<td>${planta.nombre}</td>
								<td>${planta.direccion}</td>
								<td>${planta.telefono}</td>
								<td class="d-flex flex-wrap justify-content-evenly w-2">
									<div class="btn-group" role="group" aria-label="Basic example">
										<button type="button" class="btn btn-flex"
											data-bs-toggle="modal" data-bs-target="#exampleModal"
											data-bs-whatever="@mdo"
											onclick="getMateriales('${planta.id}')">
											<i class="bi bi-eye fs-5 text-light"></i>
										</button>

										<button type="button" class="btn btn-flex"
											data-bs-toggle="modal">
											<a href="/Garbigune_reto/editarPlanta?id=${planta.id}"><i
												class="bi bi-pencil-square fs-5 text-light"></i></a>
										</button>
										<a href="/Garbigune_reto/borrarPlanta?id=${planta.id}"
											class="btn btn-flex trash"> <i
											class="bi bi-trash text-light fs-5 text-info"></i>
										</a>
									</div>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="modal fade" id="exampleModal1" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h1 class="modal-title fs-5">Crear Planta</h1>
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>
							<div class="modal-body">
								<form action="/Garbigune_reto/crearPlanta" method="post">
									<input type="text" class="form-control d-none" name="opcion"
										value="planta">
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Nombre</label> <input
											type="text" class="form-control" id="exampleInput"
											aria-describedby="emailHelp" name="nombre">
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Direccion</label>
										<input type="text" class="form-control" id="exampleInput"
											name="direccion">
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Numero de
											telefono</label> <input type="tel" class="form-control" id="phone"
											name="telefono" placeholder="611445678"
											pattern="[0-9]{3}[0-9]{3}[0-9]{3}" required>
									</div>

									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Cancelar</button>
										<button type="submit" class="btn btn-primary"
											id="liveToastBtn">Crear</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="exampleModal" tabindex="-1"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog modal-dialog-scrollable planta_items carta">
					<div class="modal-content">
						<div class="modal-header">
							<h1 class="modal-title fs-5" id="exampleModalLabel">Productos</h1>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body">
							<div class="container">
								<div class="row gap-3" id="row">
									<div class="col-12 d-flex flex-row" id="card_body"></div>

								</div>
							</div>
						</div>
						<div class="modal-footer"></div>
					</div>
					<div class="modal-content">
						<div class="modal-header">
							<h1 class="modal-title fs-5" id="exampleModalLabel">Materiales</h1>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body row">
							<ul id="lista_materiales"
								class="d-flex flex-column gap-3 align-items-stretch"></ul>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">Cerar</button>
						</div>
					</div>

					<div class="modal-content">
						<div class="modal-header">
							<h1 class="modal-title fs-5">Datos de la Planta</h1>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body">
							<input type="text" class="form-control d-none" name="opcion"
								value="planta">
							<div class="mb-3">
								<label for="exampleInput" class="form-label">Nombre</label> <input
									type="text" class="form-control" id="nombre"
									aria-describedby="emailHelp" name="nombre" disabled>
							</div>
							<div class="mb-3">
								<label for="exampleInput" class="form-label">Direccion</label> <input
									type="text" class="form-control" id="direccion"
									name="direccion" disabled>
							</div>
							<div class="mb-3">
								<label for="exampleInput" class="form-label">Numero de
									telefono</label> <input type="text" class="form-control" id="telefono"
									name="telefono" disabled>
							</div>
						</div>
					</div>
				</div>
			</div>
	</div>


	</form>
	</div>
	</div>
	</div>
	</div>
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
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<script>
		function getMateriales(id_planta) {
			// Hacer una solicitud AJAX para obtener los datos de las plantas
			var listaMateriales = document.getElementById("lista_materiales");
			listaMateriales.innerHTML = "";

			var xhr = new XMLHttpRequest();
			xhr.open("GET", "/Garbigune_reto/PlantaMateriales?id_planta="
					+ id_planta, true);
			xhr.setRequestHeader("Content-Type", "application/json");

			xhr.onreadystatechange = function() {
				if (xhr.readyState === 4 && xhr.status === 200) {
					// Convertir la respuesta JSON en un array de objetos
					var materiales = JSON.parse(xhr.responseText);

					materiales.forEach(function(material) {
						var listItem = document.createElement("li");
						listItem.textContent = material.tipo;

						var button = document.createElement("button");
						button.type = "button";
						switch (material.tipo) {
							case "vidrio":
								button.className = "btn btn-flex d-flex flex-column vidrio";
								break;
							case "papel":
								button.className = "btn btn-flex d-flex flex-column papel";
								break;
							case "carton":
								button.className = "btn btn-flex d-flex flex-column carton";
								break;
							case "metal":
								button.className = "btn btn-flex d-flex flex-column metal";
								break;
							case "Madera":
								button.className = "btn btn-flex d-flex flex-column madera";
								break;
							case "plastico":
								button.className = "btn btn-flex d-flex flex-column plastico";
								break;
							default:
									button.className = "btn btn-flex d-flex flex-column plus ";
								break;
						}

						button.textContent = material.tipo;

						var span = document.createElement("span");
						span.className = "badge text-bg-secondary";
						span.textContent = material.emision_kg + "kg";

						button.appendChild(span);

						// Agregar el bot�n al contenedor
						listaMateriales.appendChild(button);
						//console.log(material);
					});
				}
			};
			getProductos(id_planta);
			xhr.send();
		}
		function getProductos(id_planta) {
			var listaProductos = document.getElementById('row');
			listaProductos.innerHTML = "";

			var xhr = new XMLHttpRequest();
			xhr.open("GET", "/Garbigune_reto/PlantaProductos?id_planta="
					+ id_planta, true);
			xhr.setRequestHeader("Content-Type", "application/json");

			xhr.onreadystatechange = function() {
				if (xhr.readyState === 4 && xhr.status === 200) {
					// Convertir la respuesta JSON en un array de objetos
					var Productos = JSON.parse(xhr.responseText);

					Productos.forEach(function(producto) {
						var cardBody = document.createElement("div");
						cardBody.className = "col-12 d-flex flex-row gap-3";
						cardBody.id = "card_body";

						var card = document.createElement("div");
						card.className = "card";
						card.id = "card";
						// Crear el elemento <img> y establecer su atributo src
						var img = document.createElement("img");
						img.src = producto.ruta_imagen;
						img.className = "card-img-top";
						img.alt = producto.ruta_imagen;

						// Crear elementos para el título, descripción, precio y hr
						var title = document.createElement("h5");
						title.className = "card-title";
						title.textContent = producto.nombre;

						var description = document.createElement("p");
						description.className = "card-text";
						description.textContent = producto.descripcion;

						var price = document.createElement("strong");
						price.className = "text";
						price.textContent = producto.precio + "$";

						var material = document.createElement("strong");
						price.className = "text";
						price.textContent = "Material: " + producto.material.tipo;

						var hr = document.createElement("hr");

						// Adjuntar los elementos al contenedor
						card.appendChild(img);
						card.appendChild(title);
						card.appendChild(description);
						card.appendChild(price);
						card.appendChild(hr);
						card.appendChild(material);

						cardBody.append(card);
						listaProductos.append(cardBody);

						//seteamos card de datos dela planta
						let nombre = document.getElementById('nombre');
						let dirrecion = document.getElementById('direccion');
						let telefono = document.getElementById('telefono');

						console.log(telefono);
						nombre.value="";
						dirrecion.value="";
						telefono.value = "";

						nombre.value=producto.planta.nombre;
						dirrecion.value=producto.planta.direccion;
						telefono.value = producto.planta.telefono;
						console.log(producto);
					});
				}
			};
			xhr.send();
		}
	</script>
</body>

</html>