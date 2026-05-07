/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author GiselleAcostaRicardo
 */
public class Ingreso {
    
    private int id;
    private int usuarioId;
    private String usuarioNombre;
    private int personaId;
    private String personaNombre;
    private String tipoComprobante;
    private String serieCromprobante;
    private String numComprobante;
    private Date fecha;
    private double impuesto;
    private double total;
    private String estado;
    private List<DetalleIngreso> detalles;

    public Ingreso() {
    }

    public Ingreso(int id, int usuarioId, String usuarioNombre, int personaId, String personaNombre, String tipoComprobante, String serieCromprobante, String numComprobante, Date fecha, double impuesto, double total, String estado, List<DetalleIngreso> detalles) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.personaId = personaId;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieCromprobante = serieCromprobante;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
        this.detalles = detalles;
    }

    public Ingreso(int id, int usuarioId, String usuarioNombre, int personaId, String personaNombre, String tipoComprobante, String serieCromprobante, String numComprobante, Date fecha, double impuesto, double total, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.personaId = personaId;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieCromprobante = serieCromprobante;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
    }
    
    

  
    
    
    
}
