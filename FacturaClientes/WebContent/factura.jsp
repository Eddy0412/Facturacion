
<%@page import="model.DetalleFactura"%>
<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Factura"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
Cliente cliente = new Cliente();
ArrayList<Factura> facturas=new ArrayList<>();
if(request.getAttribute("cliente")!=null)
{
	 cliente =(Cliente) request.getAttribute("cliente");
}
if(request.getAttribute("facturas")!=null)
{
	 facturas =(ArrayList<Factura>) request.getAttribute("facturas");
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
  <%for(Factura factura:facturas){ %>
    <header class="clearfix">
      <div id="logo">
        <img src="logo.png">
      </div>
      <h1>INVOICE 3-2-1</h1>
      <div id="company" class="clearfix">
      <div><%=cliente.getCLnumero()%></div>
        <div><%=cliente.getCLnombre()%> <%=cliente.getCLapellido()%></div>
        <div><%=cliente.getCLid()%></div>
        <div><%=cliente.getCLdireccion()%></div>
        <div><%=cliente.getCLtelefono()%></div>
        <div><%=cliente.getCLactividad()%></div>
        <div><a href="mailto:company@example.com">company@example.com</a></div>
      </div>
       <div id="project">
        <div><span>#FACTURA </span> <%=factura.getFAnumero() %></div>
        <div><span>PROVEEDOR </span> <%=factura.getFAproveedor() %></div>
        <div><span>FECHA </span>  <%=factura.getFAfecha() %></div>
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
        <%for(DetalleFactura detalleFactura : factura.getDetalleFacturas() ){ %>
          <tr>
            <td class="desc"><%=detalleFactura.getFAarticulo() %></td>
            <td class="unit"><%=detalleFactura.getFAcantidad() %></td>
            <td class="qty"><%=detalleFactura.getFAunidad() %></td>
            <td class="total">$<%=detalleFactura.getFAtotal() %></td>
            <td class="total">$<%=detalleFactura.getFAitbm() %></td>
          </tr>
<%} %>
          <tr>
            <td colspan="4">SUBTOTAL</td>
            <td class="total">$5,200.00</td>
            <td class="total">$5,200.00</td>
          </tr>
          <tr>
            <td colspan="4" class="grand total">GRAND TOTAL</td>
            <td class="grand total">$6,500.00</td>
          </tr>
        </tbody>
      </table>
      <div id="notices">
        <div>NOTICE:</div>
        <div class="notice">A finance charge of 1.5% will be made on unpaid balances after 30 days.</div>
      </div>
    </main>
    <%} %>
    <footer>
      Invoice was created on a computer and is valid without the signature and seal.
    </footer>
  </body>
</html>

