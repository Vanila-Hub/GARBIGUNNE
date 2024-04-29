<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="shortcut icon" href="Paneles_control/Admin/img/logo_garbigunne.png" type="image/x-icon">
            <link rel="stylesheet"
                href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                crossorigin="anonymous">
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
                    <a href="/Garbigune_reto/home" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-decoration-none">
                        <strong class="fs-4">Gestores</strong>
                    </a>
                    <hr>
                    <ul class="nav nav-pills flex-column mb-auto">
                        <li class="nav-item">
                            <a href="/Garbigune_reto/VerProveedores" class="nav-link active"
                                aria-current="page">
                                PROVEEDORES
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerPlantas" class="nav-link">
                                PLANTAS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerSuministros" class="nav-link">
                                SUMINISTROS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerMateriales" class="nav-link ">
                                MATERIALES
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerProductos" class="nav-link">
                                PRODUCTOS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerEmisiones" class="nav-link">
                                EMISIONES POR PRODUCTO
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerClientes" class="nav-link ">
                                USUARIOS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerVentas" class="nav-link ">
                                VENTAS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerHistorico" class="nav-link">
                                HISTORICO
                            </a>
                        </li>
                        
                    </ul>
                    <hr>
                    
                </div>
                <main class="row">
                    <div class="b-example-divider b-example-vr"></div>
                    <div class="table-responsive">
                        <table class="table table-design">
                            <button type="button" class="btn btn-flex plus" data-bs-toggle="modal"
                                data-bs-target="#exampleModal">Crear  <i class="bi bi-plus-lg"></i></button>
                            <thead>
                                <tr>
                                    <th scope="col">id</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Correo</th>
                                    <th scope="col">contrase�a</th>
                                    <th scope="col">Opciones</th>
                                </tr>
                            </thead>
                            <tbody class="table-group-divider">
                                <c:forEach items="${proveedores}" var="proveedor">
                                    <tr>
                                        <th scope="row">${proveedor.id_proveedor}</th>
                                        <td>${proveedor.nombre}</td>
                                        <td>${proveedor.correo}</td>
                                        <td>${proveedor.contrase�a}</td>
                                        <td class="d-flex flex-wrap justify-content-evenly w-2">
                                            <div class="btn-group" role="group" aria-label="Basic example">
                                                <button type="button" class="btn btn-flex" data-bs-toggle="modal">
                                                    <a href="/Garbigune_reto/editarProveedor?id_proveedor=${proveedor.id_proveedor}"><i class="bi bi-pencil-square fs-5 text-light"></i></a>
                                                </button>
                                                <a href="/Garbigune_reto/borrarProveedor?id_proveedor=${proveedor.id_proveedor}"
                                                    class="btn btn-flex trash">
                                                    <i class="bi bi-trash text-light fs-5 text-info"></i>
                                                </a>
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
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">GARBIGUNNE SA</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="/Garbigune_reto/crearProveedor" method="post">
                                            <input type="text" class="form-control d-none" name="opcion" value="proveedor">
                                            <div class="mb-3">
                                                <label for="exampleInput" class="form-label">Nombre</label>
                                                <input type="text" class="form-control" id="exampleInput" name="nombre">
                                            </div>
                                            <div class="mb-3">
                                                <label for="exampleInput" class="form-label">correo</label>
                                                <input type="email" class="form-control" id="exampleInput" name="correo">
                                            </div>
                                            <div class="mb-3">
                                                <label for="exampleInput" class="form-label">Contrase�a</label>
                                                <input type="text" class="form-control" id="exampleInput" name="contrasena">
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
                    </div>
                      
                    </div>

                    <div class="modal fade" id="vewOne" tabindex="-1" aria-labelledby="exampleModalLabel"
                        aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="exampleModalLabel">GARBIGUNNE SA</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <form action="http://localhost:8080/Garbigune_reto/create" method="post">
                                    <input type="text d-none" class="form-control" name=opcion" value="proveedor">
                                        <div class="mb-3">
                                            <label for="exampleInput" class="form-label">Nombre</label>
                                            <input type="text" class="form-control"  name="nombre">
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInput" class="form-label">correo</label>
                                            <input type="email" class="form-control" name="correo">
                                        </div>
                                        <div class="mb-3">
                                            <label for="exampleInput" class="form-label">Contrase�a</label>
                                            <input type="password" class="form-control"  name="contrasena">
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
                        <div class="b-example-divider b-example-vr"></div>
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
            			<li><p><i class="fas fa-map-marker-alt pe-6 col-md-6 col-lg-6"></i>DIRECCION: Berio Kalea, Guipuzcoa</p></li>
            			<li><p><i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>N� DE TELEFONO: 943 04 33 12</p></li>
            			<li><p><i class="fas fa-envelope pe-6 mb-0 col-md-6 col-lg-6"></i>CORREO: garbigunne@gmail.com</p></li>
          			</ul>
          			
          		</div>
          		<div class="col-lg-3 col-md-6 mb-4 mb-md-0">
          			<h5 class="text-uppercase mb-4">REDES SOCIALES</h5>
          			<ul class="list-unstyled">
            			<li><p><i class="fas fa-map-marker-alt pe-6 col-md-6 col-lg-6"></i>INSTAGRAM: @garbigunneSL</p></li>
            			<li><p><i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>YOUTUBE: @garbigunneSL</p></li>
            			<li><p><i class="fas fa-envelope pe-6 mb-0 col-md-6 col-lg-6"></i>TIKTOK: @garbigunneSL</p></li>
          			</ul>
        		 </div>
			</footer>
		</div>
	</footer>
	
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
                crossorigin="anonymous"></script>
            <script src="sidebars.js"></script>
        </body>

        </html>