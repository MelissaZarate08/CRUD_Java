package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Reporte {
    private final StringProperty FechaReporte;
    private final DoubleProperty TotalVentas;
    private final DoubleProperty TotalGastos;
    private final DoubleProperty Diferencia;

    private static List<Reporte> listaReportes = new ArrayList<>();


    public Reporte(String fechareporte, double totalventas, double totalgastos, double diferencia) {
        this.FechaReporte = new SimpleStringProperty(fechareporte);
        this.TotalVentas = new SimpleDoubleProperty(totalventas);
        this.TotalGastos = new SimpleDoubleProperty(totalgastos);
        this.Diferencia = new SimpleDoubleProperty(diferencia);
    }

    public String getFechaReporte() {
        return FechaReporte.get();
    }

    public StringProperty fechaReporteProperty() {
        return FechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.FechaReporte.set(fechaReporte);
    }

    public double getTotalVentas() {
        return TotalVentas.get();
    }

    public DoubleProperty totalVentasProperty() {
        return TotalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.TotalVentas.set(totalVentas);
    }

    public double getTotalGastos() {
        return TotalGastos.get();
    }

    public DoubleProperty totalGastosProperty() {
        return TotalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        this.TotalGastos.set(totalGastos);
    }

    public double getDiferencia() {
        return Diferencia.get();
    }

    public DoubleProperty diferenciaProperty() {
        return Diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.Diferencia.set(diferencia);
    }
    public static List<Reporte> obtenerListaReporte() {
        return listaReportes;
    }


    public static void agregarReporteLista(Reporte reporte) {
        listaReportes.add(reporte);
    }
}
