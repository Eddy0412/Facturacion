package model;

public class ClienteAppend extends Cliente {

	private int facturaCount;

	public ClienteAppend() {
	}

	public ClienteAppend(int cLnumero, String cLid, String cLnombre, String cLapellido, String cLdireccion,
			String cLtelefono, String cLactividad,int facturaCount) {
		super(cLnumero, cLid, cLnombre, cLapellido, cLdireccion, cLtelefono, cLactividad);
		
	}


	public int getFacturaCount() {
		return facturaCount;
	}

	public void setFacturaCount(int facturaCount) {
		this.facturaCount = facturaCount;
	}
	
}
