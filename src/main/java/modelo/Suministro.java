		package modelo;

import java.sql.Date;
import java.util.ArrayList;
import modelo.material.Material;
import modelo.material.ModeloMaterial;
import modelo.plantas.ModeloPlanta;
import modelo.plantas.Planta;
import modelo.proveedor.ModeloProveedor;
import modelo.proveedor.Proveedor;

public class Suministro {
	
	private int id_suministro;
	private int id_proveedor;
	private int id_planta;
	private int id_material;
	private String mes;
	private double cantidad_kg;
	private double emisiones_proyectadas;
	private ArrayList<Planta> plantas;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Material> materiales;
	
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

	public ArrayList<Planta> getPlantas() {
		ModeloPlanta modelo_planta = new ModeloPlanta();
		ArrayList<Planta> plantas = modelo_planta.getPlantas();
		return plantas;
	}

	public void setPlantas(ArrayList<Planta> plantas) {
		this.plantas = plantas;
	}

	public ArrayList<Proveedor> getProveedores() {
		ModeloProveedor modelo_proveedor = new ModeloProveedor();
		
		ArrayList<Proveedor> proveedores = modelo_proveedor.getProveedores(); 
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<Material> getMateriales() {
		ModeloMaterial modelo_material = new ModeloMaterial();
		ArrayList<Material> materiales = modelo_material.getMateriales();
		return materiales;
	}

	public void setMateriales(ArrayList<Material> materiales) {
		this.materiales = materiales;
	}

	@Override
	public String toString() {
		return "Suministro [id_suministro=" + id_suministro + ", id_proveedor=" + id_proveedor + ", id_planta="
				+ id_planta + ", id_material=" + id_material + ", mes=" + mes + ", cantidad_kg=" + cantidad_kg
				+ ", emisiones_proyectadas=" + emisiones_proyectadas + ", plantas=" + plantas + ", proveedores="
				+ proveedores + ", materiales=" + materiales + "]";
	}
	
	
	
}
