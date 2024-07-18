package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final StringProperty idPedido;
    private final StringProperty fechapedido;
    private final StringProperty nombreCliente;
    private final DoubleProperty totalAPagar;
    private final DoubleProperty subtotal;
    private final SimpleStringProperty producto;

    private static List<Pedido> listaPedido = new ArrayList<>();

    public Pedido(String idpedido, String fechapedido, String nombrecliente, double totalPagar, double subtotal, String producto) {
        this.idPedido = new SimpleStringProperty(idpedido);
        this.fechapedido = new SimpleStringProperty(fechapedido);
        this.nombreCliente = new SimpleStringProperty(nombrecliente);
        this.totalAPagar = new SimpleDoubleProperty(totalPagar);
        this.subtotal = new SimpleDoubleProperty(subtotal);
        this.producto = new SimpleStringProperty(producto);
    }

    public String getProducto() {
        return producto.get();
    }

    public SimpleStringProperty productoProperty() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto.set(producto);
    }

    public double getSubtotal() {
        return subtotal.get();
    }

    public DoubleProperty subtotalProperty() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal.set(subtotal);
    }

    public String getIdPedido() {
        return idPedido.get();
    }

    public StringProperty idPedidoProperty() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido.set(idPedido);
    }

    public String getFechapedido() {
        return fechapedido.get();
    }

    public StringProperty fechapedidoProperty() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.fechapedido.set(fechapedido);
    }

    public String getNombreCliente() {
        return nombreCliente.get();
    }

    public StringProperty nombreClienteProperty() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente.set(nombreCliente);
    }

    public double getTotalAPagar() {
        return totalAPagar.get();
    }

    public DoubleProperty totalAPagarProperty() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar.set(totalAPagar);
    }

    public static void agregarPedidoLista(Pedido pedido) {
        listaPedido.add(pedido);
    }

    public static List<Pedido> obtenerListaMenu() {
        return listaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", Fechapedido=" + fechapedido +
                ", NombreCliente=" + nombreCliente +
                ", TotalAPagar=" + totalAPagar +
                ", subtotal=" + subtotal +
                ", producto=" + producto +
                '}';
    }
}
