package Proyecto;

public class Casilla extends Tablero{
	
	private int tipo;
	private int PostX;
	private int PostY;
	private int Ocupado;
	
	public Casilla(int tipo, int postX, int postY, int ocupado) {
		this.tipo = tipo;
		PostX = postX;
		PostY = postY;
		Ocupado = ocupado;
	}
	

}
