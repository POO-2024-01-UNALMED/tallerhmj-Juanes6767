package main.java.futbol;

import Futbolista;

public class Jugador extends Futbolista{
	public short golesMarcados;

	public byte dorsal;
	
	public Juagador(String n,int e,String p) {
		super(n,e,p);
			this.golesmarcados=289;
			this.dorsal=7;
	}
	@Override
	public int compareTo(T o){
		return Math.abs(this.edad-T.edad);
	}
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+",y juega de "+posicion+" con el dorsal "+dorsal+"".Ha marcado "+golesMarcados;
	}
	
}
