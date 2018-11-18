package model;

public class OcFactura {
private int OCnumero;
private int FAnumero;
public OcFactura(int oCnumero, int fAnumero) {
	OCnumero = oCnumero;
	FAnumero = fAnumero;
}
public int getOCnumero() {
	return OCnumero;
}
public void setOCnumero(int oCnumero) {
	OCnumero = oCnumero;
}
public int getFAnumero() {
	return FAnumero;
}
public void setFAnumero(int fAnumero) {
	FAnumero = fAnumero;
}
}
