package modelo;

public class Material {
	private int id_material;
	private String tipo;
	private int emision_kg;
	
	public int getId_material() {
		return id_material;
	}
	public void setId_material(int id_material) {
		this.id_material = id_material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEmision_kg() {
		return emision_kg;
	}
	public void setEmision_kg(int emision_kg) {
		this.emision_kg = emision_kg;
	}
	
	@Override
	public String toString() {
		return "Material [id_material=" + id_material + ", tipo=" + tipo + ", emision_kg=" + emision_kg + "]";
	}
}
