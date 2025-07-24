package com.distribuida.model;

import jakarta.persistence.*;

@Entity
@Table(name="factura_detalle")
public class FacturaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura_detalle")
    private int idFacturaDetalle;
    @Column(name = "cantidad")
    private int Cantidad;
    @Column(name = "subtotal")
    private Float Subtotal;

    @ManyToOne
    @JoinColumn(name="id_factura")
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private Libro libro;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int idFacturaDetalle, int cantidad, Float subtotal) {
        this.idFacturaDetalle = idFacturaDetalle;
        Cantidad = cantidad;
        Subtotal = subtotal;
        factura = factura;
        libro = libro;
    }

    public int getIdFacturaDetalle() {
        return idFacturaDetalle;
    }

    public void setIdFacturaDetalle(int idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Float subtotal) {
        Subtotal = subtotal;
    }

    //GETTER AND SETTER DE LAS DEPENDENCIAS

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    //GETTER AND SETTER DE LAS DEPENDENCIAS

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idFacturaDetalle=" + idFacturaDetalle +
                ", Cantidad=" + Cantidad +
                ", Subtotal=" + Subtotal +
                ", Factura=" + factura+
                ", Libro=" + libro+
                '}';
    }
}
