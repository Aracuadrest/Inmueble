package Clases;

public class Piso extends Inmueble {
	
	private int numHabitaciones;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;
	
	

	public Piso() {
		super();
		this.numHabitaciones = 0;
		this.vpo = false;
	}
	

		public Piso(String refcatastral, double superficie, double valor_catastral, String descripcion, double preciom2,
			int numHabitaciones, boolean vpo, boolean atico, int antiguedad) {
		super(refcatastral, superficie, valor_catastral, descripcion, preciom2);
		this.numHabitaciones = numHabitaciones;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}



	@Override
		public String toString() {
			return "Piso [refcatastral=" + refcatastral + ", superficie=" + superficie + ", valor_catastral="
					+ valor_catastral + ", descripcion=" + descripcion + ", preciom2=" + preciom2 + ", numHabitaciones="
					+ numHabitaciones + ", vpo=" + vpo + ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
		}


	public int getNumHabitaciones() {
		return numHabitaciones;
	}


	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}


	public boolean isVpo() {
		return vpo;
	}


	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}


	public boolean isAtico() {
		return atico;
	}


	public void setAtico(boolean atico) {
		this.atico = atico;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public double calculaIBI() {
		double ibi= this.valor_catastral*Inmueble.coefUrbano;
		if(this.vpo) {
			ibi= ibi/2;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precio = this.preciom2*this.superficie;
		if(this.atico) {
			precio= precio*1.06;
		}
		if (!this.vpo && this.antiguedad<25) {
			precio=0;
		}
		return precio;
	}
	
}
