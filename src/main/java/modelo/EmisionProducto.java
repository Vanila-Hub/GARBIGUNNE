package modelo;

import java.sql.Date;

public class EmisionProducto {
    private int id_emision;
    private int id_producto;
    private int id_material;
    private double emision_generada;
    private Date fecha;

    public EmisionProducto() {
    }

    public EmisionProducto(int id_producto, int id_material, double emision_generada, Date fecha) {
    	super();
    }

    public int getId_emision() {
        return id_emision;
    }

    public void setId_emision(int id_emision) {
        this.id_emision = id_emision;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public double getEmision_generada() {
        return emision_generada;
    }

    public void setEmision_generada(double emision_generada) {
        this.emision_generada = emision_generada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "EmisionProducto [id_emision=" + id_emision + ", id_producto=" + id_producto + ", id_material="
                + id_material + ", emision_generada=" + emision_generada + ", fecha=" + fecha + "]";
    }
}
