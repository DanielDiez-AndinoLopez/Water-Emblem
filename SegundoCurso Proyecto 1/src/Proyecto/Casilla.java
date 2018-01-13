package Proyecto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Casilla extends JLabel {

	 private String tipo;
	 private int ocupado;
	 private int relentizacion;
	 private Guerrero guerrero;
	
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getOcupado() {
		return ocupado;
	}
	public void setOcupado(int ocupado) {
		this.ocupado = ocupado;
	}
	public int getRelentizacion() {
		return relentizacion;
	}
	public void setRelentizacion(int relentizacion) {
		this.relentizacion = relentizacion;
	}

	
	public Casilla(String tipo, int ocupado, int relentizacion) {
		this.tipo = tipo;
		this.ocupado = ocupado;
		this.relentizacion = relentizacion;
		if(tipo.equals("Arbol")){
			setIcon(new ImageIcon("Arbol.png"));
		} else if(tipo.equals("Montaña")){
			setIcon(new ImageIcon("Montaña.png"));
		} else if(ocupado == 1){
			setIcon(new ImageIcon("Unidad.png"));
		}
	}
	
	public Casilla(Guerrero guerrero, int ocupado, int relentizacion){
		this.guerrero = guerrero;
		this.ocupado = ocupado;
		this.relentizacion = relentizacion;
		setIcon(guerrero.getIcon());
	}
	
	public boolean comprobacion( Casilla a){
		
		
		
		return false;
	}
	

}
