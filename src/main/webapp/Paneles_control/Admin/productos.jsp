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
                    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-decoration-none">
                        <strong class="fs-4">Gestores</strong>
                    </a>
                    <hr>
                    <ul class="nav nav-pills flex-column mb-auto">
                        <li class="nav-item">
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=proveedores" class="nav-link"
                                aria-current="page">
                                PROVEEDORES
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=planta " class="nav-link">
                                PLANTAS
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=suministros" class="nav-link">
                                SUMINISTROS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerMateriales" class="nav-link ">
                                MATERIALES
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=productos"
                                class="nav-link active">
                                PRODUCTOS
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=emisiones" class="nav-link">
                                EMISIONES POR PRODUCTO
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerClientes" class="nav-link ">
                                CLIENTES
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=venta" class="nav-link ">
                                VENTAS
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=historico" class="nav-link">
                                HISTORICO
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/Garbigune_reto/admin?peticion=roles" class="nav-link ">
                                ROLES
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
                                data-bs-target="#exampleModal">Crear <i class="bi bi-plus-lg"></i></button>
                            <thead>
                                <tr>
                                    <th scope="col">ID Producto</th>
                                    <th scope="col">ID Planta</th>
                                    <th scope="col">ID Material</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Descripcion</th>
                                    <th scope="col">Stock</th>
                                    <th scope="col">Peso (Kg)</th>
                                    <th scope="col">Opciones</th>

                                </tr>
                            </thead>
                            <tbody class="table-group-divider">
                                <c:forEach items="${productos}" var="producto">
                                    <tr>
                                        <th scope="row">${producto.id_producto}</th>
                                        <td><a
                                                href="http://localhost:8080/Garbigune_reto/edit?opcion=planta&id=${producto.id_planta}">${producto.id_planta}</a>
                                        </td>
                                        <td><a
                                                href="http://localhost:8080/Garbigune_reto/edit?opcion=material&id_material=${producto.id_material}">${producto.id_material}</a>
                                        </td>
                                        <td>${producto.nombre}</td>
                                        <td>${producto.precio}</td>
                                        <td>${producto.descripcion}</td>
                                        <td>${producto.stock}</td>
                                        <td>${producto.peso_producto}</td>
                                        <td class="d-flex flex-wrap justify-content-evenly w-2">
                                            <div class="btn-group" role="group" aria-label="Basic example">
                                                <button type="button" class="btn btn-flex" data-bs-toggle="modal">
                                                    <a
                                                        href="http://localhost:8080/Garbigune_reto/edit?opcion=producto&id_producto=${producto.id_producto}">
                                                        <i class="bi bi-pencil-square fs-5 text-light"></i>
                                                    </a>
                                                </button>
                                                <a href="http://localhost:8080/Garbigune_reto/borrar?opcion=producto&id_producto=${producto.id_producto}"
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
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">Crear Producto</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="http://localhost:8080/Garbigune_reto/create" method="post" class="d-flex flex-row flex-wrap justify-content-between">
                                            <input type="text" class="form-control d-none" name="opcion"
                                                value="producto">
                                            <div class="mb-3">
                                                <label for="id_planta" class="form-label">Planta</label>
                                                <select class="form-select" aria-label="Default select example" name="planta">

                                                    <option selected >Seleccionar Planta</option>
                                                    <c:forEach items="${plantas}" var="planta">
                                                        <option value="${planta.id}">${planta.nombre}
                                                        </option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div class="mb-3">
                                                <label for="id_planta" class="form-label">Material</label>
                                                <select class="form-select" aria-label="Default select example" name="material">

                                                    <option selected >Seleccionar Material</option>
                                                    <c:forEach items="${materiales}" var="material">
                                                        <option value="${material.id_material}">${material.tipo}
                                                        </option>
                                                    </c:forEach>

                                                </select>
                                            </div>
                                            <div class="mb-3">
                                                <label for="nombre" class="form-label">Nombre Del Producto</label>
                                                <input type="text" class="form-control" name="nombre">
                                            </div>
                                            <div class="mb-3">
                                                <label for="precio" class="form-label">Precio</label>
                                                <input type="number" class="form-control" name="precio">
                                            </div>
                                            <div class="mb-3">
                                                <label for="descripcion" class="form-label">Descripcion</label>
                                                <textarea class="form-control" id="descripcion" name="descripcion" placeholder="Descripcion"></textarea>
                                            </div>
                                            <div class="mb-3">
                                                <label for="stock" class="form-label">Stock</label>
                                                <input type="number" class="form-control" name="stock">
                                            </div>
                                            <div class="mb-3">
                                                <label for="peso_producto" class="form-label">Peso Producto</label>
                                                <input type="number" class="form-control" name="peso_producto">
                                            </div>
                                            <div class="mb-3">
                                                <label for="imagen" class="form-label">Ruta de la Imagen</label>
                                                <input type="file" class="form-control" name="imagen">
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
            </div>
            </div>
            </main>


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