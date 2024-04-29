<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
				<a class="navbar-brand"
					href="http://localhost:8080/Garbigune_reto/home">
					<div class="imgDiv">
						<img src="Paneles_control/Admin/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
			</div>
		</nav>
	</header>
	<div class="contenedor">
		<div class="sidebar aside">
			<a href="/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-decoration-none">
				<strong class="fs-4">Gestores</strong>
			</a>
			<hr>
			<ul class="nav nav-pills flex-column mb-auto">
				<li class="nav-item"><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=proveedores"
					class="nav-link" aria-current="page"> PROVEEDORES </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=planta "
					class="nav-link "> PLANTAS </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=suministros"
					class="nav-link"> SUMINISTROS </a></li>
				<li><a
					href="/Garbigune_reto/VerMateriales"
					class="nav-link "> MATERIALES </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=productos"
					class="nav-link"> PRODUCTOS </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=emisiones"
					class="nav-link"> EMISIONES POR PRODUCTO </a></li>
				<li><a
					href="/Garbigune_reto/VerClientes"
					class="nav-link active"> CLIENTES </a></li>
				<li><a href="http://localhost:8080/Garbigune_reto/admin?peticion=venta" 
					 class="nav-link "> VENTAS </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=historico"
					class="nav-link "> HISTORICO </a></li>
				<li><a
					href="http://localhost:8080/Garbigune_reto/admin?peticion=roles"
					class="nav-link "> ROLES </a></li>
			</ul>
			<hr>
		</div>
		<main class="row">
			<div class="b-example-divider b-example-vr"></div>
			<div class="table-responsive">
				<table class="table table-design">
					<button type="button" class="btn btn-flex plus"
						data-bs-toggle="modal" data-bs-target="#exampleModal">
						Crear <i class="bi bi-plus-lg"></i>
					</button>
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Nombre</th>
							<th scope="col">Apellido</th>
							<th scope="col">Usuario</th>
							<th scope="col">Contrase�a</th>
							<th scope="col">Acciones</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<c:forEach items="${clientes}" var="cliente">
							<tr>
								<th scope="row">${cliente.id_cliente}</th>
								<td>${cliente.nombre}</td>
								<td>${cliente.apellido}</td>
								<td>${cliente.usuario}</td>
								<td>${cliente.contrasena}</td>
								<td class="d-flex flex-wrap justify-content-evenly w-2">
									<div class="btn-group" role="group" aria-label="Basic example">
										<button type="button" class="btn btn-flex"
											data-bs-toggle="modal" data-bs-target="#exampleModal">
											<i class="bi bi-eye fs-5 text-light"></i>
										</button>
										<button type="button" class="btn btn-flex">
											<a
												href="http://localhost:8080/Garbigune_reto/edit?opcion=cliente&id_cliente=${cliente.id_cliente}">
												<i class="bi bi-pencil-square fs-5 text-light"></i>
											</a>
										</button>

										<a
											href="http://localhost:8080/Garbigune_reto/borrar?opcion=cliente&id=${cliente.id_cliente}"
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
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>
							<div class="modal-body">
								<form action="http://localhost:8080/Garbigune_reto/create"
									method="post">
									<input type="text" class="form-control d-none" name="opcion"
										value="cliente">
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Nombre</label> <input
											type="text" class="form-control" id="exampleInput"
											name="nombre">
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Apellido</label>
										<input type="text" class="form-control" id="exampleInput"
											name="apellido">
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Usuario</label> <input
											type="email" class="form-control" id="exampleInput"
											name="usuario">
									</div>
									<div class="mb-3">
										<label for="exampleInput" class="form-label">Contrase�a</label>
										<input type="password" class="form-control" id="exampleInput"
											name="contrasena">
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
				<p class="text-center text-body-secondary">� 2024 Company, Inc</p>
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
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="Paneles_control/Admin/img/logo_garbigunne.png" type="image/x-icon">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">
    <link rel="stylesheet" href="Paneles_control/Admin/estilos_Admin.css">
    <title>GarbiGunne SL</title>
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="http://localhost:8080/Garbigune_reto/home">
                    <div class="imgDiv">
                        <img src="Paneles_control/Admin/img/logo_garbigunne.png" alt="logo" class="logo">
                    </div>
                </a>
            </div>
        </nav>
    </header>
    <div class="contenedor">
        <div class="sidebar aside">
            <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-decoration-none">
                <strong class="fs-4">Gestores</strong>
            </a>
            <hr>
            <ul class="nav nav-pills flex-column mb-auto">
                <li class="nav-item">
                    <a href="http://localhost:8080/Garbigune_reto/admin?peticion=proveedores" class="nav-link disabled" aria-current="page">
                        PROVEEDORES
                    </a>
                </li>
                <li>
                    <a href="http://localhost:8080/Garbigune_reto/admin?peticion=planta " class="nav-link ">
                        PLANTAS
                    </a>
                </li>
                <li>
                    <a href="Paneles_control/Admin/suministro.jsp" class="nav-link disabled">
                        SUMINISTROS
                    </a>
                </li>
                <li>
                    <a href="http://localhost:8080/Garbigune_reto/admin?peticion=materiales" class="nav-link ">
                        MATERIALES
                    </a>
                </li>
                <li>
                    <a href="Paneles_control/Admin/productos_Admin.jsp" class="nav-link disabled">
                        PRODUCTOS
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link disabled">
                        EMISIONES POR PRODUCTO
                    </a>
                </li>
                <li>
                    <a href="http://localhost:8080/Garbigune_reto/admin?peticion=cliente" class="nav-link active">
                        CLIENTES
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link disabled">
                        VENTAS
                    </a>
                </li>
            </ul>
            <hr>
            <div class="dropdown">
                <a href="#" class="d-flex align-items-center  text-decoration-none dropdown-toggle"
                    data-bs-toggle="dropdown" aria-expanded="false">
                    <img src="https://github.com/mdo.png" alt="" width="32" height="32" class="rounded-circle me-2">
                    <strong>granky</strong>
                </a>
                <ul class="dropdown-menu dropdown-menu-dark text-small shadow">
                    <li><a class="dropdown-item" href="#">Gestionar Roles</a></li>
                    <li><a class="dropdown-item" href="#">Perfil</a></li>
                    <li>
                        <hr class="dropdown-divider">
                    </li>
                    <li><a class="dropdown-item" href="#">Cerrar cesion</a></li>
                </ul>
            </div>
        </div>
        <main class="row">
            <div class="b-example-divider b-example-vr"></div>
            <div class="table-responsive">
                <table class="table table-design">
                    <button type="button" class="btn btn-flex plus" data-bs-toggle="modal"
                    data-bs-target="#exampleModal" ><i class="bi bi-plus-lg"> A�ADIR </i></button>
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Apellido</th>
                            <th scope="col">Usuario</th>
                            <th scope="col">Contrase�a</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody class="table-group-divider">
                    <c:forEach items = "${clientes}" var="cliente">
                        <tr>
                            <th scope="row">${cliente.id_cliente}</th>
                            <td>${cliente.nombre}</td>
                            <td>${cliente.apellido}</td>
                            <td>${cliente.usuario}</td>
                            <td>${cliente.contrasena}</td>
                            <td class="d-flex flex-wrap justify-content-evenly w-2">
                                <div class="btn-group" role="group" aria-label="Basic example">
                                    <button type="button" class="btn btn-flex" data-bs-toggle="modal"
                                        data-bs-target="#exampleModal"><i
                                            class="bi bi-eye fs-5 text-light"></i></button>
                                    <button type="button" class="btn btn-flex" data-bs-toggle="modal"
                                        data-bs-target="#exampleModal">
                                        <i class="bi bi-pencil-square fs-5 text-light"></i>
                                    </button>
                                    <button type="button" class="btn btn-flex trash">
                                        <a href="http://localhost:8080/Garbigune_reto/borrar?opcion=cliente&id=${cliente.id_cliente}"
                                                    class="btn btn-flex trash">
                                                    <i class="bi bi-trash text-light fs-5 text-info"></i>
                                                </a>
                                    </button>
                                </div>
                            </td>
                        </tr>
                   </c:forEach>
                    </tbody>
                </table>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                    aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="exampleModalLabel">Nombre</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                    aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="http://localhost:8080/Garbigune_reto/create" method = "post">
                                 <input type="text" class="form-control d-none" name="opcion" value="cliente">
                                 <div class="mb-3">
                                      <label for="exampleInput" class="form-label">Nombre</label>
                                      <input type="text" class="form-control" id="exampleInput" aria-describedby="emailHelp" name="nombre">
                                    </div>
                                    <div class="mb-3">
                                      <label for="exampleInput" class="form-label">Apellido</label>
                                      <input type="text" class="form-control" id="exampleInput" aria-describedby="emailHelp" name="apellido">
                                    </div>
                                    <div class="mb-3">
                                      <label for="exampleInput" class="form-label">Usuario</label>
                                      <input type="text" class="form-control" id="exampleInput" name="usuario">
                                    </div> 
                                    <div class="mb-3">
                                      <label for="exampleInput" class="form-label">Contrase�a</label>
                                      <input type="text" class="form-control" id="exampleInput" name="contrasena">
                                    </div> 
                                    <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary" id="liveToastBtn">Crear</button>
                            </div>
                                  </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>

    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
        <div class="container">
            <footer class="py-3 my-4">
                <ul class="nav justify-content-center border-bottom pb-3 mb-3">
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Home</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Features</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Pricing</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">FAQs</a></li>
                    <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">About</a></li>
                </ul>
                <p class="text-center text-body-secondary">� 2024 Company, Inc</p>
            </footer>
        </div>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    <script src="sidebars.js"></script>
</body>

</html>
 
>>>>>>> dd16184f8c625e5ac71b0659a1555c83d635e920
