package model;

public class DetalleFactura {
	private int id_FAdetalles;
	private String FAarticulo;
	private int FAcantidad;
	private String FAunidad;
	private double FAtotal;
	private double FAitbm;
	
	public DetalleFactura(int id_FAdetalles, String fAarticulo, int fAcantidad, String fAunidad, double fAtotal,
			double fAitbm, int fAnumero) {
		this.id_FAdetalles = id_FAdetalles;
		FAarticulo = fAarticulo;
		FAcantidad = fAcantidad;
		FAunidad = fAunidad;
		FAtotal = fAtotal;
		FAitbm = fAitbm;
		FAnumero = fAnumero;
	}
	public int getId_FAdetalles() {
		return id_FAdetalles;
	}
	public void setId_FAdetalles(int id_FAdetalles) {
		this.id_FAdetalles = id_FAdetalles;
	}
	public String getFAarticulo() {
		return FAarticulo;
	}
	public void setFAarticulo(String fAarticulo) {
		FAarticulo = fAarticulo;
	}
	public int getFAcantidad() {
		return FAcantidad;
	}
	public void setFAcantidad(int fAcantidad) {
		FAcantidad = fAcantidad;
	}
	public String getFAunidad() {
		return FAunidad;
	}
	public void setFAunidad(String fAunidad) {
		FAunidad = fAunidad;
	}
	public double getFAtotal() {
		return FAtotal;
	}
	public void setFAtotal(double fAtotal) {
		FAtotal = fAtotal;
	}
	public double getFAitbm() {
		return FAitbm;
	}
	public void setFAitbm(double fAitbm) {
		FAitbm = fAitbm;
	}
	public int getFAnumero() {
		return FAnumero;
	}
	public void setFAnumero(int fAnumero) {
		FAnumero = fAnumero;
	}
	private int FAnumero;
	
 
}
