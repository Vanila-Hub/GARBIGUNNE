package modelo.plantas;

import java.util.ArrayList;

import modelo.material.Material;

public class Planta {
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Material> materialesSuministrados = new  ArrayList<Material>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public ArrayList<Material> getMaterialesSuministrados() {
		return materialesSuministrados;
	}
	public void setMaterialesSuministrados(ArrayList<Material> materialesSuministrados) {
		this.materialesSuministrados = materialesSuministrados;
	}
	
	@Override
	public String toString() {
		return "Planta [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", materialesSuministrados=" + materialesSuministrados + "]";
	}
	
}
