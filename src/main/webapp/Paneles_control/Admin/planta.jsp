<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="Paneles_control/Admin/img/logo_garbigunne.png" type="image/x-icon">
    <link rel="stylesheet" href="Paneles_control/Admin/estilos.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">



    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
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
    <div class="contenedor d-flex flex-row">
        <div class="b-example-divider b-example-vr"></div>
        <main>
            <div class="b-example-divider b-example-vr"></div>
        </main>
        <div class="sidebar aside d-flex flex-column flex-shrink-0">
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
                    <a href="http://localhost:8080/Garbigune_reto/admin?peticion=planta" class="nav-link active">
                        PLANTAS
                    </a>
                </li>
                <li>
                    <a href="Paneles_control/Admin/suministro.jsp" class="nav-link disabled">
                        SUMINISTROS
                    </a>
                </li>
                <li>
                    <a href="Paneles_control/Admin/materiales.jsp" class="nav-link active">
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
                        EMISIONES_PRODUCTOS
                    </a>
                </li>
                <li>
                    <a href="#" class="nav-link disabled">
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
        <div class="b-example-divider b-example-vr"></div>
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
                <p class="text-center text-body-secondary">© 2024 Company, Inc</p>
            </footer>
        </div>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
    <script src="sidebars.js"></script>
</body>

</html>