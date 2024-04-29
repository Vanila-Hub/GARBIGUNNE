package modelo.historicocontaminacion;

public class HistoricoContaminacion {
    private int id_Historico;
    private String fecha;
    private int id_Planta;
    private int id_Material;
    private double porcentajeContaminacion;

    public HistoricoContaminacion() {
		// TODO Auto-generated constructor stub
	}
    
    public int getIdHistorico() {
        return id_Historico;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdPlanta() {
        return id_Planta;
    }

    public int getIdMaterial() {
        return id_Material;
    }

    public double getPorcentajeContaminacion() {
        return porcentajeContaminacion;
    }

    public void setIdHistorico(int idHistorico) {
        this.id_Historico = idHistorico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdPlanta(int idPlanta) {
        this.id_Planta = idPlanta;
    }

    public void setIdMaterial(int idMaterial) {
        this.id_Material = idMaterial;
    }

    public void setPorcentajeContaminacion(double porcentajeContaminacion) {
        this.porcentajeContaminacion = porcentajeContaminacion;
    }
}
