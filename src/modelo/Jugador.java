package modelo;

import java.time.LocalDate;

public class Jugador extends Persona implements Comparable {
	//private static final long serialVersionUID = 1L;
	private int equipo;
	private int golesMarcados;
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nif, String nombre, LocalDate fecha, int altura, int equipo, int goles) {
		super(nif, nombre,  fecha, altura);
		this.equipo=equipo;
		this.golesMarcados=goles;
		
	}
	
	public int getEquipo() {
		return equipo;
	}
	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	public int getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	
	
	public String toString() {
		return  this.getNif() + " , " +  this.getNombre() + " , " +  this.getFecha() + " , " +  this.getAltura() + " , " +  String.valueOf(equipo) + " , " +  golesMarcados ;

	}
	
	@Override
	public int compareTo(Object o) {
		Jugador oJ = (Jugador) o;
		if(this.getEquipo() > oJ.getEquipo())
			return 1;
		if(this.getEquipo() < oJ.getEquipo())
			return -1;
		if (this.getEquipo() == oJ.getEquipo()) {
			if (this.getNombre().compareToIgnoreCase(oJ.getNombre()) >0) {
				return 1;
			}else {
				return -1;
			}	
		}
		return 0;
	}
	
	
/*	
	@Override
	public int compareTo(Object obj) {
		Jugador oJ = (Jugador) obj;
		if(this.getEquipo() > oJ.getEquipo()){
			return this.getEquipo();
		}
		if(this.getEquipo() < oJ.getEquipo()){
			return oJ.getEquipo();
		}
		
		if(this.getEquipo() != oJ.getEquipo()){
			int nombre = this.getNombre().compareToIgnoreCase(oJ.getNombre());
			if (nombre > 0 ) {
				return this.getNombre();
			}else {
				return oJ.getNombre();
			}
		}
	}
*/	
	

}
