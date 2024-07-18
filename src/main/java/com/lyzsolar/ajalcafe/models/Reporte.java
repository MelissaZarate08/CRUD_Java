package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Reporte {
    private final StringProperty fechaReporte;
    private final DoubleProperty totalVentas;
    private final DoubleProperty totalGastos;
    private final DoubleProperty diferencia;


    private static List<Reporte> listaReportes = new ArrayList<>();


    public Reporte(String fechareporte, double totalventas, double totalgastos, double diferencia) {
        this.fechaReporte = new SimpleStringProperty(fechareporte);
        this.totalVentas = new SimpleDoubleProperty(totalventas);
        this.totalGastos = new SimpleDoubleProperty(totalgastos);
        this.diferencia = new SimpleDoubleProperty(diferencia);
    }

    public String getFechaReporte() {
        return fechaReporte.get();
    }

    public StringProperty fechaReporteProperty() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte.set(fechaReporte);
    }

    public double getTotalVentas() {
        return totalVentas.get();
    }

    public DoubleProperty totalVentasProperty() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas.set(totalVentas);
    }

    public double getTotalGastos() {
        return totalGastos.get();
    }

    public DoubleProperty totalGastosProperty() {
        return totalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        this.totalGastos.set(totalGastos);
    }

    public double getDiferencia() {
        return diferencia.get();
    }

    public DoubleProperty diferenciaProperty() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia.set(diferencia);
    }
    public static List<Reporte> obtenerListaReporte() {
        return listaReportes;
    }


    public static void agregarReporteLista(Reporte reporte) {
        listaReportes.add(reporte);
    }
    private Gasto gasto;
}
