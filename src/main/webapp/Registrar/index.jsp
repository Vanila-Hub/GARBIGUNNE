<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="./img/logo_garbigunne.png" type="image/x-icon">
    <link rel="stylesheet" href="Registrar/estilos.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>GarbiGunne SL</title>
</head>

<body>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="http://localhost:8080/Garbigune_reto/home">
                    <div class="imgDiv">
                        <img src="Registrar/img/logo_garbigunne.png" alt="logo" class="logo">
                    </div>
                </a>
            </div>
        </nav>
    </header>
    <main>
        <div class="contenedor">
            <form action="http://localhost:8080/Garbigune_reto/create" method="post">
                <input type="text" class="form-control d-none" name="opcion" value="cliente">
                <div class="mb-3">
                    <label for="exampleInput" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="exampleInput" name="nombre">
                </div>
                <div class="mb-3">
                    <label for="exampleInput" class="form-label">Apellido</label>
                    <input type="text" class="form-control" id="exampleInput" name="apellido">
                </div>
                <div class="mb-3">
                    <label for="exampleInput" class="form-label">Usuario</label>
                    <input type="email" class="form-control" id="exampleInput" name="usuario">
                </div>
                <div class="mb-3">
                    <label for="exampleInput" class="form-label">Contraseña</label>
                    <input type="password" class="form-control" id="exampleInput" name="contrasena">
                </div>
                <button type="submit" class="btn btn-secondary">Crear Usuario</button>
                <button type="button" class="btn btn-primary"><a
                        href="http://localhost:8080/Garbigune_reto/Login">Iniciar Sesion</a></button>

            </form>
        </div>
    </main>
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
        <div class="col-md-4 d-flex align-items-center">
            <a href="/" class="mb-3 me-2 mb-md-0 text-body-secondary text-decoration-none lh-1">
                <svg class="bi" width="30" height="24">
                    <use xlink:href="#bootstrap"></use>
                </svg>
            </a>
            <span class="mb-3 mb-md-0 text-body-secondary">ï¿½ 2024 vanila</span>
        </div>

        <ul class="nav col-md-4 justify-content-end list-unstyled d-flex">
            <li class="ms-3"><a class="text-body-secondary" href="#"><i class="bi bi-threads-fill"></i></li>
            <li class="ms-3"><a class="text-body-secondary" href="#"><i class="bi bi-instagram"></i></a></li>
            <li class="ms-3"><a class="text-body-secondary" href="#"><i class="bi bi-whatsapp"></i></li>
        </ul>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>