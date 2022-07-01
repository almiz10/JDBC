
package tienda.entidades;

import tienda.persistencia.DAO;

public class Producto{

private int codigo;
private String nombre; 
private Double precio;
private int codigoFrabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, Double precio, int codigoFrabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFrabricante = codigoFrabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigoFrabricante() {
        return codigoFrabricante;
    }

    public void setCodigoFrabricante(int codigoFrabricante) {
        this.codigoFrabricante = codigoFrabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigoFrabricante=" + codigoFrabricante + '}';
    }

    


    
}
