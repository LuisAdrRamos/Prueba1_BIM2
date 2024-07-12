package Productos_Personales;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class productos {
    String cod_product;
    String nombre;
    String descripcion;
    String categoria;
    int cantidad;
    double precio;

    public productos() {
    }

    public productos(String cod_product, String nombre, String descripcion, String categoria, int cantidad, double precio) {
        this.cod_product = cod_product;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCod_product() {
        return this.cod_product;
    }

    public void setCod_product(String cod_product) {
        this.cod_product = cod_product;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

