		package modelo;

import java.sql.Date;

public class Suministro {
	
	private int id_suministro;
	private int id_proveedor;
	private int id_planta;
	private int id_material;
	private String mes;
	private double cantidad_kg;
	private double emisiones_proyectadas;
	
	public Suministro() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_suministro() {
		return id_suministro;
	}

	public void setId_suministro(int id_suministro) {
		this.id_suministro = id_suministro;
	}
	
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public int getId_planta() {
		return id_planta;
	}
	public void setId_planta(int id_planta) {
		this.id_planta = id_planta;
	}
	public int getId_material() {
		return id_material;
	}
	public void setId_material(int id_material) {
		this.id_material = id_material;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public double getCantidad_kg() {
		return cantidad_kg;
	}
	public void setCantidad_kg(double cantidad_kg) {
		this.cantidad_kg = cantidad_kg;
	}
	public double getEmisiones_proyectadas() {
		return emisiones_proyectadas;
	}
	public void setEmisiones_proyectadas(double Emisiones_esperadas) {
		this.emisiones_proyectadas = Emisiones_esperadas;
	}

	@Override
	public String toString() {
		return "Suministro [id_suministro=" + id_suministro + ", id_proveedor=" + id_proveedor + ", id_planta="
				+ id_planta + ", id_material=" + id_material + ", mes=" + mes + ", cantidad_kg=" + cantidad_kg
				+ ", emisiones_proyectadas=" + emisiones_proyectadas + "]";
	}
	
	
	
}
