package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.*;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private final IntegerProperty idProducto;
    private final StringProperty nombreProducto;
    private final StringProperty categoria;
    private final StringProperty fechacaducidad;
    private final StringProperty fechacompra;
    private final IntegerProperty cantidadProducto;
    private final StringProperty unidad;
    private final DoubleProperty precioProducto;
    private final DoubleProperty total;

    private static List<Producto> listaProductos = new ArrayList<>();

    public Producto(Integer idProducto, String nombreProducto, String categoria, String fechacaducidad, Integer cantidadProducto, String unidad, double precioProducto, double total, String fechacompra) {
        this.idProducto = new SimpleIntegerProperty(idProducto);
        this.nombreProducto = new SimpleStringProperty(nombreProducto);
        this.categoria = new SimpleStringProperty(categoria);
        this.fechacaducidad = new SimpleStringProperty(fechacaducidad);
        this.cantidadProducto = new SimpleIntegerProperty(cantidadProducto);
        this.unidad = new SimpleStringProperty(unidad);
        this.precioProducto = new SimpleDoubleProperty(precioProducto);
        this.total = new SimpleDoubleProperty(total);
        this.fechacompra = new SimpleStringProperty(fechacompra);
    }


    public Integer getIdProducto() {
        return idProducto.get();
    }

    public IntegerProperty idProductoProperty() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto.set(idProducto);
    }

    public StringProperty nombreProductoProperty() {
        return nombreProducto;
    }

    public StringProperty categoriaProperty() {
        return categoria;
    }

    public IntegerProperty cantidadProductoProperty() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto.set(cantidadProducto);
    }

    public StringProperty unidadProperty() {
        return unidad;
    }

    public DoubleProperty precioProductoProperty() {
        return precioProducto;
    }
    public DoubleProperty totalProperty() {
        return total;
    }

    public StringProperty fechacaducidad() {
        return fechacaducidad;
    }

    public StringProperty fechacaducidadProperty() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad.set(fechacaducidad);
    }

    public StringProperty fechacompra() {
        return fechacompra;
    }

    public StringProperty fechacompraProperty() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra.set(fechacompra);
    }

    public static void agregarProductoLista(Producto producto) {
        listaProductos.add(producto);
    }

    public static List<Producto> obtenerListaProductos() {
        return listaProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fechacaducidad=" + fechacaducidad +
                ", cantidadProducto=" + cantidadProducto +
                ", unidad='" + unidad + '\'' +
                ", precioProducto=" + precioProducto +
                ", total=" + total +
                ", fechacompra=" + fechacompra +
                '}';
    }
    private Menu menu;
}
