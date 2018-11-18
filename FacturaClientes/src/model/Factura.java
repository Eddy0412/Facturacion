package model;

import java.sql.Date;

public class Factura {
	
	private int FAnumero;
	private String FAproveedor;
	private Date FAfecha;
	private int CLnumero;
	
	public Factura(int fAnumero, String fAproveedor, Date fAfecha, int cLnumero) {
		FAnumero = fAnumero;
		FAproveedor = fAproveedor;
		FAfecha = fAfecha;
		CLnumero = cLnumero;
	}
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	public int getFAnumero() {
		return FAnumero;
	}
	public void setFAnumero(int fAnumero) {
		FAnumero = fAnumero;
	}
	public String getFAproveedor() {
		return FAproveedor;
	}
	public void setFAproveedor(String fAproveedor) {
		FAproveedor = fAproveedor;
	}
	public Date getFAfecha() {
		return FAfecha;
	}
	public void setFAfecha(Date fAfecha) {
		FAfecha = fAfecha;
	}
	public int getCLnumero() {
		return CLnumero;
	}
	public void setCLnumero(int cLnumero) {
		CLnumero = cLnumero;
	}

}
