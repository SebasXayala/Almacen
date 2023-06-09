/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juans
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private int cantBodega;
    private int cantMinRequerida;
    private int cantMaxPermitida;

    public Producto(int codigo, String nombre, double precioCompra, double precioVenta, int cantBodega, int cantMinRequerida, int cantMaxPermitida) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantBodega = cantBodega;
        this.cantMinRequerida = cantMinRequerida;
        this.cantMaxPermitida = cantMaxPermitida;
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

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantBodega() {
        return cantBodega;
    }

    public void setCantBodega(int cantBodega) {
        this.cantBodega = cantBodega;
    }

    public int getCantMinRequerida() {
        return cantMinRequerida;
    }

    public void setCantMinRequerida(int cantMinRequerida) {
        this.cantMinRequerida = cantMinRequerida;
    }

    public int getCantMaxPermitida() {
        return cantMaxPermitida;
    }

    public void setCantMaxPermitida(int cantMaxPermitida) {
        this.cantMaxPermitida = cantMaxPermitida;
    }
    
    
    
}
