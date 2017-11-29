package Proyecto;

import javax.swing.JSpinner;

import Proyecto.VInicio;

public class Gestion implements IGestion{
	
		public static Guerrero Ejercito_J1[]=new Guerrero[15];
		public static Guerrero Ejercito_J2[]=new Guerrero[15];
		
		VInicio a = new VInicio();
		JSpinner J2Lancero = new JSpinner();
	
	public Gestion() {
		
		
		for(int i = 0; i < Ejercito_J1.length ; i++ ){
			//for(int j = 0; j < J2Lancero.getToolTipText();)
			
			
			Ejercito_J1[i]=new Guerrero();
			
		}
		for(int i = 0; i < Ejercito_J2.length ; i++ ){
			
		}
		
		
	}
	
	@Override
	public void atacar() {
		
		
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}	

}
