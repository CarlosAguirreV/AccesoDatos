package catalogoProductos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Clase POJO Articulo.
 * @author Carlos
 */
public class Articulo implements Serializable {

    private String nombreFoto;
    private String descripcion;
    private BigDecimal precio;

    public Articulo(String nombreFoto, String descripcion, BigDecimal precio) {
        this.nombreFoto = nombreFoto;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}
