package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private final StringProperty IdVenta;
    private final StringProperty FechaVenta;
    private final DoubleProperty TotalVenta;

    private static List<Venta> listaVenta = new ArrayList<>();

    public Venta(String idVenta, String fechaVenta, double totalVenta) {
        this.IdVenta = new SimpleStringProperty(idVenta);
        this.FechaVenta = new SimpleStringProperty(fechaVenta);
        this.TotalVenta = new SimpleDoubleProperty(totalVenta);
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
        return FechaVenta.get();
    }

    public StringProperty fechaVentaProperty() {
        return FechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.FechaVenta.set(fechaVenta);
    }

    public double getTotalVenta() {
        return TotalVenta.get();
    }

    public DoubleProperty totalVentaProperty() {
        return TotalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.TotalVenta.set(totalVenta);
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
                ", FechaVenta=" + FechaVenta +
                ", TotalVenta=" + TotalVenta +
                '}';
    }
}
