package com.lyzsolar.ajalcafe.models;

import java.util.ArrayList;

public class Gerencia {
    protected static ArrayList <Producto> insumos = new ArrayList<>();
    public static boolean addProducto(Producto p1){return insumos.add(p1);}
    public static ArrayList<Producto> getInsumos() {
        return insumos;
    }

}
