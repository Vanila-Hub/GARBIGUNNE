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
                        <a class="navbar-brand" href="/Garbigune_reto/home">
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
                            <a href="/Garbigune_reto/VerProveedores" class="nav-link"
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
                                CLIENTES
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerVentas" class="nav-link">
                                VENTAS
                            </a>
                        </li>
                        <li>
                            <a href="/Garbigune_reto/VerHistorico" class="nav-link active">
                                HISTORICO
                            </a>
                        </li>

                    </ul>
                    <hr>

                </div>
                <main class="row">
                    <div class="b-example-divider b-example-vr"></div>
                    <div class="table-responsive">
                        <div>
                            <canvas id="myChart"></canvas>
                          </div>
                        <table class="table table-design">
                           
                            <thead>
                                <tr>
                                    <th scope="col">ID Historico</th>
                                    <th scope="col">Fecha</th>
                                    <th scope="col">ID Planta</th>
                                    <th scope="col">ID Material</th>
                                    <th scope="col">Porcentaje de Contaminacion</th>
                                </tr>
                            </thead>
                            <tbody class="table-group-divider">
                                <c:forEach items="${historicoEmisiones}" var="historicoEmision">
                                    <input type="text" class="d-none total" value="${historicoEmision.emisionTotal}">
                                    <input type="text" class="d-none tipo" value="${historicoEmision.tipo_material}">
                                    <input type="text" class="d-none id_material" value="${historicoEmision.id_Material}">
                                    <tr>
                                        <th scope="row">${historicoEmision.id_Historico}</th>
                                        <td>${historicoEmision.fecha}</td>
                                        <td>${historicoEmision.id_Planta}</td>
                                        <td>${historicoEmision.id_Material}</td>
                                        <td>${historicoEmision.porcentajeContaminacion}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
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
            			<li><p><i class="fas fa-phone pe-6 col-md-6 col-lg-6"></i>Nº DE TELEFONO: 943 04 33 12</p></li>
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
            <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        </script>
        <script>
            const xValues = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
            const tipos_values = document.querySelectorAll('.tipo');
            console.log(tipos_values.value);
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
        </script>
        </body>

        </html>