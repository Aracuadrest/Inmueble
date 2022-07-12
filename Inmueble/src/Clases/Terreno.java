package Clases;

public class Terreno extends Inmueble {
	
	private boolean urbano;
	private double ha;
	private double precio_ha;
	
	

	public Terreno() {
		this.urbano = true;
		this.ha = 0;
		this.precio_ha = 0;
	}
	
	

	public Terreno(String refcatastral, double superficie, double valor_catastral, String descripcion, double preciom2,
			boolean urbano, double ha, double precio_ha) {
		super(refcatastral, superficie, valor_catastral, descripcion, preciom2);
		this.urbano = urbano;
		this.ha = ha;
		this.precio_ha = precio_ha;
	}



	@Override
	public String toString() {
		return "Terreno [refcatastral=" + refcatastral + ", superficie=" + superficie + ", valor_catastral="
				+ valor_catastral + ", descripcion=" + descripcion + ", preciom2=" + preciom2 + ", urbano=" + urbano
				+ ", ha=" + ha + ", precio_ha=" + precio_ha + "]";
	}



	public boolean isUrbano() {
		return urbano;
	}



	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}



	public double getHa() {
		return ha;
	}



	public void setHa(double ha) {
		this.ha = ha;
	}



	public double getPrecio_ha() {
		return precio_ha;
	}



	public void setPrecio_ha(double precio_ha) {
		this.precio_ha = precio_ha;
	}



	@Override
	public double calculaIBI() {
		double ibi= 0;
		if (this.urbano) {
			ibi= this.valor_catastral*Inmueble.coefUrbano;
		}else {
			ibi= this.valor_catastral*Inmueble.coefRustico;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

}
