<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="Paneles_control/clienteProducto/estilos.css">

<title>GarbiGunne SL</title>
</head>

<body>
	<header>
		<nav class="navbar navbar-expand-lg">
			<div class="container-fluid ">
				<a class="navbar-brand d-flex flex-row justify-between"
					href="/Garbigune_reto/VerPaginaProductos?id_cliente=${id_cliente}">
					<div class="imgDiv">
						<img src="Paneles_control/clienteProducto/img/logo_garbigunne.png"
							alt="logo" class="logo">
					</div>
				</a>
				<div class="peca d-flex flex-row gap-2 text-white">

					<button class="btn btn-flex dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false">
						<strong class="align-self-center">${nombre}</strong>
					</button>
					<ul class="dropdown-menu dropdown-menu-dark">
						<li><a class="dropdown-item"
							href="/Garbigune_reto/EditarPerfil?id_cliente=${id_cliente}">Editar
								Perfil</a></li>
						<li><a class="dropdown-item" href="/Garbigune_reto/home">Cerrar
								Sesion</a></li>
					</ul>
				</div>
			</div>
			<button type="button" class="btn btn-flex plus me-3"
				data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-toggle="tooltip" data-bs-placement="top" title="Historial de Compras">
				<i class="bi bi-bag-check-fill fs-4 position-relative"></i>
			</button>
			<button class="btn btn-flex plus me-4" type="button"
				data-bs-toggle="offcanvas" data-bs-target="#demo" id="disdemo">

				<i class="bi bi-cart4 fs-4 position-relative"><span
					class="position-absolute top-4 start-100 translate-end badge rounded-pill bg-danger plus"
					id="cantidad_carr">0</span></i>
			</button>

		</nav>
	</header>
	<main>
		<div class="offcanvas offcanvas-end" id="demo">
			<div class="offcanvas-header">
				<h1 class="offcanvas-title">Carrito de Compra</h1>
				<button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
			</div>
			<hr></hr>
			<div class="offcanvas-body modal-dialog-scrollable">
				<div class="container" id="container">
					<div class="row"></div>
				</div>
			</div>
			<div class="btn-group shadow-lg bg-body-tertiary rounded"
				role="group" aria-label="Basic example">
				<a
					href="/Garbigune_reto/VerPaginaProductos?id_cliente=${id_cliente}&msg=compra_realizada"
					class="btn btn-flex"> Pagar <i class="bi bi-credit-card"></i></a>
			</div>
		</div>
		<c:choose>
			<c:when test="${msg=='compra_realizada'}">
				<div class="alert alert-success fade show test" role="alert">
					<i class="bi bi-check-circle"></i>
					<p>Compra Realizada</p>
					<button type="button" class="btn-close" data-bs-dismiss="alert"
						aria-label="Close"></button>
				</div>
			</c:when>
		</c:choose>
		<div class="contenedor">
			<div class="b-example-divider b-example-vr"></div>
			<div class="b-example-divider b-example-vr"></div>
			<div class="container">
				<div class="row">
					<c:forEach items="${productos}" var="producto">
						<div class="col-sm-12 col-md-6 col-lg-3">
							<div class="card shadow-lg" id="card">
								<img src="${producto.ruta_imagen}" class="card-img-top"
									alt="{producto.ruta_imagen}">
								<div class="card-body">
									<h5 class="card-title">${producto.nombre}</h5>
									<strong class="text">${producto.descripcion}</strong>
									<h5>${producto.precio}€</h5>
									<hr>
									<div class="btn-group shadow-lg bg-body-tertiary rounded"
										role="group" aria-label="Basic example">
										<a
											href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
											class="btn btn-flex"> Comprar <i
											class="bi bi-credit-card"></i></a>
										<button id="${producto.id_producto}"
											onclick="appenCarrito(id,'${id_cliente}')"
											class="btn bg-warning text-white">
											Añadir <i class="bi bi-cart-plus"></i>
										</button>
									</div>

								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</main>

	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog  modal-dialog-scrollable modal-xl">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">Historial
						de Compras</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body row">
					<c:forEach items="${productosCliente}" var="producto">
						<div class="col-sm-12 col-md-6 col-lg-3">
							<div class="card" id="card">
								<img src="${producto.ruta_imagen}" class="card-img-top"
									alt="{producto.ruta_imagen}">
								<div class="card-body">
									<h5 class="card-title">${producto.nombre}</h5>
									<h6>
										<c:forEach items="${compras}" var="venta">
											<c:choose>
												<c:when test="${venta.id_producto == producto.id_producto}">Cantidad Comprada: ${venta.cantidad}</c:when>
											</c:choose>
										</c:forEach>
									</h6>
									<h6>
										<c:forEach items="${compras}" var="venta">
											<c:choose>
												<c:when test="${venta.id_producto == producto.id_producto}">Pagado: 
													<fmt:formatNumber
														value="${venta.cantidad * producto.precio}" type="number"
														maxFractionDigits="2" minFractionDigits="2" />€</c:when>
											</c:choose>
										</c:forEach>
									</h6>
									<hr>
									<div class="btn-group shadow-lg bg-body-tertiary rounded"
										role="group" aria-label="Basic example">
										<a
											href="/Garbigune_reto/Comprar?id_producto=${producto.id_producto}&id_cliente=${id_cliente}"
											class="btn btn-flex">Volver a Comprar <i
											class="bi bi-credit-card"></i></a>
									</div>

								</div>
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">Cerrar</button>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>
<script>
var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
  return new bootstrap.Tooltip(tooltipTriggerEl)
})
</script>
<script>
	let producto_recien = 0;
	let productos_carro = [];
	let articulos = 0;
	let existe;
	let cantidad_carr = document.getElementById('cantidad_carr');
	function appenCarrito(id_producto, id_cliente) {
		if (producto_recien !== id_producto) {
			for (let i = 0; i < productos_carro.length; i++) {
				if (id_producto == productos_carro[i]) {
					console.log('nada');
					existe = true;
					break;
				}
			}
			if (existe == true) {
				console.log('nada');
			} else {
				productos_carro.push(id_producto);
				producto_recien = id_producto;
				articulos = articulos + 1;
				cantidad_carr.textContent = articulos;
				CargarProductos(productos_carro);
			}

		}
		console.log(productos_carro);
	}
	function CargarProductos(ids_productos) {
		
	// Iterar sobre los IDs de productos y realizar la peticiÃ³n para cada uno
	document.getElementById('container').innerHTML="";
	ids_productos.forEach(id => {
		console.log(id);
		fetchProductData(id);
	});
	document.getElementById('disdemo').click();
	// FunciÃ³n para crear y aÃ±adir el elemento al DOM
function createProductElement(producto) {
		
		// Crear el contenedor principal
		const rowDiv = document.createElement('div');
		rowDiv.classList.add('row');

		// Crear la tarjeta
		const cardDiv = document.createElement('div');
		cardDiv.classList.add('card', 'mb-3', 'shadow-lg');
		cardDiv.style.maxWidth = '340px';
		cardDiv.style.height= '143px';
		// Crear la fila interna
		const innerRowDiv = document.createElement('div');
		innerRowDiv.classList.add('row', 'g-0');

		// Crear la columna de la imagen
		const colImgDiv = document.createElement('div');
		colImgDiv.classList.add('col-md-4');

		const img = document.createElement('img');
		img.src = producto.ruta_imagen;
		img.classList.add('img-fluid', 'card-img-top');
		img.alt = 'producto';
		img.id = 'product_img';

		colImgDiv.appendChild(img);

		// Crear la columna del contenido
		const colContentDiv = document.createElement('div');
		colContentDiv.classList.add('col-md-8');

		const cardBodyDiv = document.createElement('div');
		cardBodyDiv.classList.add('card-body');

		// Crear el tÃ­tulo del producto
		const productName = document.createElement('h5');
		productName.classList.add('card-title');
		productName.id = 'product_name';
		productName.textContent = producto.nombre;

		// Crear la descripciÃ³n del producto
		const productDesc = document.createElement('strong');
		productDesc.classList.add('text');
		productDesc.id = 'product_desc';
		productDesc.textContent = producto.descripcion;

		// Crear el precio del producto
		const productPrice = document.createElement('h5');
		productPrice.id = 'product_price';
		productPrice.textContent = producto.precio + "€";

		// Crear el separador
		const hr = document.createElement('hr');

		// AÃ±adir los elementos al cardBody
		cardBodyDiv.appendChild(productName);
		cardBodyDiv.appendChild(productDesc);
		cardBodyDiv.appendChild(productPrice);
		cardBodyDiv.appendChild(hr);

		// AÃ±adir el cardBody a la columna de contenido
		colContentDiv.appendChild(cardBodyDiv);

		// AÃ±adir las columnas a la fila interna
		innerRowDiv.appendChild(colImgDiv);
		innerRowDiv.appendChild(colContentDiv);

		// AÃ±adir la fila interna a la tarjeta
		cardDiv.appendChild(innerRowDiv);

		// AÃ±adir la tarjeta a la fila principal
		rowDiv.appendChild(cardDiv);

		// Suponiendo que tienes un elemento con id "container" en tu HTML donde insertar el producto
		document.getElementById('container').appendChild(rowDiv);
	}
	
	// FunciÃ³n para realizar la peticiÃ³n AJAX
	function fetchProductData(productId) {
		fetch(`/Garbigune_reto/getProductoByID?id_producto=` + productId)
		.then(response => response.json())
		.then(data => {
			createProductElement(data);
		})
		.catch(error => console.error('Error:', error));
	}


	}
</script>
</html>