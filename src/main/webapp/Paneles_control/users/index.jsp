<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="./img/logo_garbigunne.png"
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



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
<link rel="stylesheet" href="estilos.css">
<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid ">
				<a class="navbar-brand d-flex flex-row justify-between" href="#">
					<div class="imgDiv">
						<img src="./img/logo_garbigunne.png" alt="logo" class="logo">
					</div>
				</a>
				<div class="peca">
					<i class="bi bi-person-circle"></i> <i class="bi bi-cart3"></i>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="contenedor">
			<div class="b-example-divider b-example-vr"></div>
			<div class="b-example-divider b-example-vr"></div>
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/botella.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">BOTELLAS</h5>
								<p class="card-text">Botellas de plástico.</p>
								<h5>0,50 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/vaso.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">VASO</h5>
								<p class="card-text">Vaso de vidrio.</p>
								<h5>0,75 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/at.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">CAMISETA</h5>
								<p class="card-text">Camiseta de Aston Martin.</p>
								<h5>30 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/botella.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">BOTELLAS</h5>
								<p class="card-text">Botellas de plástico.</p>
								<h5>0,50 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/botella.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">BOTELLAS</h5>
								<p class="card-text">Botellas de plástico.</p>
								<h5>0,50 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/botella.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">BOTELLAS</h5>
								<p class="card-text">Botellas de plastico.</p>
								<h5>0,50 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-3">
						<div class="card" id="card">
							<img src="./img/botella.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">BOTELLAS</h5>
								<p class="card-text">Botellas de plástico.</p>
								<h5>0,50 €</h5>
								<hr>
								<button type="button" class="btn btn-flex plus"
									data-bs-toggle="modal" data-bs-target="#exampleModal">
									Comprar
								</button>
							</div>
						</div>
					</div>
				</div>
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
					<form action="http://localhost:8080/Garbigune_reto/crearSuministro"
						method="post">
						<input type="text" class="form-control d-none" name="opcion"
							value="suministro">
							<label for="exampleInput" class="form-label">Cantidad</label>
							<input type="number" class="form-control" name="cantidad">
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-bs-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary" id="liveToastBtn">Comprar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<script src="sidebars.js"></script>
</body>

</html>