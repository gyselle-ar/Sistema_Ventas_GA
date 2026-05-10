/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GiselleAcostaRicardo
 */
public class DetalleIngreso {
    
    private int id;
    private int ingresoId;
    private int articuloId;
    private String articuloCodigo;
    private String articuloNombre;
    private int cantidad;
    private double precio;
    private double subTotal;

    public DetalleIngreso() {
    }

    public DetalleIngreso(int id, int ingresoId, int articuloId, String articuloCodigo, String articuloNombre, int cantidad, double precio, double subTotal) {
        this.id = id;
        this.ingresoId = ingresoId;
        this.articuloId = articuloId;
        this.articuloCodigo = articuloCodigo;
        this.articuloNombre = articuloNombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
    }

    public DetalleIngreso(int articuloId, int cantidad, double precio) {
        this.articuloId = articuloId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public DetalleIngreso(int articuloId, String articuloCodigo, String articuloNombre, int cantidad, double precio, double subTotal) {
        this.articuloId = articuloId;
        this.articuloCodigo = articuloCodigo;
        this.articuloNombre = articuloNombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotal = subTotal;
    }
    
    
    
}
