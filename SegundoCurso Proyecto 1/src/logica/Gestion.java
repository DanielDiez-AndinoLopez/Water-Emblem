package logica;

import datos.Guerrero;
import guia.VInicio;

public class Gestion implements IGestion{
	
		public static Guerrero Ejercito_J1[]=new Guerrero[15];
		public static Guerrero Ejercito_J2[]=new Guerrero[15];
	
	public Gestion() {
		
		for(int i = 0; i < Ejercito_J1.length ; i++ ){
			Ejercito_J1[i]=new Guerrero();
			
		}
		for(int i = 0; i < Ejercito_J2.length ; i++ ){
			
		}
		
		
	}
	
	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}	

}
