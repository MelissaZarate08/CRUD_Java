package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.List;

public class Gasto {
    private SimpleStringProperty idgastos;

    private SimpleStringProperty nombreDataTable;

    private SimpleDoubleProperty cantidadDataTable;

    private SimpleDoubleProperty precioDataTable;

    private SimpleStringProperty fechacompraDataTable;

    private static List<Gasto> listaGasto = new ArrayList<>();


    public Gasto(String idgastos, String nombreDataTable,double cantidadDataTable,double precioDataTable, String fechacompraDataTable) {
        this.idgastos = new SimpleStringProperty(idgastos);
        this.nombreDataTable = new SimpleStringProperty(nombreDataTable);
        this.cantidadDataTable = new SimpleDoubleProperty(cantidadDataTable);
        this.precioDataTable = new SimpleDoubleProperty(precioDataTable);
        this.fechacompraDataTable = new SimpleStringProperty(fechacompraDataTable);
    }

    public String getIdgastos() {
        return idgastos.get();
    }

    public SimpleStringProperty idgastosProperty() {
        return idgastos;
    }

    public void setIdgastos(String idgastos) {
        this.idgastos.set(idgastos);
    }

    public String getNombreDataTable() {
        return nombreDataTable.get();
    }

    public SimpleStringProperty nombreDataTableProperty() {
        return nombreDataTable;
    }

    public void setNombreDataTable(String nombreDataTable) {
        this.nombreDataTable.set(nombreDataTable);
    }

    public double getCantidadDataTable() {
        return cantidadDataTable.get();
    }

    public SimpleDoubleProperty cantidadDataTableProperty() {
        return cantidadDataTable;
    }

    public void setCantidadDataTable(double cantidadDataTable) {
        this.cantidadDataTable.set(cantidadDataTable);
    }

    public double getPrecioDataTable() {
        return precioDataTable.get();
    }

    public SimpleDoubleProperty precioDataTableProperty() {
        return precioDataTable;
    }

    public void setPrecioDataTable(double precioDataTable) {
        this.precioDataTable.set(precioDataTable);
    }

    public String getFechacompraDataTable() {
        return fechacompraDataTable.get();
    }

    public SimpleStringProperty fechacompraDataTableProperty() {
        return fechacompraDataTable;
    }

    public void setFechacompraDataTable(String fechacompraDataTable) {
        this.fechacompraDataTable.set(fechacompraDataTable);
    }

    public static void agregarGastoLista(Gasto gasto) {
        listaGasto.add(gasto);
    }

    public static List<Gasto> obtenerListaGasto() {
        return listaGasto;
    }

}
