package DbManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ClienteAppend;
import model.DetalleFactura;
import model.Factura;

public class Crud {

	private Dbconnection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultset;
	private String query;

	Crud() {
		conn = new Dbconnection();
	}

	public void insertAll() {
	}

	public ArrayList<Factura> selectFacturasByCliente(int CLnumero) {
		try {
			ArrayList<Factura> facturas = new ArrayList<>();
			query = "SELECT * FROM factura WHERE CLnumero=?";
			preparedStatement = conn.getCon().prepareStatement(query);
			preparedStatement.setInt(CLnumero, 1);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				facturas.add(new Factura(resultset.getInt("FAnumero"), resultset.getString("FAproveedor"),
						resultset.getDate("FAfecha"), resultset.getInt("CLnumero")));
			}
			return facturas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			query="";
			closeStament();
			conn.CloseConnection();	
		}

	}
	public ArrayList<DetalleFactura> selectDetalleFacturaByFactura(int id_FAdetalles) {
		ArrayList<DetalleFactura> detalleFactura = new ArrayList<>();
		try {
			ArrayList<DetalleFactura> facturas = new ArrayList<>();
			query = "SELECT * FROM factura WHERE CLnumero=?";
			preparedStatement = conn.getCon().prepareStatement(query);
			preparedStatement.setInt(FAnumero, 1);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				detalleFactura.add(new DetalleFactura(resultset.getString("FAarticulo"), resultset.getString("FAproveedor"),
						resultset.getDate("FAfecha"), resultset.getInt("CLnumero")));
			}
			return facturas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			query="";
			closeStament();
			conn.CloseConnection();	
		}
		return detalleFactura;
	}

	public ArrayList<ClienteAppend> countFacturaByCliente(int CLnumero) {
		
		try {
			ArrayList<ClienteAppend> clientesCuntFacturas = new ArrayList<>();
			query = "SELECT cliente.*,COUNT(factura.FAnumero)as count FROM factura INNER JOIN cliente where factura.CLnumero=cliente.CLnumero GROUP BY cliente.CLnumero";
			preparedStatement = conn.getCon().prepareStatement(query);
			preparedStatement.setInt(CLnumero, 1);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				clientesCuntFacturas.add(new ClienteAppend(resultset.getInt("CLnumero"),resultset.getString("CLid"), resultset.getString("CLnombre"),
						resultset.getString("CLapellido"), resultset.getString("CLdireccion"), resultset.getString("CLtelefono"), resultset.getString("CLactividad"), resultset.getInt("count")));
			}
			return clientesCuntFacturas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			query="";
			closeStament();
			conn.CloseConnection();	
		}
	}
	

	
	public void closeStament() {
			try {
				if(preparedStatement!=null)
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	
	public void deleteAll() {
	}

	public void updateAll() {
	}

}
