package Clases;

import java.util.Objects;

public abstract class Inmueble {

	protected String refcatastral;
	protected double superficie;
	protected double valor_catastral;
	protected String descripcion;
	protected double preciom2;
	
	public static final double coefUrbano = 0.85;
	public static final double coefRustico=0.45;
	
		
	public Inmueble() {
		this.refcatastral = null;
		this.superficie = 0;
		this.valor_catastral = 0;
		this.descripcion = null;
		this.preciom2 = 0;
	}


	public Inmueble(String refcatastral, double superficie, 
			double valor_catastral, String descripcion,
			double preciom2) {
		this.refcatastral = refcatastral;
		setSuperficie(superficie);
		this.valor_catastral = valor_catastral;
		this.descripcion = descripcion;
		setPreciom2(preciom2);
		
	}


	public Inmueble(Inmueble i) {
		this.refcatastral = i.refcatastral;
		this.superficie = i.superficie;
		this.valor_catastral = i.valor_catastral;
		this.descripcion = i.descripcion;
		this.preciom2 = i.preciom2;
		
	}

	public String getRefcatastral() {
		return refcatastral;
	}


	public void setRefcatastral(String refcatastral) {
		this.refcatastral = refcatastral;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		if(superficie<0) {
		this.superficie = 0;
		}else {
			this.superficie=superficie;
		}
		
	}


	public double getValor_catastral() {
		return valor_catastral;
	}


	public void setValor_catastral(double valor_catastral) {
		this.valor_catastral = valor_catastral;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPreciom2() {
		return preciom2;
	}


	public void setPreciom2(double preciom2) {
		if(preciom2<0) {
			this.preciom2 = 0;
			}else {
				this.preciom2=preciom2;
			}
	}


	@Override
	public String toString() {
		return "Inmueble [refcatastral=" + refcatastral + ", superficie=" + superficie + ", valor_catastral="
				+ valor_catastral + ", descripcion=" + descripcion + ", preciom2=" + preciom2 + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(refcatastral);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(refcatastral, other.refcatastral);
	}
	
	public abstract double calculaIBI();
	public abstract double calculaPrecioVenta();
	
	
	
	
	
}
