<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="landingPage/estilos.css">
    <link rel="shortcut icon" href="landingPage/img/logo_garbigunne.png" type="image/x-icon">
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
                        <img src="landingPage/img/logo_garbigunne.png" alt="logo" class="logo">
                    </div>
                </a>
            </div>
        </nav>
    </header>
    <main>
        <div class="contenedor">
            <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active" data-bs-interval="10000">
                        <img src="landingPage/img/main.png" alt="" class="imgMain d-block w-100">
                    </div>
                    <div class="carousel-item" data-bs-interval="2000">
                        <img src="landingPage/img/main2.jpg" alt="" class="imgMain d-block w-100">
                    </div>
                    <div class="carousel-item">
                        <img src="landingPage/img/main3.jpg" alt="" class="imgMain d-block w-100">
                    </div>
                    <div class="carousel-item">
                        <img src="landingPage/img/main4.jpg" alt="" class="imgMain d-block w-100">
                    </div>
                </div>
            </div>

            <section class="py-5 text-center container">
                <div class="row py-lg-5">
                    <div class="col-lg-6 col-md-8 mx-auto">
                        <p class="lead text-muted">
                            Explora nuestra coleccion de
                            <a class="resalto"> productos reciclados</a> y unete a la
                            moda <a class="resalto">sostenible</a> hoy mismo.
                        </p>
                        <button type="button" class="btn btn-primary btn-act"><a href="http://localhost:8080/Garbigune_reto/Login" id="juanitoboton">COMPRAR</a></button>
                    </div>
                </div>
            </section>
        </div>

        <div class="contenedor_productos">
            <img src="landingPage/img/card_1.png" alt="" class="imgMain">
            <div class="card_1">
                <p class="productos_txt">funcionamiento</p>
                <section class="info">
                    <div class="container text-center">
                        <div class="row gap-3"> 
                          <div class="col col-sm-12 col-md-5 col-lg align-items-center">
                           <div class="card info_card" >
                                <img src="landingPage/img/collab1.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Recogida</h5>
                                    <p class="card-text"></p>
                                </div>
                            </div>
    
                          </div>
                          <div class="col col-sm-12 col-md-5 col-lg align-items-center">
                           <div class="card info_card" >
                                <img src="landingPage/img/m,jpg.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Reciclaje</h5>
                                    <p class="card-text"></p>
                                </div>
                            </div>
                          </div>
                          <div class="col col-sm-12 col-md-5 col-lg align-items-center">
                            <div class="card info_card" >
                                <img src="landingPage/img/collab2.jpg" class="card-img-top" alt="...">
                                <div class="card-body">
                                    <h5 class="card-title">Venta</h5>
                                    <p class="card-text"></p>
                                </div>
                            </div>
                          </div>
                        </div>
                      </div>
                </section>
            </div>
        </div>

        <div class="contenedor_provedores">
            <section class="card_2">
                <p class="provedores_txt"> colaboradores </p>
                <div class="catalog_empresas">
                    <div class="row row-cols-1 row-cols-sm-1 row-cols-md-2 row-cols-lg-3  g-5 align-items-center prove">
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/COORDINA.png" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/ECOEMBES.jpg" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/GAIA.png" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/IBERDROLA.png" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/SABADELL.jpg" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                        <div class="col">
                            <div class="card" style="width: 18rem;">
                                <img src="landingPage/img/UNICEF.png" class="card-img-top" alt="...">
                                <div class="card-body">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </main>
    <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 border-top">
        <div class="col-md-4 d-flex align-items-center">
          <a href="/" class="mb-3 me-2 mb-md-0 text-body-secondary text-decoration-none lh-1">
            <svg class="bi" width="30" height="24"><use xlink:href="#bootstrap"></use></svg>
          </a>
          <span class="mb-3 mb-md-0 text-body-secondary">� 2024 vanila</span>
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