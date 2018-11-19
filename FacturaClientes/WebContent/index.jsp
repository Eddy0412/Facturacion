<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="/FacturaClientes/ServletFacturacion" method="post">
			<div class="col-lg-12">
				<div
					class="form-group ">
					<label for="inputTemp0" class="col-sm-12 col-form-label">Ingrese
						el numero de cliente para desplegar facturas</label>
					<div class="col-md-12">
						<input type="text" class="form-control" id="inputTemp0"
							name="cliente" placeholder="Numero Cliente...." required>
					</div>
				</div>
				<div
					class="form-group ">
					<div class="col-md-12">
						<button type="submit" class="btn btn-primary">Enter</button>
					</div>
				</div>
			</div>
		</form>
		<form action="/FacturaClientes/ServletFacturacion" method="post">
			<div class="col-lg-12">
				<div
					class="form-group">
					<label for="inputTemp0" class="col-sm-12 col-form-label">Presione
						el enter para conocer la cantidad de facturas por cada cliente</label>
					<div class="col-md-12">
						<button type="submit" class="btn btn-primary">Enter</button>
					</div>

				</div>
			</div>
		</form>
	</div>
</body>
</html>