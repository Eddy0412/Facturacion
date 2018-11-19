package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DbManager.Crud;
import DbManager.Dbconnection;

/**
 * Servlet implementation class ServletFacturacion
 */
@WebServlet("/ServletFacturacion")
public class ServletFacturacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletFacturacion() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Crud crud =new Crud();
		int numeroCliente = 0;
		if(request.getParameter("cliente")!=null)
		{
			numeroCliente = Integer.parseInt(request.getParameter("cliente"));
			request.setAttribute("cliente", crud.selectClienteByCliente(numeroCliente));
			request.setAttribute("facturas", crud.selectFacturasByCliente(numeroCliente));
		}else {
			request.setAttribute("clientes", crud.countFacturaClientes());
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("factura.jsp");
		dispatcher.forward(request, response);
	}

}
