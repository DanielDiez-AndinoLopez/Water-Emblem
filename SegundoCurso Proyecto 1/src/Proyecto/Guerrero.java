package Proyecto;

public class Guerrero {
	
	
	protected int ataque;
	protected int vida;
	protected int movimiento;
	protected int critico;
	
	
	public Guerrero(int ataque, int vida, int movimiento, int critico) {
		this.ataque = ataque;
		this.vida = vida;
		this.movimiento = movimiento;
		this.critico = critico;
	}
	
	public Guerrero() {
		this.ataque = 0;
		this.vida = 0;
		this.movimiento = 0;
		this.critico = 0;
	}
	
	public Guerrero(Guerrero c) {
		this.ataque = c.ataque;
		this.vida = c.vida;
		this.movimiento = c.movimiento;
		this.critico = c.critico;
	}
	
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	public int getCritico() {
		return critico;
	}
	public void setCritico(int critico) {
		this.critico = critico;
	}
	

}
