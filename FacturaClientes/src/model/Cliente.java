package model;

public class Cliente {
	private int CLnumero;
	private String CLid;
	private String CLnombre;
	private String CLapellido;
	private String CLdireccion;
	private String CLtelefono;
	private String CLactividad;
	
	public Cliente() {
		
	}
	public Cliente(int cLnumero, String cLid, String cLnombre, String cLapellido, String cLdireccion, String cLtelefono,
			String cLactividad) {
		super();
		CLnumero = cLnumero;
		CLid = cLid;
		CLnombre = cLnombre;
		CLapellido = cLapellido;
		CLdireccion = cLdireccion;
		CLtelefono = cLtelefono;
		CLactividad = cLactividad;
	}
	public int getCLnumero() {
		return CLnumero;
	}
	public void setCLnumero(int cLnumero) {
		CLnumero = cLnumero;
	}
	public String getCLid() {
		return CLid;
	}
	public void setCLid(String cLid) {
		CLid = cLid;
	}
	public String getCLnombre() {
		return CLnombre;
	}
	public void setCLnombre(String cLnombre) {
		CLnombre = cLnombre;
	}
	public String getCLapellido() {
		return CLapellido;
	}
	public void setCLapellido(String cLapellido) {
		CLapellido = cLapellido;
	}
	public String getCLdireccion() {
		return CLdireccion;
	}
	public void setCLdireccion(String cLdireccion) {
		CLdireccion = cLdireccion;
	}
	public String getCLtelefono() {
		return CLtelefono;
	}
	public void setCLtelefono(String cLtelefono) {
		CLtelefono = cLtelefono;
	}
	public String getCLactividad() {
		return CLactividad;
	}
	public void setCLactividad(String cLactividad) {
		CLactividad = cLactividad;
	}
}
