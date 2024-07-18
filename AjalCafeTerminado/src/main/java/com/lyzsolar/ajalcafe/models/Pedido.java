package com.lyzsolar.ajalcafe.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final StringProperty idPedido;
    private final StringProperty Fechapedido;
    private final StringProperty NombreCliente;
    private final DoubleProperty TotalAPagar;
    private final DoubleProperty subtotal;
    private final SimpleStringProperty producto;

    private static List<Pedido> listaPedido = new ArrayList<>();

    public Pedido(String idpedido, String fechapedido, String nombrecliente, double totalPagar, double subtotal, String producto) {
        this.idPedido = new SimpleStringProperty(idpedido);
        this.Fechapedido = new SimpleStringProperty(fechapedido);
        this.NombreCliente = new SimpleStringProperty(nombrecliente);
        this.TotalAPagar = new SimpleDoubleProperty(totalPagar);
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
        return Fechapedido.get();
    }

    public StringProperty fechapedidoProperty() {
        return Fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.Fechapedido.set(fechapedido);
    }

    public String getNombreCliente() {
        return NombreCliente.get();
    }

    public StringProperty nombreClienteProperty() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.NombreCliente.set(nombreCliente);
    }

    public double getTotalAPagar() {
        return TotalAPagar.get();
    }

    public DoubleProperty totalAPagarProperty() {
        return TotalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.TotalAPagar.set(totalAPagar);
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
                ", Fechapedido=" + Fechapedido +
                ", NombreCliente=" + NombreCliente +
                ", TotalAPagar=" + TotalAPagar +
                ", subtotal=" + subtotal +
                ", producto=" + producto +
                '}';
    }
}
