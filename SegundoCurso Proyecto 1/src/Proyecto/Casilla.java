package Proyecto;

import javax.swing.JLabel;

public class Casilla extends JLabel {

	 public static String tipo;
	 public static int ocupado;
	 public static int relentizacion;
	
	 
	 
	 
	 
	 
	
	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String tipo) {
		Casilla.tipo = tipo;
	}
	public static int getOcupado() {
		return ocupado;
	}
	public static void setOcupado(int ocupado) {
		Casilla.ocupado = ocupado;
	}
	public static int getRelentizacion() {
		return relentizacion;
	}
	public static void setRelentizacion(int relentizacion) {
		Casilla.relentizacion = relentizacion;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
