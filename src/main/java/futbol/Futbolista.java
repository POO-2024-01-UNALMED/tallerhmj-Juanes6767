package main.java.futbol;

public class abstract Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private final String posicion;
	public Futbolista(String n,int e,String p){
		this.nombren=n;
		this.posicion=p;
		this.edad=e;
	}
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public boolean equals(Futbolista f) {
		return this.equals((Object)f);
	}
	
	public abstract boolean jugarConLasmanos();
	
	public String toString(){
		return "El futbolista "+nombre+" tiene "+edad+",y juega de "+posicion;
	}
}
