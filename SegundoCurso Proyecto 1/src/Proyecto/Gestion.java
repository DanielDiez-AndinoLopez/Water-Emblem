package Proyecto;

import javax.swing.JSpinner;

import Proyecto.VInicio;

public class Gestion{
	
		public static Guerrero Ejercito_J1[]=new Guerrero[15];
		public static Guerrero Ejercito_J2[]=new Guerrero[15];
		
		VInicio inicio = new VInicio();
		JSpinner J2Lancero = new JSpinner();
	
	public Gestion() {
		
		inicio.setVisible(true);
		
		
		
		for(int i = 0; i < Ejercito_J1.length ; i++ ){
			//for(int j = 0; j < J2Lancero.getToolTipText();)
			
			
			Ejercito_J1[i]=new Guerrero();
			
		}
		for(int i = 0; i < Ejercito_J2.length ; i++ ){
			
		}
		
		
	}
	
	public void atacar() {
		
		
		
	}

	public void mover() {
		// TODO Auto-generated method stub
		
	}	

}
