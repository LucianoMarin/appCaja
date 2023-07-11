/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Luciano
 */
public class Producto {

    String codigo;
    String descripcion;
    int cantidad;
    float precio_neto;
    float precio_bruto;
    String fecha_ingreso;

    public Producto() {

    }

    public Producto(String codigo, String descripcion, int cantidad, float precio_neto, float precio_bruto, String fecha_ingreso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_neto = precio_neto;
        this.precio_bruto = precio_bruto;
        this.fecha_ingreso = fecha_ingreso;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public String getCodigo() {
        return this.codigo;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public String getDescripcion() {

        return this.descripcion;
    }

    public void setPrecioNeto(float precio_neto) {
        this.precio_neto = precio_neto;

    }

    public float getPrecio_neto() {

        return this.precio_neto;

    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;

    }

    public String getFecha_ingreso() {

        return this.fecha_ingreso;
    }

    public float getPrecio_bruto() {
        return precio_bruto;
    }

    public void setPrecio_bruto(float precio_bruto) {
        this.precio_bruto = precio_bruto;
    }

}
