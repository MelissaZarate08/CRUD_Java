package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private final StringProperty IdVenta;
    private final StringProperty fechaVenta;
    private final DoubleProperty totalVenta;

    private static List<Venta> listaVenta = new ArrayList<>();

    public Venta(String idVenta, String fechaVenta, double totalVenta) {
        this.IdVenta = new SimpleStringProperty(idVenta);
        this.fechaVenta = new SimpleStringProperty(fechaVenta);
        this.totalVenta = new SimpleDoubleProperty(totalVenta);
    }

    public String getIdVenta() {
        return IdVenta.get();
    }

    public StringProperty idVentaProperty() {
        return IdVenta;
    }

    public void setIdVenta(String idVenta) {
        this.IdVenta.set(idVenta);
    }

    public String getFechaVenta() {
        return fechaVenta.get();
    }

    public StringProperty fechaVentaProperty() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta.set(fechaVenta);
    }

    public double getTotalVenta() {
        return totalVenta.get();
    }

    public DoubleProperty totalVentaProperty() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta.set(totalVenta);
    }

    public static void agregarVentaLista(Venta venta) {
        listaVenta.add(venta);
    }

    public static List<Venta> obtenerListaVenta() {
        return listaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "IdVenta=" + IdVenta +
                ", FechaVenta=" + fechaVenta +
                ", TotalVenta=" + totalVenta +
                '}';
    }
    private Reporte reporte;
    private Empleado empleado;

    private Pedido pedido;
}
