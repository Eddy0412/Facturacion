
<%@page import="model.ClienteAppend"%>
<%@page import="model.DetalleFactura"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Factura"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Cliente cliente = new Cliente();
	ArrayList<Factura> facturas = new ArrayList<>();
	ArrayList<ClienteAppend> clientes = new ArrayList<>();
	if (request.getAttribute("cliente") != null) {
		cliente = (Cliente) request.getAttribute("cliente");
	}
	if (request.getAttribute("facturas") != null) {
		facturas = (ArrayList<Factura>) request.getAttribute("facturas");
	}
	if (request.getAttribute("clientes") != null) {
		clientes = (ArrayList<ClienteAppend>) request.getAttribute("clientes");
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Example 1</title>
<link rel="stylesheet" href="style.css" media="all" />
</head>
<body>

	<%
		if (!facturas.isEmpty()) {
			for (Factura factura : facturas) {
	%>
	<header class="clearfix">
		<div id="logo">
			<img src="logo.png">
		</div>
		<h1>INVOICE 3-2-1</h1>
		<div id="company" class="clearfix">
			<div><%=cliente.getCLnumero()%></div>
			<div><%=cliente.getCLnombre()%>
				<%=cliente.getCLapellido()%></div>
			<div><%=cliente.getCLid()%></div>
			<div><%=cliente.getCLdireccion()%></div>
			<div><%=cliente.getCLtelefono()%></div>
			<div><%=cliente.getCLactividad()%></div>
		</div>
		<div id="project">
			<div>
				<span>#FACTURA </span>
				<%=factura.getFAnumero()%></div>
			<div>
				<span>PROVEEDOR </span>
				<%=factura.getFAproveedor()%></div>
			<div>
				<span>FECHA </span>
				<%=factura.getFAfecha()%></div>
		</div>
	</header>
	<main>
	<table>
		<thead>
			<tr>
				<th class="desc">ARTICULO</th>
				<th>CANTIDAD</th>
				<th>UNIDAD</th>
				<th>TOTAL</th>
				<th>ITBM</th>
			</tr>
		</thead>
		<tbody>
			<%
				double total = 0, totalItbm = 0;
						for (DetalleFactura detalleFactura : factura.getDetalleFacturas()) {
			%>
			<tr>
				<td class="desc"><%=detalleFactura.getFAarticulo()%></td>
				<td class="unit"><%=detalleFactura.getFAcantidad()%></td>
				<td class="qty"><%=detalleFactura.getFAunidad()%></td>
				<td class="total">$<%=detalleFactura.getFAtotal()%></td>
				<td class="total">$<%=detalleFactura.getFAitbm()%></td>
			</tr>
			<%
				total += detalleFactura.getFAtotal();
							totalItbm += detalleFactura.getFAitbm();
						}
			%>
			<tr>
				<td colspan="3">SUBTOTAL</td>
				<td class="total">$<%=total%></td>
				<td class="total">$<%=totalItbm%></td>
			</tr>
			<tr>
				<td colspan="4" class="grand total">TOTAL</td>
				<td class="grand total">$<%=total + totalItbm%></td>
			</tr>
		</tbody>
	</table>
	<div id="notices">
		<div>Aviso:</div>
		<div class="notice">Se realizará un cargo financiero del 1.5%
			sobre saldos pendientes de pago después de 30 días.</div>
	</div>
	</main>
	<%
		}
		} else {
	%>
	<header class="clearfix">
		<div id="logo">
			<img src="logo.png">
		</div>
		<h1>INVOICE 3-2-1</h1>
	</header>
	<main>
	<table>
		<thead>
			<tr>
				<th class="desc">CLIENTE</th>
				<th>NUM. CLIENTE</th>
				<th>TELEFONO</th>
				<th>DIRECCION</th>
				<th>ACTIVIDAD</th>
				<th>CLIENTE ID</th>
				<th>CANTIDAD DE FACTURAS</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (ClienteAppend clienteAppend : clientes) {
			%>
			<tr>
				<td class="desc"><%=clienteAppend.getCLnombre()%> <%=clienteAppend.getCLapellido()%></td>
				<td class="unit"><%=clienteAppend.getCLnumero()%></td>
				<td class="qty"><%=clienteAppend.getCLtelefono()%></td>
				<td class="total"><%=clienteAppend.getCLdireccion()%></td>
				<td class="total"><%=clienteAppend.getCLactividad()%></td>
				<td class="total"><%=clienteAppend.getCLid()%></td>
				<td class="total"><%=clienteAppend.getFacturaCount()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	</main>
	<%
		}
	%>
</body>
</html>

