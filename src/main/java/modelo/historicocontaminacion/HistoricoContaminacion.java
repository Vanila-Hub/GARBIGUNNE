package modelo.historicocontaminacion;

import modelo.material.Material;
import modelo.plantas.Planta;

public class HistoricoContaminacion {
    private int id_Historico;
    private String fecha;
    private int id_Planta;
    private double porcentajeContaminacion;
    private double emisionTotal;
    private String tipo_material;
    private int id_Material;
    
    private Planta planta;
    private Material material;
    
    public HistoricoContaminacion() {
		// TODO Auto-generated constructor stub
	}
  

    public int getId_Historico() {
		return id_Historico;
	}


	public void setId_Historico(int id_Historico) {
		this.id_Historico = id_Historico;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getId_Planta() {
		return id_Planta;
	}


	public void setId_Planta(int id_Planta) {
		this.id_Planta = id_Planta;
	}


	public double getEmisionTotal() {
		return emisionTotal;
	}


	public void setEmisionTotal(double emisionTotal) {
		this.emisionTotal = emisionTotal;
	}


	public String getTipo_material() {
		return tipo_material;
	}


	public void setTipo_material(String tipo_material) {
		this.tipo_material = tipo_material;
	}


	public int getId_Material() {
		return id_Material;
	}


	public void setId_Material(int id_Material) {
		this.id_Material = id_Material;
	}


	public double getPorcentajeContaminacion() {
		return porcentajeContaminacion;
	}


	public void setPorcentajeContaminacion(double porcentajeContaminacion) {
        this.porcentajeContaminacion = porcentajeContaminacion;
    }

	

	public Planta getPlanta() {
		return planta;
	}


	public void setPlanta(Planta planta) {
		this.planta = planta;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "HistoricoContaminacion [id_Historico=" + id_Historico + ", fecha=" + fecha + ", id_Planta=" + id_Planta
				+ ", porcentajeContaminacion=" + porcentajeContaminacion + ", emisionTotal=" + emisionTotal
				+ ", tipo_material=" + tipo_material + ", id_Material=" + id_Material + ", planta=" + planta
				+ ", material=" + material + "]";
	}
	
	
}
